package python.visitor;

import python.ast.Program;
import python.ast.Statement;
import python.ast.Expression.*;
import python.ast.SimpleStmt.*;
import python.ast.CompoundStmt.*;
import python.ast.Access.*;

import java.util.*;

/**
 * Advanced semantic checker for the Python/Flask part.
 *
 * It covers the required semantic categories:
 * 1) Undefined variable
 * 2) Type error
 * 3) Scope error
 * 4) Type mismatch
 *
 * The fifth category (Missing Flask variable) is checked in HtmlJinjaCssSemanticChecker
 * because it needs both Flask render_template(...) data and Jinja template variables.
 */
public class PythonAdvancedSemanticChecker {

    private final List<String> undefinedVariableErrors = new ArrayList<>();
    private final List<String> typeErrors = new ArrayList<>();
    private final List<String> scopeErrors = new ArrayList<>();
    private final List<String> typeMismatchErrors = new ArrayList<>();

    private final Set<String> reported = new HashSet<>();

    private final Set<String> builtinNames = new HashSet<>(Arrays.asList(
            "Flask", "flask", "render_template", "request", "redirect", "url_for",
            "len", "append", "print", "str", "int", "float", "bool", "list", "dict",
            "range", "True", "False", "None", "__name__", "static"
    ));

    private int loopDepth = 0;
    private int functionDepth = 0;

    // Every Scope ever created, kept even after its block/function has finished analysis.
    // This is what lets analyzeIdentifier tell "never declared anywhere" (Undefined Variable)
    // apart from "declared in a scope that has since closed" (Scope Error).
    private final List<Scope> allScopes = new ArrayList<>();

    private static final String TYPE_UNKNOWN = "unknown";
    private static final String TYPE_NUMBER = "number";
    private static final String TYPE_STRING = "string";
    private static final String TYPE_BOOL = "bool";
    private static final String TYPE_NONE = "none";
    private static final String TYPE_LIST = "list";
    private static final String TYPE_DICT = "dict";
    private static final String TYPE_FUNCTION = "function";

    private static class Scope {
        final Scope parent;
        final Map<String, String> symbols = new HashMap<>();

        Scope(Scope parent) {
            this.parent = parent;
        }

        boolean containsLocal(String name) {
            return symbols.containsKey(name);
        }

        boolean contains(String name) {
            if (symbols.containsKey(name)) return true;
            return parent != null && parent.contains(name);
        }

        String lookup(String name) {
            if (symbols.containsKey(name)) return symbols.get(name);
            return parent != null ? parent.lookup(name) : TYPE_UNKNOWN;
        }

        void define(String name, String type) {
            if (name == null || name.isBlank()) return;
            symbols.put(name, normalizeType(type));
        }
    }

    private Scope newScope(Scope parent) {
        Scope scope = new Scope(parent);
        allScopes.add(scope);
        return scope;
    }

    public void check(Program program) {
        clear();
        Scope global = newScope(null);
        for (String builtin : builtinNames) global.define(builtin, TYPE_UNKNOWN);

        if (program == null) return;

        // First pass: register top-level imports and function names so that calls are known.
        for (Statement stmt : program.getChildren()) {
            registerDeclarations(stmt, global);
        }

        // Second pass: full semantic analysis in execution order.
        for (Statement stmt : program.getChildren()) {
            analyzeStatement(stmt, global);
        }
    }

    private void clear() {
        undefinedVariableErrors.clear();
        typeErrors.clear();
        scopeErrors.clear();
        typeMismatchErrors.clear();
        reported.clear();
        allScopes.clear();
        loopDepth = 0;
        functionDepth = 0;
    }

    private void registerDeclarations(Statement stmt, Scope scope) {
        if (stmt == null) return;

        if (stmt instanceof ImportNode importNode) {
            registerImport(importNode, scope);
        } else if (stmt instanceof FunDefNode funDef) {
            if (funDef.nameFun != null) scope.define(funDef.nameFun.root, TYPE_FUNCTION);
        } else if (stmt instanceof DecoratorNode decoratorNode) {
            if (decoratorNode.fun != null && decoratorNode.fun.nameFun != null) {
                scope.define(decoratorNode.fun.nameFun.root, TYPE_FUNCTION);
            }
        }
    }

    private void registerImport(ImportNode importNode, Scope scope) {
        if (importNode == null) return;

        if (importNode.aliases != null) {
            scope.define(importNode.aliases.root, TYPE_UNKNOWN);
            return;
        }

        if (importNode.modules != null) {
            for (IdentifierNode module : importNode.modules) {
                if (module != null) scope.define(module.root, TYPE_UNKNOWN);
            }
        }

        if (importNode.namesWithAliases != null) {
            for (Pair<IdentifierNode, Object> pair : importNode.namesWithAliases) {
                if (pair == null) continue;
                if (pair.second instanceof IdentifierNode alias) scope.define(alias.root, TYPE_UNKNOWN);
                else if (pair.first != null) scope.define(pair.first.root, TYPE_UNKNOWN);
            }
        }
    }

    private void analyzeStatement(Statement stmt, Scope scope) {
        if (stmt == null) return;

        if (stmt instanceof ImportNode importNode) {
            registerImport(importNode, scope);
            return;
        }

        if (stmt instanceof AssignmentNode assignment) {
            analyzeAssignment(assignment, scope);
            return;
        }

        if (stmt instanceof CallNode callNode) {
            if (callNode.ide != null) analyzeIdentifier(callNode.ide, scope);
            inferType(callNode.callNode, scope);
            return;
        }

        if (stmt instanceof ReturnNode returnNode) {
            if (functionDepth == 0) {
                addScopeError(returnNode.lineNumber, "return statement is outside any function");
            }
            if (returnNode.values != null) {
                for (Expr expr : returnNode.values) inferType(expr, scope);
            }
            return;
        }

        if (stmt instanceof BreakNode breakNode) {
            if (loopDepth == 0) addScopeError(breakNode.lineNumber, "break statement is outside any loop");
            return;
        }

        if (stmt instanceof ContinueNode continueNode) {
            if (loopDepth == 0) addScopeError(continueNode.lineNumber, "continue statement is outside any loop");
            return;
        }

        if (stmt instanceof DelNode delNode) {
            for (IdentifierNode target : delNode.getNames()) analyzeIdentifier(target, scope);
            return;
        }

        if (stmt instanceof GlobalNode) {
            return;
        }

        if (stmt instanceof PassNode) {
            return;
        }

        if (stmt instanceof FunDefNode funDef) {
            analyzeFunction(funDef, scope);
            return;
        }

        if (stmt instanceof DecoratorNode decorator) {
            analyzeIdentifier(decorator.nameDec, scope);
            analyzeArguments(decorator.arguments, scope);
            if (decorator.fun != null) analyzeFunction(decorator.fun, scope);
            return;
        }

        if (stmt instanceof IfStmtNode ifStmt) {
            inferType(ifStmt.condition, scope);
            analyzeBlock(ifStmt.body, scope, false);
            if (ifStmt.else_if_stmt != null) {
                for (ElseIfNode elif : ifStmt.else_if_stmt) {
                    inferType(elif.condition, scope);
                    analyzeBlock(elif.body, scope, false);
                }
            }
            if (ifStmt.else_stmt != null) analyzeBlock(ifStmt.else_stmt.body, scope, false);
            return;
        }

        if (stmt instanceof ForStmtNode forStmt) {
            inferType(forStmt.inExpr, scope);
            loopDepth++;
            Scope loopScope = newScope(scope);
            if (forStmt.var != null) {
                for (IdentifierNode id : forStmt.var) {
                    if (id != null) loopScope.define(id.root, TYPE_UNKNOWN);
                }
            }
            analyzeBlock(forStmt.body, loopScope, false);
            loopDepth--;
            return;
        }

        if (stmt instanceof WhileStmtNode whileStmt) {
            inferType(whileStmt.condition, scope);
            loopDepth++;
            analyzeBlock(whileStmt.body, scope, false);
            loopDepth--;
        }
    }

    private void analyzeBlock(List<Statement> body, Scope scope, boolean createNewScope) {
        if (body == null) return;
        Scope blockScope = createNewScope ? newScope(scope) : scope;
        for (Statement s : body) analyzeStatement(s, blockScope);
    }

    private void analyzeFunction(FunDefNode funDef, Scope parentScope) {
        if (funDef == null) return;
        if (funDef.nameFun != null) parentScope.define(funDef.nameFun.root, TYPE_FUNCTION);

        Scope functionScope = newScope(parentScope);
        if (funDef.arguments != null) {
            for (Pair<Expr, Expr> arg : funDef.arguments) {
                if (arg == null) continue;
                if (arg.first instanceof IdentifierNode id) functionScope.define(id.root, TYPE_UNKNOWN);
                if (arg.second != null) inferType(arg.second, parentScope);
            }
        }

        functionDepth++;
        analyzeBlock(funDef.body, functionScope, false);
        functionDepth--;
    }

    private void analyzeAssignment(AssignmentNode assignment, Scope scope) {
        if (assignment == null) return;

        // Operators like += require the target to be already defined.
        if (assignment.operator != AssignmentNode.Operator.ASSIGN && assignment.targets != null) {
            for (IdentifierNode target : assignment.targets) analyzeIdentifier(target, scope);
        }

        String valueType = inferType(assignment.value, scope);

        if (assignment.targets != null) {
            for (IdentifierNode target : assignment.targets) {
                if (target == null) continue;
                String oldType = scope.lookup(target.root);

                if (assignment.operator == AssignmentNode.Operator.ASSIGN) {
                    if (scope.contains(target.root)
                            && !TYPE_UNKNOWN.equals(oldType)
                            && !TYPE_UNKNOWN.equals(valueType)
                            && !oldType.equals(valueType)) {
                        addTypeMismatchError(target.lineNumber,
                                "variable '" + target.root + "' was previously " + oldType + " but now receives " + valueType);
                    }
                    scope.define(target.root, valueType);
                } else {
                    // For +=, -= ... keep the old type if it is known, otherwise use inferred value type.
                    if (!TYPE_UNKNOWN.equals(oldType)) scope.define(target.root, oldType);
                    else scope.define(target.root, valueType);
                }
            }
        }
    }

    private void analyzeArguments(List<Pair<Expr, Expr>> args, Scope scope) {
        if (args == null) return;
        for (Pair<Expr, Expr> arg : args) {
            if (arg == null) continue;
            if (arg.first != null) inferType(arg.first, scope);
            if (arg.second != null) inferType(arg.second, scope);
        }
    }

    private String inferType(Expr expr, Scope scope) {
        if (expr == null) return TYPE_UNKNOWN;

        if (expr instanceof Atom atom) {
            return atomType(atom);
        }

        if (expr instanceof IdentifierNode id) {
            analyzeIdentifier(id, scope);
            return scope.lookup(id.root);
        }

        if (expr instanceof ExprMath math) {
            String leftType = inferType(math.left, scope);
            if (math.operator == null) return leftType;
            String rightType = inferType(math.right, scope);

            boolean leftString = TYPE_STRING.equals(leftType);
            boolean rightString = TYPE_STRING.equals(rightType);
            boolean leftNumber = TYPE_NUMBER.equals(leftType);
            boolean rightNumber = TYPE_NUMBER.equals(rightType);

            if (math.operator == ExprMath.Operator.ADD) {
                if ((leftString && rightNumber) || (leftNumber && rightString)) {
                    addTypeMismatchError(math.lineNumber,
                            "cannot use '+' between " + leftType + " and " + rightType);
                    return TYPE_UNKNOWN;
                }
                if (leftString && rightString) return TYPE_STRING;
                if (leftNumber && rightNumber) return TYPE_NUMBER;
                return TYPE_UNKNOWN;
            }

            if (leftString || rightString) {
                addTypeError(math.lineNumber,
                        "operator '" + math.operator + "' cannot be applied to " + leftType + " and " + rightType);
                return TYPE_UNKNOWN;
            }

            if (leftNumber && rightNumber) return TYPE_NUMBER;
            return TYPE_UNKNOWN;
        }

        if (expr instanceof ExprLogic logic) {
            inferType(logic.left, scope);
            inferType(logic.right, scope);
            return TYPE_BOOL;
        }

        if (expr instanceof CallStmt call) {
            if (call.nameCall != null) analyzeIdentifier(call.nameCall, scope);
            analyzeArguments(call.arguments, scope);
            if (call.nameCall != null && "len".equals(call.nameCall.root)) return TYPE_NUMBER;
            return TYPE_UNKNOWN;
        }

        if (expr instanceof Array array) {
            if (array.body != null) {
                for (Expr item : array.body) inferType(item, scope);
            }
            return TYPE_LIST;
        }

        if (expr instanceof python.ast.Expression.Dictionary dictionary) {
            if (dictionary.dic != null) {
                for (KeyValue kv : dictionary.dic) {
                    if (kv != null) inferType(kv.value, scope);
                }
            }
            return TYPE_DICT;
        }

        if (expr instanceof ConcatStr concatStr) {
            if (concatStr.texts != null) {
                for (Expr item : concatStr.texts) {
                    String type = inferType(item, scope);
                    if (!TYPE_UNKNOWN.equals(type) && !TYPE_STRING.equals(type)) {
                        addTypeMismatchError(concatStr.lineNumber,
                                "string concatenation expects string values but found " + type);
                    }
                }
            }
            return TYPE_STRING;
        }

        return TYPE_UNKNOWN;
    }

    private void analyzeIdentifier(IdentifierNode id, Scope scope) {
        if (id == null || id.root == null || id.root.isBlank()) return;
        if (!scope.contains(id.root) && !builtinNames.contains(id.root)) {
            if (declaredInClosedScope(id.root, scope)) {
                addOutOfScopeError(id.lineNumber, id.root);
            } else {
                addUndefinedVariableError(id.lineNumber, id.root);
            }
        }

        // Indexes may contain identifiers too: product[index]
        if (id.parts != null) {
            for (AccessPart part : id.parts) {
                if (part instanceof IndexAccess indexAccess && indexAccess.index instanceof IdentifierNode indexId) {
                    analyzeIdentifier(indexId, scope);
                }
            }
        }
    }

    /**
     * True when `name` was declared in some scope that isn't part of the current scope chain
     * (an ancestor of `scope`) - i.e. a function/loop block that has already finished analysis.
     * That's variable-scope leakage (FIX 4), distinct from a name that was never declared anywhere.
     */
    private boolean declaredInClosedScope(String name, Scope scope) {
        for (Scope candidate : allScopes) {
            if (isAncestorOrSelf(candidate, scope)) continue;
            if (candidate.containsLocal(name)) return true;
        }
        return false;
    }

    private boolean isAncestorOrSelf(Scope candidate, Scope scope) {
        for (Scope s = scope; s != null; s = s.parent) {
            if (s == candidate) return true;
        }
        return false;
    }

    private String atomType(Atom atom) {
        if (atom == null) return TYPE_UNKNOWN;
        if (atom.object == null) return TYPE_NONE;
        if (atom.object instanceof Integer || atom.object instanceof Double || atom.object instanceof Float || atom.object instanceof Long) {
            return TYPE_NUMBER;
        }
        if (atom.object instanceof Boolean) return TYPE_BOOL;
        if (atom.object instanceof String) return TYPE_STRING;
        return TYPE_UNKNOWN;
    }

    private static String normalizeType(String type) {
        if (type == null) return TYPE_UNKNOWN;
        String t = type.toLowerCase(Locale.ROOT);
        if (t.contains("string")) return TYPE_STRING;
        if (t.contains("int") || t.contains("float") || t.contains("double") || t.contains("number")) return TYPE_NUMBER;
        if (t.contains("bool")) return TYPE_BOOL;
        if (t.contains("list") || t.contains("array")) return TYPE_LIST;
        if (t.contains("dict")) return TYPE_DICT;
        if (t.contains("function")) return TYPE_FUNCTION;
        if (t.contains("none") || t.contains("null")) return TYPE_NONE;
        return TYPE_UNKNOWN;
    }

    private void addUndefinedVariableError(int line, String variable) {
        addUnique(undefinedVariableErrors, "UNDEFINED:" + line + ":" + variable,
                "Undefined Variable Error [line " + line + "]: variable '" + variable + "' is used before definition.");
    }

    private void addTypeError(int line, String details) {
        addUnique(typeErrors, "TYPE_ERROR:" + line + ":" + details,
                "Type Error [line " + line + "]: " + details + ".");
    }

    private void addScopeError(int line, String details) {
        addUnique(scopeErrors, "SCOPE:" + line + ":" + details,
                "Scope Error [line " + line + "]: " + details + ".");
    }

    private void addOutOfScopeError(int line, String variable) {
        addUnique(scopeErrors, "OUT_OF_SCOPE:" + line + ":" + variable,
                "Semantic Error (line " + line + "): variable '" + variable + "' is out of scope");
    }

    private void addTypeMismatchError(int line, String details) {
        addUnique(typeMismatchErrors, "TYPE_MISMATCH:" + line + ":" + details,
                "Type Mismatch Error [line " + line + "]: " + details + ".");
    }

    private void addUnique(List<String> target, String key, String message) {
        if (reported.add(key)) target.add(message);
    }

    public List<String> getUndefinedVariableErrors() {
        return undefinedVariableErrors;
    }

    public List<String> getTypeErrors() {
        return typeErrors;
    }

    public List<String> getScopeErrors() {
        return scopeErrors;
    }

    public List<String> getTypeMismatchErrors() {
        return typeMismatchErrors;
    }

    public List<String> getAllErrors() {
        List<String> all = new ArrayList<>();
        all.addAll(undefinedVariableErrors);
        all.addAll(typeErrors);
        all.addAll(scopeErrors);
        all.addAll(typeMismatchErrors);
        return all;
    }
}
