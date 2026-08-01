package html.renderer;

import html.ast.ArgumentNode;
import html.ast.ArithmeticNode;
import html.ast.ConcatNode;
import html.ast.FunctionNode;
import html.ast.HtmlAttribute;
import html.ast.HtmlElement;
import html.ast.IdentifierNode;
import html.ast.JinjaForBlock;
import html.ast.JinjaIfBlock;
import html.ast.LogicNode;
import html.ast.MemberAccessNode;
import html.ast.Node;
import html.ast.NumberNode;
import html.ast.StyleElement;
import html.ast.TextNode;

import python.interpreter.Context;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Phase 2 / Step 2: walks a Jinja/HTML AST (built by the existing AstBuilder)
 * and, given a {@link Context} from Step 1's Python interpreter, substitutes
 * every {{ expr }} and {% for/if %} construct with real values to produce a
 * single final HTML string.
 *
 * Mirrors the traversal SHAPE of HtmlJinjaCssSemanticChecker.walk(...) - a
 * scope stack of {% for %} loop variables, MemberAccessNode root resolution,
 * the same node dispatch - but this is new, independent code: the checker
 * only ever produces booleans/error strings, this class produces HTML text.
 * No SymbolTable/HtmlSymbolTable involved anywhere.
 *
 * LogicNode now carries a LogicOp (AND/OR/NOT/EQ/NEQ/GT/GTE/LT/LTE), and
 * JinjaIfBlock now carries an ordered list of elif branches - both were
 * previously-discarded Phase 1 AST information, fixed alongside this class.
 *
 * Remaining known, deliberate limitation:
 *  - CssRule/CssDeclaration/Stylesheet expose no getters, so a <style> block's
 *    original CSS text cannot be reconstructed here; it is skipped rather than
 *    guessed at (their structure was left untouched, per instructions).
 */
public class JinjaRenderer {

    private static final Set<String> VOID_TAGS = Set.of("br", "hr", "meta", "link", "img", "input", "source");

    public String render(Node root, Context context) {
        if (root == null) throw new JinjaRenderException("cannot render a null template AST", 0);
        if (context == null) throw new JinjaRenderException("cannot render without a Context (template variables)", 0);

        Set<String> allLoopVariables = new HashSet<>();
        collectAllLoopVariables(root, allLoopVariables);

        Deque<Map<String, Object>> scopeStack = new ArrayDeque<>();
        StringBuilder out = new StringBuilder();
        renderNode(root, context, scopeStack, allLoopVariables, out);
        return out.toString();
    }

    // ===================== Structural rendering =====================

    private void renderNode(Node node, Context context, Deque<Map<String, Object>> scopeStack,
                             Set<String> allLoopVariables, StringBuilder out) {
        if (node == null) return;

        if (node instanceof html.ast.Program program) {
            for (Node child : program.getBody()) renderNode(child, context, scopeStack, allLoopVariables, out);
        } else if (node instanceof HtmlElement element) {
            renderHtmlElement(element, context, scopeStack, allLoopVariables, out);
        } else if (node instanceof JinjaForBlock forBlock) {
            renderForBlock(forBlock, context, scopeStack, allLoopVariables, out);
        } else if (node instanceof JinjaIfBlock ifBlock) {
            renderIfBlock(ifBlock, context, scopeStack, allLoopVariables, out);
        } else if (node instanceof TextNode textNode) {
            out.append(textNode.getText());
        } else if (node instanceof StyleElement) {
            // See class javadoc: CSS AST classes expose no accessors, so the original
            // <style> body can't be reconstructed here. Deliberately skipped.
        } else {
            // Anything else reaching here is a {{ expr }} substitution (IdentifierNode,
            // MemberAccessNode, ArithmeticNode, FunctionNode, LogicNode, ConcatNode, NumberNode, ...).
            out.append(stringify(evaluate(node, context, scopeStack, allLoopVariables)));
        }
    }

    private void renderHtmlElement(HtmlElement element, Context context, Deque<Map<String, Object>> scopeStack,
                                    Set<String> allLoopVariables, StringBuilder out) {
        String tag = element.getTagName();
        out.append('<').append(tag);
        for (HtmlAttribute attr : element.getAttributes()) {
            out.append(' ').append(attr.getName());
            Node valueNode = attr.getValue();
            if (valueNode != null) {
                String value = stringify(evaluate(valueNode, context, scopeStack, allLoopVariables));
                out.append("=\"").append(escapeAttribute(value)).append('"');
            }
        }
        if (VOID_TAGS.contains(tag)) {
            out.append(" />");
            return;
        }
        out.append('>');
        for (Node child : element.getChildren()) {
            renderNode(child, context, scopeStack, allLoopVariables, out);
        }
        out.append("</").append(tag).append('>');
    }

    private void renderForBlock(JinjaForBlock forBlock, Context context, Deque<Map<String, Object>> scopeStack,
                                Set<String> allLoopVariables, StringBuilder out) {
        Object iterableValue = evaluate(forBlock.getIterable(), context, scopeStack, allLoopVariables);
        Iterable<?> iterable = toIterable(iterableValue, forBlock);

        Map<String, Object> loopScope = new java.util.HashMap<>();
        scopeStack.push(loopScope); // pushed once for the whole loop; values are rebound each iteration
        try {
            for (Object item : iterable) {
                bindLoopVariables(forBlock.getVariables(), item, loopScope, forBlock);
                for (Node child : forBlock.getBody()) {
                    renderNode(child, context, scopeStack, allLoopVariables, out);
                }
            }
        } finally {
            scopeStack.pop(); // loop variable(s) are not visible once the block ends
        }
    }

    private void renderIfBlock(JinjaIfBlock ifBlock, Context context, Deque<Map<String, Object>> scopeStack,
                                Set<String> allLoopVariables, StringBuilder out) {
        if (truthy(evaluate(ifBlock.getCondition(), context, scopeStack, allLoopVariables))) {
            renderBranch(ifBlock.getBody(), context, scopeStack, allLoopVariables, out);
            return;
        }
        if (ifBlock.getElifBranches() != null) {
            for (JinjaIfBlock.ElifBranch elif : ifBlock.getElifBranches()) {
                if (truthy(evaluate(elif.getCondition(), context, scopeStack, allLoopVariables))) {
                    renderBranch(elif.getBody(), context, scopeStack, allLoopVariables, out);
                    return;
                }
            }
        }
        renderBranch(ifBlock.getElseBody(), context, scopeStack, allLoopVariables, out);
    }

    private void renderBranch(List<Node> branch, Context context, Deque<Map<String, Object>> scopeStack,
                               Set<String> allLoopVariables, StringBuilder out) {
        if (branch == null) return;
        for (Node child : branch) renderNode(child, context, scopeStack, allLoopVariables, out);
    }

    // ===================== Expression evaluation =====================

    private Object evaluate(Node node, Context context, Deque<Map<String, Object>> scopeStack, Set<String> allLoopVariables) {
        if (node == null) return null;
        if (node instanceof TextNode textNode) return textNode.getText();
        if (node instanceof NumberNode numberNode) return numberNode.getValue();
        if (node instanceof IdentifierNode identifierNode) {
            return resolveVariable(identifierNode.getName(), identifierNode.getLine(), context, scopeStack, allLoopVariables);
        }
        if (node instanceof MemberAccessNode memberAccessNode) {
            return evaluateMemberAccess(memberAccessNode, context, scopeStack, allLoopVariables);
        }
        if (node instanceof ArithmeticNode arithmeticNode) {
            return evaluateArithmetic(arithmeticNode, context, scopeStack, allLoopVariables);
        }
        if (node instanceof LogicNode logicNode) {
            return evaluateLogic(logicNode, context, scopeStack, allLoopVariables);
        }
        if (node instanceof ConcatNode concatNode) {
            return evaluateConcat(concatNode, context, scopeStack, allLoopVariables);
        }
        if (node instanceof FunctionNode functionNode) {
            return evaluateFunction(functionNode, context, scopeStack, allLoopVariables);
        }
        if (node instanceof ArgumentNode argumentNode) {
            return evaluate(argumentNode.getValue(), context, scopeStack, allLoopVariables);
        }
        throw new JinjaRenderException("cannot evaluate node of type " + node.getClass().getSimpleName(), node.getLine());
    }

    /**
     * Resolves a bare identifier: current {% for %} scope stack first (innermost wins), then the
     * Context's render_template(...) variables. Mirrors FIX 4's scope-leakage distinction: a name
     * that WAS declared by some {% for %} loop somewhere in this template, but isn't visible right
     * now, is reported as "out of scope" - not the same as a name that was never declared anywhere.
     */
    private Object resolveVariable(String name, int line, Context context,
                                    Deque<Map<String, Object>> scopeStack, Set<String> allLoopVariables) {
        for (Map<String, Object> scope : scopeStack) {
            if (scope.containsKey(name)) return scope.get(name);
        }
        if (context.getVariables().containsKey(name)) return context.getVariables().get(name);
        if (allLoopVariables.contains(name)) {
            throw new JinjaRenderException(
                    "variable '" + name + "' is out of scope here - it is a {% for %} loop variable referenced outside its own loop body",
                    line);
        }
        throw new JinjaRenderException(
                "undefined variable '" + name + "' - it was not passed via render_template(...) and is not a loop variable in scope here",
                line);
    }

    private Object evaluateMemberAccess(MemberAccessNode node, Context context,
                                         Deque<Map<String, Object>> scopeStack, Set<String> allLoopVariables) {
        Object target = evaluate(node.getTarget(), context, scopeStack, allLoopVariables);
        if (!(target instanceof Map<?, ?> map)) {
            throw new JinjaRenderException(
                    "cannot access field '" + node.getField() + "' on " + typeName(target) + " (expected an object/dict value)",
                    node.getLine());
        }
        if (!map.containsKey(node.getField())) {
            throw new JinjaRenderException(
                    "no such field '" + node.getField() + "' - available keys: " + map.keySet(),
                    node.getLine());
        }
        return map.get(node.getField());
    }

    private Object evaluateArithmetic(ArithmeticNode node, Context context,
                                       Deque<Map<String, Object>> scopeStack, Set<String> allLoopVariables) {
        Object left = evaluate(node.getLeft(), context, scopeStack, allLoopVariables);
        Object right = evaluate(node.getRight(), context, scopeStack, allLoopVariables);
        if (!isNumber(left) || !isNumber(right)) {
            throw new JinjaRenderException("arithmetic requires numbers, got " + typeName(left) + " and " + typeName(right), node.getLine());
        }
        boolean bothInt = left instanceof Integer && right instanceof Integer;
        double l = asDouble(left);
        double r = asDouble(right);
        return switch (node.getOperator()) {
            case ADD -> bothInt ? (Object) ((Integer) left + (Integer) right) : (Object) (l + r);
            case SUB -> bothInt ? (Object) ((Integer) left - (Integer) right) : (Object) (l - r);
            case MUL -> bothInt ? (Object) ((Integer) left * (Integer) right) : (Object) (l * r);
            case DIV -> {
                if (r == 0.0) throw new JinjaRenderException("division by zero", node.getLine());
                yield l / r;
            }
            case MOD -> {
                if (r == 0.0) throw new JinjaRenderException("modulo by zero", node.getLine());
                yield bothInt ? (Object) ((Integer) left % (Integer) right) : (Object) (l % r);
            }
        };
    }

    private Object evaluateLogic(LogicNode node, Context context,
                                  Deque<Map<String, Object>> scopeStack, Set<String> allLoopVariables) {
        LogicNode.LogicOp op = node.getOperator();

        if (op == LogicNode.LogicOp.NOT) {
            return !truthy(evaluate(node.getLeft(), context, scopeStack, allLoopVariables));
        }
        if (op == LogicNode.LogicOp.AND) {
            if (!truthy(evaluate(node.getLeft(), context, scopeStack, allLoopVariables))) return false; // short-circuit
            return truthy(evaluate(node.getRight(), context, scopeStack, allLoopVariables));
        }
        if (op == LogicNode.LogicOp.OR) {
            if (truthy(evaluate(node.getLeft(), context, scopeStack, allLoopVariables))) return true; // short-circuit
            return truthy(evaluate(node.getRight(), context, scopeStack, allLoopVariables));
        }

        // Remaining operators are comparisons (EQ/NEQ/GT/GTE/LT/LTE) - both sides must be evaluated.
        Object left = evaluate(node.getLeft(), context, scopeStack, allLoopVariables);
        Object right = evaluate(node.getRight(), context, scopeStack, allLoopVariables);
        return compareValues(op, left, right, node);
    }

    private boolean compareValues(LogicNode.LogicOp op, Object left, Object right, LogicNode node) {
        if (op == LogicNode.LogicOp.EQ) return pyEquals(left, right);
        if (op == LogicNode.LogicOp.NEQ) return !pyEquals(left, right);

        int cmp;
        if (isNumber(left) && isNumber(right)) {
            cmp = Double.compare(asDouble(left), asDouble(right));
        } else if (left instanceof String && right instanceof String) {
            cmp = ((String) left).compareTo((String) right);
        } else {
            throw new JinjaRenderException("cannot compare " + typeName(left) + " and " + typeName(right), node.getLine());
        }
        return switch (op) {
            case GT -> cmp > 0;
            case GTE -> cmp >= 0;
            case LT -> cmp < 0;
            case LTE -> cmp <= 0;
            default -> throw new JinjaRenderException("unsupported comparison operator " + op, node.getLine());
        };
    }

    private boolean pyEquals(Object left, Object right) {
        if (left == null || right == null) return left == right;
        if (isNumber(left) && isNumber(right)) return asDouble(left) == asDouble(right);
        return left.equals(right);
    }

    private Object evaluateConcat(ConcatNode node, Context context,
                                   Deque<Map<String, Object>> scopeStack, Set<String> allLoopVariables) {
        StringBuilder sb = new StringBuilder();
        for (Node part : node.getParts()) {
            if (part != null) sb.append(stringify(evaluate(part, context, scopeStack, allLoopVariables)));
        }
        return sb.toString();
    }

    private Object evaluateFunction(FunctionNode node, Context context,
                                     Deque<Map<String, Object>> scopeStack, Set<String> allLoopVariables) {
        List<Object> args = new ArrayList<>();
        for (Node argNode : node.getArguments()) args.add(evaluate(argNode, context, scopeStack, allLoopVariables));

        if ("range".equals(node.getFunctionName())) return evaluateRange(args, node);

        // Flask/Jinja built-ins (url_for, static, ...) aren't modeled here - a visible placeholder
        // beats silently guessing at a URL.
        return "<call:" + node.getFunctionName() + "("
                + args.stream().map(JinjaRenderer::stringify).collect(Collectors.joining(", ")) + ")>";
    }

    private Object evaluateRange(List<Object> args, FunctionNode node) {
        int start, stop, step;
        if (args.size() == 1) { start = 0; stop = requireInt(args.get(0), node); step = 1; }
        else if (args.size() == 2) { start = requireInt(args.get(0), node); stop = requireInt(args.get(1), node); step = 1; }
        else if (args.size() >= 3) { start = requireInt(args.get(0), node); stop = requireInt(args.get(1), node); step = requireInt(args.get(2), node); }
        else throw new JinjaRenderException("range() requires at least 1 argument", node.getLine());
        if (step == 0) throw new JinjaRenderException("range() step cannot be zero", node.getLine());

        List<Object> result = new ArrayList<>();
        if (step > 0) for (int i = start; i < stop; i += step) result.add(i);
        else for (int i = start; i > stop; i += step) result.add(i);
        return result;
    }

    private int requireInt(Object value, FunctionNode node) {
        if (value instanceof Integer i) return i;
        throw new JinjaRenderException("expected an int argument, got " + typeName(value), node.getLine());
    }

    // ===================== Iteration helpers =====================

    private Iterable<?> toIterable(Object value, JinjaForBlock node) {
        if (value instanceof List<?> list) return list;
        if (value instanceof Map<?, ?> map) return map.keySet();
        if (value instanceof String s) {
            List<String> chars = new ArrayList<>();
            for (char c : s.toCharArray()) chars.add(String.valueOf(c));
            return chars;
        }
        throw new JinjaRenderException("cannot iterate over " + typeName(value) + " in {% for %} loop", node.getLine());
    }

    private void bindLoopVariables(List<String> varNames, Object item, Map<String, Object> loopScope, JinjaForBlock node) {
        if (varNames.size() == 1) {
            loopScope.put(varNames.get(0), item);
            return;
        }
        if (item instanceof List<?> parts && parts.size() == varNames.size()) {
            for (int i = 0; i < varNames.size(); i++) loopScope.put(varNames.get(i), parts.get(i));
            return;
        }
        throw new JinjaRenderException("cannot unpack loop item into " + varNames.size() + " variables {% for " + String.join(", ", varNames) + " %}", node.getLine());
    }

    // ===================== Loop-variable inventory (for scope-leak error messages) =====================

    private void collectAllLoopVariables(Node node, Set<String> out) {
        if (node == null) return;
        if (node instanceof html.ast.Program program) {
            for (Node child : program.getBody()) collectAllLoopVariables(child, out);
        } else if (node instanceof HtmlElement element) {
            for (Node child : element.getChildren()) collectAllLoopVariables(child, out);
        } else if (node instanceof JinjaForBlock forBlock) {
            out.addAll(forBlock.getVariables());
            for (Node child : forBlock.getBody()) collectAllLoopVariables(child, out);
        } else if (node instanceof JinjaIfBlock ifBlock) {
            for (Node child : ifBlock.getBody()) collectAllLoopVariables(child, out);
            if (ifBlock.getElifBranches() != null) {
                for (JinjaIfBlock.ElifBranch elif : ifBlock.getElifBranches()) {
                    for (Node child : elif.getBody()) collectAllLoopVariables(child, out);
                }
            }
            if (ifBlock.getElseBody() != null) {
                for (Node child : ifBlock.getElseBody()) collectAllLoopVariables(child, out);
            }
        }
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

    private static String stringify(Object value) {
        if (value == null) return "None"; // matches real Jinja2's str(None) rendering, and Step 1's pythonStr
        if (value instanceof Boolean b) return b ? "True" : "False";
        return String.valueOf(value);
    }

    private static String typeName(Object value) {
        return value == null ? "None" : value.getClass().getSimpleName();
    }

    private static String escapeAttribute(String value) {
        return value.replace("&", "&amp;").replace("\"", "&quot;");
    }
}
