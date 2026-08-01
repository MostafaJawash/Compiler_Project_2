package python.interpreter;

import python.ast.ASTNode;
import python.ast.Program;
import python.ast.Statement;
import python.ast.Access.AccessPart;
import python.ast.Access.FieldAccess;
import python.ast.Access.IndexAccess;
import python.ast.CompoundStmt.DecoratorNode;
import python.ast.CompoundStmt.ElseIfNode;
import python.ast.CompoundStmt.ForStmtNode;
import python.ast.CompoundStmt.FunDefNode;
import python.ast.CompoundStmt.IfStmtNode;
import python.ast.CompoundStmt.WhileStmtNode;
import python.ast.Expression.Array;
import python.ast.Expression.Atom;
import python.ast.Expression.CallStmt;
import python.ast.Expression.ConcatStr;
import python.ast.Expression.Dictionary;
import python.ast.Expression.Expr;
import python.ast.Expression.ExprLogic;
import python.ast.Expression.ExprMath;
import python.ast.Expression.IdentifierNode;
import python.ast.Expression.KeyValue;
import python.ast.SimpleStmt.AssignmentNode;
import python.ast.SimpleStmt.BreakNode;
import python.ast.SimpleStmt.CallNode;
import python.ast.SimpleStmt.ContinueNode;
import python.ast.SimpleStmt.DelNode;
import python.ast.SimpleStmt.GlobalNode;
import python.ast.SimpleStmt.ImportNode;
import python.ast.SimpleStmt.Pair;
import python.ast.SimpleStmt.PassNode;
import python.ast.SimpleStmt.ReturnNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Phase 2 / Step 1: walks the Python AST (post-Semantic-Analysis, so no semantic
 * errors are assumed) and ACTUALLY EXECUTES it - real arithmetic, real string
 * concatenation, real lists/maps, real control flow - producing one {@link Context}
 * per render_template(...) call it evaluates.
 *
 * Deliberately self-contained: no SymbolTable/HtmlSymbolTable import anywhere.
 * Its own {@link Scope} maps name -> real Java value (not name -> type, which is
 * what the semantic checker's Scope does - the two are unrelated by design).
 *
 * Scope of this pass ("just enough" for the typical Flask route pattern):
 *  - Flask/request internals (Flask(...), request, redirect(...), url_for(...))
 *    are stubbed to a harmless null rather than modeled for real.
 *  - Only zero-parameter @app.route(...)-decorated functions are auto-invoked
 *    (there is no real HTTP request to supply path parameters like <int:id>).
 *  - Cross-file imports (`from products import products`) are not resolved -
 *    ImportNode is a no-op. If a route ends up needing such a name, that one
 *    route is skipped with a recorded warning instead of aborting the whole run.
 *  - Unrecognized method calls with side effects we don't model (file.save(...),
 *    db cursor calls, ...) are treated as no-ops; they don't affect Context data.
 */
public class PythonInterpreter {

    private static final int MAX_WHILE_ITERATIONS = 1_000_000;

    // Calls to these names are stubbed to null instead of "undefined function".
    private static final Set<String> STUBBED_CALLABLES = Set.of(
            "Flask", "flask", "request", "redirect", "url_for", "static"
    );
    // Bare references to these names resolve to null instead of "undefined variable"
    // when nothing has bound them yet (e.g. `if request.method == "POST"`).
    private static final Set<String> STUBBED_NAMES = Set.of(
            "request", "redirect", "url_for", "static", "Flask", "flask"
    );

    private final Scope globalScope = new Scope(null);
    private final Map<String, FunDefNode> functions = new HashMap<>();
    private final List<FunDefNode> routeFunctions = new ArrayList<>();
    private final List<Context> renderedContexts = new ArrayList<>();
    private final List<String> warnings = new ArrayList<>();

    /** Runs the whole program and returns one Context per render_template(...) call encountered. */
    public List<Context> run(Program program) {
        if (program == null) throw new PythonInterpreterException("Cannot interpret a null Program", null);

        renderedContexts.clear();
        warnings.clear();
        functions.clear();
        routeFunctions.clear();

        for (Statement stmt : program.getChildren()) {
            executeStatement(stmt, globalScope);
        }

        for (FunDefNode route : new ArrayList<>(routeFunctions)) {
            try {
                invokeRouteFunction(route);
            } catch (PythonInterpreterException e) {
                warnings.add("Skipped route '" + route.nameFun.root + "': " + e.getMessage());
            }
        }

        return new ArrayList<>(renderedContexts);
    }

    /** Non-fatal issues encountered while auto-invoking route handlers (e.g. unmodeled cross-file imports). */
    public List<String> getWarnings() {
        return new ArrayList<>(warnings);
    }

    private void invokeRouteFunction(FunDefNode route) {
        Scope functionScope = new Scope(globalScope);
        try {
            executeBlock(route.body, functionScope);
        } catch (ReturnSignal ignored) {
            // normal end of a route handler
        }
    }

    // ===================== Statements =====================

    private void executeBlock(List<Statement> body, Scope scope) {
        if (body == null) return;
        for (Statement stmt : body) executeStatement(stmt, scope);
    }

    private void executeStatement(Statement stmt, Scope scope) {
        if (stmt == null) return;

        if (stmt instanceof ImportNode) return; // cross-module contents are not modeled in this pass
        if (stmt instanceof PassNode) return;

        if (stmt instanceof AssignmentNode assignment) { executeAssignment(assignment, scope); return; }
        if (stmt instanceof CallNode callNode) { executeCallNode(callNode, scope); return; }

        if (stmt instanceof ReturnNode returnNode) {
            Object value = evaluateReturnValues(returnNode, scope);
            throw new ReturnSignal(value);
        }
        if (stmt instanceof BreakNode) throw BreakSignal.INSTANCE;
        if (stmt instanceof ContinueNode) throw ContinueSignal.INSTANCE;

        if (stmt instanceof DelNode delNode) { executeDel(delNode, scope); return; }
        if (stmt instanceof GlobalNode globalNode) {
            for (IdentifierNode id : globalNode.getNames()) scope.declareGlobal(id.root);
            return;
        }

        if (stmt instanceof FunDefNode funDef) { registerFunction(funDef, false); return; }
        if (stmt instanceof DecoratorNode decorator) {
            registerFunction(decorator.fun, isRouteDecorator(decorator.nameDec));
            return;
        }

        if (stmt instanceof IfStmtNode ifStmt) { executeIf(ifStmt, scope); return; }
        if (stmt instanceof ForStmtNode forStmt) { executeFor(forStmt, scope); return; }
        if (stmt instanceof WhileStmtNode whileStmt) { executeWhile(whileStmt, scope); return; }

        throw new PythonInterpreterException("Unsupported statement type: " + stmt.getClass().getSimpleName(), stmt);
    }

    private Object evaluateReturnValues(ReturnNode returnNode, Scope scope) {
        if (returnNode.values == null || returnNode.values.isEmpty()) return null;
        if (returnNode.values.size() == 1) return evaluate(returnNode.values.get(0), scope);
        List<Object> multi = new ArrayList<>();
        for (Expr e : returnNode.values) multi.add(evaluate(e, scope));
        return multi;
    }

    private void executeAssignment(AssignmentNode assignment, Scope scope) {
        if (assignment.operator == AssignmentNode.Operator.ASSIGN) {
            Object value = evaluate(assignment.value, scope);
            for (IdentifierNode target : assignment.targets) assignInto(target, value, scope);
            return;
        }
        // Augmented assignment: grammar guarantees a single target.
        IdentifierNode target = assignment.targets.get(0);
        Object oldValue = evaluateIdentifier(target, scope);
        Object rhs = evaluate(assignment.value, scope);
        Object result = applyAugmentedOperator(assignment.operator, oldValue, rhs, assignment);
        assignInto(target, result, scope);
    }

    private void executeDel(DelNode delNode, Scope scope) {
        for (IdentifierNode target : delNode.getNames()) {
            if (target.parts == null || target.parts.isEmpty()) {
                scope.remove(target.root);
                continue;
            }
            Object container = resolveVariable(target.root, target, scope);
            for (int i = 0; i < target.parts.size() - 1; i++) {
                container = applyAccessPart(container, target.parts.get(i), scope, target);
            }
            AccessPart last = target.parts.get(target.parts.size() - 1);
            if (last instanceof IndexAccess indexAccess && container instanceof List<?> list) {
                int index = ((Number) resolveIndexKey(indexAccess, scope)).intValue();
                if (index >= 0 && index < list.size()) ((List<?>) list).remove(index);
            } else if (last instanceof FieldAccess fieldAccess && container instanceof Map<?, ?> map) {
                ((Map<?, ?>) map).remove(fieldAccess.field);
            }
            // Anything else (e.g. deleting from a container type we don't model) is a harmless no-op.
        }
    }

    private void registerFunction(FunDefNode funDef, boolean isRoute) {
        functions.put(funDef.nameFun.root, funDef);
        boolean zeroParams = funDef.arguments == null || funDef.arguments.isEmpty();
        if (isRoute && zeroParams) {
            routeFunctions.add(funDef);
        } else if (isRoute) {
            warnings.add("Route '" + funDef.nameFun.root + "' takes parameters - not auto-invoked (no real HTTP request available)");
        }
    }

    private boolean isRouteDecorator(IdentifierNode nameDec) {
        if (nameDec == null) return false;
        String lastSegment = nameDec.root;
        if (nameDec.parts != null) {
            for (AccessPart part : nameDec.parts) {
                if (part instanceof FieldAccess fieldAccess) lastSegment = fieldAccess.field;
            }
        }
        return "route".equals(lastSegment);
    }

    private void executeIf(IfStmtNode ifStmt, Scope scope) {
        if (truthy(evaluate(ifStmt.condition, scope))) {
            executeBlock(ifStmt.body, scope);
            return;
        }
        if (ifStmt.else_if_stmt != null) {
            for (ElseIfNode elif : ifStmt.else_if_stmt) {
                if (truthy(evaluate(elif.condition, scope))) {
                    executeBlock(elif.body, scope);
                    return;
                }
            }
        }
        if (ifStmt.else_stmt != null) executeBlock(ifStmt.else_stmt.body, scope);
    }

    private void executeFor(ForStmtNode forStmt, Scope scope) {
        Object iterableValue = evaluate(forStmt.inExpr, scope);
        for (Object item : toIterable(iterableValue, forStmt)) {
            bindForTargets(forStmt.var, item, scope);
            try {
                executeBlock(forStmt.body, scope);
            } catch (BreakSignal stop) {
                break;
            } catch (ContinueSignal skip) {
                // fall through to next iteration
            }
        }
    }

    private void executeWhile(WhileStmtNode whileStmt, Scope scope) {
        int guard = 0;
        while (truthy(evaluate(whileStmt.condition, scope))) {
            if (++guard > MAX_WHILE_ITERATIONS) {
                throw new PythonInterpreterException("while loop exceeded " + MAX_WHILE_ITERATIONS + " iterations (likely infinite loop)", whileStmt);
            }
            try {
                executeBlock(whileStmt.body, scope);
            } catch (BreakSignal stop) {
                break;
            } catch (ContinueSignal skip) {
                // fall through to next iteration
            }
        }
    }

    private void executeCallNode(CallNode callNode, Scope scope) {
        if (callNode.ide != null) {
            executeMethodCall(callNode.ide, callNode.callNode, scope);
        } else {
            evaluateCall(callNode.callNode, scope); // statement-level call, return value discarded
        }
    }

    @SuppressWarnings("unchecked")
    private void executeMethodCall(IdentifierNode receiverId, CallStmt call, Scope scope) {
        Object receiver = evaluateIdentifier(receiverId, scope);
        String method = call.nameCall.root;

        if ("append".equals(method) && receiver instanceof List<?>) {
            Object arg = call.arguments.isEmpty() ? null : evaluateArgumentValue(call.arguments.get(0), scope);
            ((List<Object>) receiver).add(arg);
            return;
        }
        // Any other method call (file.save(...), conn.commit(), c.execute(...), ...) is an external
        // side effect this interpreter doesn't model. Treated as a no-op: it doesn't affect Context data.
    }

    // ===================== Expressions =====================

    private Object evaluate(Expr expr, Scope scope) {
        if (expr == null) return null;
        if (expr instanceof Atom atom) return evaluateAtom(atom);
        if (expr instanceof IdentifierNode id) return evaluateIdentifier(id, scope);
        if (expr instanceof ExprMath math) return evaluateMath(math, scope);
        if (expr instanceof ExprLogic logic) return evaluateLogic(logic, scope);
        if (expr instanceof ConcatStr concat) return evaluateConcat(concat, scope);
        if (expr instanceof Array array) return evaluateArray(array, scope);
        if (expr instanceof Dictionary dictionary) return evaluateDictionary(dictionary, scope);
        if (expr instanceof CallStmt call) return evaluateCall(call, scope);
        throw new PythonInterpreterException("Cannot evaluate expression of type " + expr.getClass().getSimpleName(), expr);
    }

    private Object evaluateAtom(Atom atom) {
        Object value = atom.object;
        if (value instanceof String s) return stripPythonStringLiteral(s);
        return value; // Integer/Double/Boolean/null are already clean
    }

    private Object evaluateIdentifier(IdentifierNode id, Scope scope) {
        Object value = resolveVariable(id.root, id, scope);
        if (id.parts != null) {
            for (AccessPart part : id.parts) value = applyAccessPart(value, part, scope, id);
        }
        return value;
    }

    private Object resolveVariable(String name, ASTNode node, Scope scope) {
        if (scope.has(name)) return scope.get(name);
        if (STUBBED_NAMES.contains(name)) return null;
        throw new PythonInterpreterException("undefined variable '" + name + "'", node);
    }

    private Object applyAccessPart(Object base, AccessPart part, Scope scope, ASTNode context) {
        if (base == null) return null; // propagate stubbed/unknown external objects instead of NPE-ing
        if (part instanceof FieldAccess fieldAccess) {
            if (base instanceof Map<?, ?> map) {
                if (!map.containsKey(fieldAccess.field)) {
                    throw new PythonInterpreterException("no such key/attribute '" + fieldAccess.field + "'", part);
                }
                return map.get(fieldAccess.field);
            }
            throw new PythonInterpreterException("cannot access field '" + fieldAccess.field + "' on " + typeName(base), part);
        }
        if (part instanceof IndexAccess indexAccess) {
            Object key = resolveIndexKey(indexAccess, scope);
            if (base instanceof Map<?, ?> map) {
                if (!map.containsKey(key)) throw new PythonInterpreterException("no such key '" + key + "'", part);
                return map.get(key);
            }
            if (base instanceof List<?> list) {
                int index = ((Number) key).intValue();
                if (index < 0 || index >= list.size()) {
                    throw new PythonInterpreterException("index " + index + " out of bounds for list of size " + list.size(), part);
                }
                return list.get(index);
            }
            throw new PythonInterpreterException("cannot index into " + typeName(base), part);
        }
        throw new PythonInterpreterException("unsupported access part " + part.getClass().getSimpleName(), context);
    }

    private Object resolveIndexKey(IndexAccess indexAccess, Scope scope) {
        Object raw = indexAccess.index;
        if (raw instanceof IdentifierNode id) return evaluateIdentifier(id, scope);
        if (raw instanceof String s) return stripPythonStringLiteral(s);
        return raw; // Integer/Double already clean
    }

    private void assignInto(IdentifierNode target, Object value, Scope scope) {
        if (target.parts == null || target.parts.isEmpty()) {
            scope.set(target.root, value);
            return;
        }
        Object container = resolveVariable(target.root, target, scope);
        for (int i = 0; i < target.parts.size() - 1; i++) {
            container = applyAccessPart(container, target.parts.get(i), scope, target);
        }
        AccessPart last = target.parts.get(target.parts.size() - 1);
        if (last instanceof FieldAccess fieldAccess) {
            if (container instanceof Map<?, ?> map) {
                putInto(map, fieldAccess.field, value);
                return;
            }
            throw new PythonInterpreterException("cannot assign field '" + fieldAccess.field + "' on " + typeName(container), target);
        }
        if (last instanceof IndexAccess indexAccess) {
            Object key = resolveIndexKey(indexAccess, scope);
            if (container instanceof Map<?, ?> map) {
                putInto(map, key, value);
                return;
            }
            if (container instanceof List<?> list) {
                setInto(list, ((Number) key).intValue(), value);
                return;
            }
            throw new PythonInterpreterException("cannot assign index on " + typeName(container), target);
        }
    }

    @SuppressWarnings("unchecked")
    private void putInto(Map<?, ?> map, Object key, Object value) {
        ((Map<Object, Object>) map).put(key, value);
    }

    @SuppressWarnings("unchecked")
    private void setInto(List<?> list, int index, Object value) {
        ((List<Object>) list).set(index, value);
    }

    private Object evaluateConcat(ConcatStr concat, Scope scope) {
        StringBuilder sb = new StringBuilder();
        if (concat.texts != null) {
            for (Expr part : concat.texts) sb.append(pythonStr(evaluate(part, scope)));
        }
        return sb.toString();
    }

    private Object evaluateArray(Array array, Scope scope) {
        List<Object> result = new ArrayList<>();
        if (array.body != null) {
            for (Expr e : array.body) result.add(evaluate(e, scope));
        }
        return result;
    }

    private Object evaluateDictionary(Dictionary dictionary, Scope scope) {
        Map<String, Object> result = new LinkedHashMap<>();
        if (dictionary.dic != null) {
            for (KeyValue kv : dictionary.dic) {
                result.put(stripPythonStringLiteral(kv.key), evaluate(kv.value, scope));
            }
        }
        return result;
    }

    private Object evaluateLogic(ExprLogic logic, Scope scope) {
        if (logic.operator == null) return evaluate(logic.left, scope);
        if (logic.operator == ExprLogic.Operator.NOT) return !truthy(evaluate(logic.left, scope));

        if (logic.operator == ExprLogic.Operator.AND) {
            Object left = evaluate(logic.left, scope);
            return truthy(left) ? evaluate(logic.right, scope) : left;
        }
        if (logic.operator == ExprLogic.Operator.OR) {
            Object left = evaluate(logic.left, scope);
            return truthy(left) ? left : evaluate(logic.right, scope);
        }

        Object left = evaluate(logic.left, scope);
        Object right = evaluate(logic.right, scope);
        return compareValues(logic.operator, left, right, logic);
    }

    private Object compareValues(ExprLogic.Operator op, Object left, Object right, ASTNode node) {
        if (op == ExprLogic.Operator.EQ) return pyEquals(left, right);
        if (op == ExprLogic.Operator.NEQ1 || op == ExprLogic.Operator.NEQ2) return !pyEquals(left, right);

        int cmp;
        if (isNumber(left) && isNumber(right)) {
            cmp = Double.compare(asDouble(left), asDouble(right));
        } else if (left instanceof String && right instanceof String) {
            cmp = ((String) left).compareTo((String) right);
        } else {
            throw new PythonInterpreterException("cannot compare " + typeName(left) + " and " + typeName(right), node);
        }
        return switch (op) {
            case LT -> cmp < 0;
            case GT -> cmp > 0;
            case LTE -> cmp <= 0;
            case GTE -> cmp >= 0;
            default -> throw new PythonInterpreterException("unsupported comparison operator " + op, node);
        };
    }

    private boolean pyEquals(Object left, Object right) {
        if (left == null || right == null) return left == right;
        if (isNumber(left) && isNumber(right)) return asDouble(left) == asDouble(right);
        return left.equals(right);
    }

    private Object evaluateMath(ExprMath math, Scope scope) {
        Object left = evaluate(math.left, scope);
        if (math.operator == null) return left;
        Object right = evaluate(math.right, scope);
        return switch (math.operator) {
            case ADD -> arithAdd(left, right, math);
            case SUB -> arithSub(left, right, math);
            case MUL -> arithMul(left, right, math);
            case DIV -> arithDiv(left, right, math);
            case MOD -> arithMod(left, right, math);
            case POWER -> arithPow(left, right, math);
        };
    }

    private Object applyAugmentedOperator(AssignmentNode.Operator op, Object left, Object right, ASTNode node) {
        return switch (op) {
            case ADD_ASSIGN -> arithAdd(left, right, node);
            case SUB_ASSIGN -> arithSub(left, right, node);
            case MULT_ASSIGN -> arithMul(left, right, node);
            case DIV_ASSIGN -> arithDiv(left, right, node);
            case MOD_ASSIGN -> arithMod(left, right, node);
            case POWER_ASSIGN -> arithPow(left, right, node);
            case AND_ASSIGN -> requireInt(left, node) & requireInt(right, node);
            case OR_ASSIGN -> requireInt(left, node) | requireInt(right, node);
            case XOR_ASSIGN -> requireInt(left, node) ^ requireInt(right, node);
            case LEFT_SHIFT_ASSIGN -> requireInt(left, node) << requireInt(right, node);
            case RIGHT_SHIFT_ASSIGN -> requireInt(left, node) >> requireInt(right, node);
            default -> throw new PythonInterpreterException("unsupported assignment operator " + op, node);
        };
    }

    private Object arithAdd(Object left, Object right, ASTNode node) {
        if (left instanceof String && right instanceof String) return (String) left + right;
        if (left instanceof String || right instanceof String) {
            throw new PythonInterpreterException("cannot add " + typeName(left) + " and " + typeName(right), node);
        }
        requireNumbers(left, right, node);
        if (left instanceof Integer && right instanceof Integer) return (Integer) left + (Integer) right;
        return asDouble(left) + asDouble(right);
    }

    private Object arithSub(Object left, Object right, ASTNode node) {
        requireNumbers(left, right, node);
        if (left instanceof Integer && right instanceof Integer) return (Integer) left - (Integer) right;
        return asDouble(left) - asDouble(right);
    }

    private Object arithMul(Object left, Object right, ASTNode node) {
        requireNumbers(left, right, node);
        if (left instanceof Integer && right instanceof Integer) return (Integer) left * (Integer) right;
        return asDouble(left) * asDouble(right);
    }

    private Object arithDiv(Object left, Object right, ASTNode node) {
        requireNumbers(left, right, node);
        double divisor = asDouble(right);
        if (divisor == 0.0) throw new PythonInterpreterException("division by zero", node);
        return asDouble(left) / divisor; // Python 3 "/" is always true (float) division
    }

    private Object arithMod(Object left, Object right, ASTNode node) {
        requireNumbers(left, right, node);
        if (asDouble(right) == 0.0) throw new PythonInterpreterException("modulo by zero", node);
        if (left instanceof Integer && right instanceof Integer) return (Integer) left % (Integer) right;
        return asDouble(left) % asDouble(right);
    }

    private Object arithPow(Object left, Object right, ASTNode node) {
        requireNumbers(left, right, node);
        double result = Math.pow(asDouble(left), asDouble(right));
        if (left instanceof Integer && right instanceof Integer && (Integer) right >= 0) {
            return (int) Math.round(result);
        }
        return result;
    }

    private void requireNumbers(Object left, Object right, ASTNode node) {
        if (!isNumber(left) || !isNumber(right)) {
            throw new PythonInterpreterException("unsupported operand types " + typeName(left) + " and " + typeName(right), node);
        }
    }

    private int requireInt(Object value, ASTNode node) {
        if (value instanceof Integer i) return i;
        throw new PythonInterpreterException("expected an int operand, got " + typeName(value), node);
    }

    // ===================== Calls =====================

    private Object evaluateArgumentValue(Pair<Expr, Expr> arg, Scope scope) {
        return evaluate(arg.second != null ? arg.second : arg.first, scope);
    }

    private Object evaluateCall(CallStmt call, Scope scope) {
        String funcName = call.nameCall.root;

        if ("render_template".equals(funcName)) return evaluateRenderTemplate(call, scope);
        if ("len".equals(funcName)) return evaluateLen(call, scope);
        if ("str".equals(funcName)) return pythonStr(evaluateSingleArg(call, scope));
        if ("range".equals(funcName)) return evaluateRange(call, scope);

        if (functions.containsKey(funcName)) return invokeUserFunction(functions.get(funcName), call, scope);
        if (STUBBED_CALLABLES.contains(funcName)) return null;

        throw new PythonInterpreterException("call to undefined function '" + funcName + "'", call);
    }

    private Object evaluateSingleArg(CallStmt call, Scope scope) {
        if (call.arguments == null || call.arguments.isEmpty()) return null;
        return evaluateArgumentValue(call.arguments.get(0), scope);
    }

    private Object evaluateLen(CallStmt call, Scope scope) {
        Object arg = evaluateSingleArg(call, scope);
        if (arg instanceof List<?> list) return list.size();
        if (arg instanceof Map<?, ?> map) return map.size();
        if (arg instanceof String s) return s.length();
        throw new PythonInterpreterException("object of type " + typeName(arg) + " has no len()", call);
    }

    private Object evaluateRange(CallStmt call, Scope scope) {
        List<Object> args = new ArrayList<>();
        if (call.arguments != null) {
            for (Pair<Expr, Expr> arg : call.arguments) args.add(evaluateArgumentValue(arg, scope));
        }
        int start, stop, step;
        if (args.size() == 1) { start = 0; stop = requireInt(args.get(0), call); step = 1; }
        else if (args.size() == 2) { start = requireInt(args.get(0), call); stop = requireInt(args.get(1), call); step = 1; }
        else if (args.size() >= 3) { start = requireInt(args.get(0), call); stop = requireInt(args.get(1), call); step = requireInt(args.get(2), call); }
        else throw new PythonInterpreterException("range() requires at least 1 argument", call);
        if (step == 0) throw new PythonInterpreterException("range() step cannot be zero", call);

        List<Object> result = new ArrayList<>();
        if (step > 0) for (int i = start; i < stop; i += step) result.add(i);
        else for (int i = start; i > stop; i += step) result.add(i);
        return result;
    }

    private Object evaluateRenderTemplate(CallStmt call, Scope scope) {
        if (call.arguments == null || call.arguments.isEmpty()) {
            throw new PythonInterpreterException("render_template() requires at least a template name", call);
        }
        String templateName = null;
        Map<String, Object> variables = new LinkedHashMap<>();
        for (Pair<Expr, Expr> arg : call.arguments) {
            if (arg.second == null) {
                if (templateName == null) {
                    Object v = evaluate(arg.first, scope);
                    if (!(v instanceof String s)) {
                        throw new PythonInterpreterException("render_template() template name must be a string", call);
                    }
                    templateName = s;
                }
            } else {
                if (!(arg.first instanceof IdentifierNode kwargName)) {
                    throw new PythonInterpreterException("render_template() keyword argument name must be a simple identifier", call);
                }
                variables.put(kwargName.root, evaluate(arg.second, scope));
            }
        }
        if (templateName == null) {
            throw new PythonInterpreterException("render_template() requires a template name", call);
        }

        renderedContexts.add(new Context(templateName, variables));
        return "<rendered:" + templateName + ">"; // placeholder; real HTML generation is a later Phase 2 step
    }

    private Object invokeUserFunction(FunDefNode funDef, CallStmt call, Scope callerScope) {
        Scope functionScope = new Scope(globalScope);
        bindParameters(funDef, call, callerScope, functionScope);
        try {
            executeBlock(funDef.body, functionScope);
        } catch (ReturnSignal r) {
            return r.value;
        }
        return null; // fell off the end without an explicit return
    }

    private void bindParameters(FunDefNode funDef, CallStmt call, Scope callerScope, Scope functionScope) {
        List<Pair<Expr, Expr>> params = funDef.arguments;
        List<Pair<Expr, Expr>> args = call.arguments;
        if (params == null) return;
        for (int i = 0; i < params.size(); i++) {
            IdentifierNode paramName = (IdentifierNode) params.get(i).first;
            Object value;
            if (args != null && i < args.size()) {
                value = evaluateArgumentValue(args.get(i), callerScope);
            } else if (params.get(i).second != null) {
                value = evaluate(params.get(i).second, functionScope); // default value
            } else {
                throw new PythonInterpreterException("missing argument '" + paramName.root + "' calling '" + funDef.nameFun.root + "'", call);
            }
            functionScope.set(paramName.root, value);
        }
    }

    // ===================== Iteration helpers =====================

    private Iterable<?> toIterable(Object value, ForStmtNode node) {
        if (value instanceof List<?> list) return list;
        if (value instanceof Map<?, ?> map) return map.keySet();
        if (value instanceof String s) {
            List<String> chars = new ArrayList<>();
            for (char c : s.toCharArray()) chars.add(String.valueOf(c));
            return chars;
        }
        throw new PythonInterpreterException("cannot iterate over " + typeName(value), node);
    }

    private void bindForTargets(List<IdentifierNode> targets, Object item, Scope scope) {
        if (targets.size() == 1) {
            scope.set(targets.get(0).root, item);
            return;
        }
        if (item instanceof List<?> parts && parts.size() == targets.size()) {
            for (int i = 0; i < targets.size(); i++) scope.set(targets.get(i).root, parts.get(i));
            return;
        }
        throw new PythonInterpreterException("cannot unpack loop value into " + targets.size() + " variables", null);
    }

    // ===================== Small value helpers =====================

    private static boolean isNumber(Object o) {
        return o instanceof Integer || o instanceof Double;
    }

    private static double asDouble(Object o) {
        return ((Number) o).doubleValue();
    }

    private static boolean truthy(Object value) {
        if (value == null) return false;
        if (value instanceof Boolean b) return b;
        if (value instanceof Integer i) return i != 0;
        if (value instanceof Double d) return d != 0.0;
        if (value instanceof String s) return !s.isEmpty();
        if (value instanceof List<?> l) return !l.isEmpty();
        if (value instanceof Map<?, ?> m) return !m.isEmpty();
        return true;
    }

    private static String pythonStr(Object value) {
        if (value == null) return "None";
        if (value instanceof Boolean b) return b ? "True" : "False";
        return String.valueOf(value);
    }

    private static String typeName(Object value) {
        return value == null ? "NoneType" : value.getClass().getSimpleName();
    }

    private static String stripPythonStringLiteral(String raw) {
        if (raw.length() >= 6 && (raw.startsWith("'''") && raw.endsWith("'''") || raw.startsWith("\"\"\"") && raw.endsWith("\"\"\""))) {
            return raw.substring(3, raw.length() - 3);
        }
        if (raw.length() >= 2) {
            char first = raw.charAt(0);
            char last = raw.charAt(raw.length() - 1);
            if ((first == '"' || first == '\'') && first == last) {
                return raw.substring(1, raw.length() - 1);
            }
        }
        return raw;
    }

    // ===================== Internal scope =====================

    /**
     * Interpreter-owned scope: name -> real Java value. Unrelated to, and never
     * shared with, python.symbolTable.SymbolTable (which maps name -> type string
     * for semantic analysis only).
     */
    private static final class Scope {
        private final Scope parent;
        private final Map<String, Object> values = new LinkedHashMap<>();
        private final Set<String> globalNames = new HashSet<>();

        Scope(Scope parent) {
            this.parent = parent;
        }

        boolean has(String name) {
            if (values.containsKey(name)) return true;
            return parent != null && parent.has(name);
        }

        Object get(String name) {
            if (values.containsKey(name)) return values.get(name);
            if (parent != null) return parent.get(name);
            return null;
        }

        void set(String name, Object value) {
            if (globalNames.contains(name)) {
                root().values.put(name, value);
            } else {
                values.put(name, value);
            }
        }

        void remove(String name) {
            values.remove(name);
        }

        void declareGlobal(String name) {
            globalNames.add(name);
        }

        Scope root() {
            Scope s = this;
            while (s.parent != null) s = s.parent;
            return s;
        }
    }

    // ===================== Internal control-flow signals =====================

    private static final class ReturnSignal extends RuntimeException {
        final Object value;
        ReturnSignal(Object value) {
            super(null, null, false, false); // no stack trace needed - this is control flow, not an error
            this.value = value;
        }
    }

    private static final class BreakSignal extends RuntimeException {
        static final BreakSignal INSTANCE = new BreakSignal();
        private BreakSignal() { super(null, null, false, false); }
    }

    private static final class ContinueSignal extends RuntimeException {
        static final ContinueSignal INSTANCE = new ContinueSignal();
        private ContinueSignal() { super(null, null, false, false); }
    }
}
