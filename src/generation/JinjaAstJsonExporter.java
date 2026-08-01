package generation;

import html.ast.ArgumentNode;
import html.ast.ArithmeticNode;
import html.ast.ConcatNode;
import html.ast.CssDeclaration;
import html.ast.CssRule;
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
import html.ast.Stylesheet;
import html.ast.TextNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Converts a Jinja/HTML AST (built by AstBuilder) into a plain tree of
 * Map/List/primitives for Gson - mirrors PythonAstJsonExporter's approach:
 * build a fresh tree, never hand Gson the AST objects themselves. These AST
 * classes were checked first too: no parent pointers, no circular-reference risk.
 */
public final class JinjaAstJsonExporter {

    private JinjaAstJsonExporter() {}

    @SuppressWarnings("unchecked")
    public static Map<String, Object> export(Node root) {
        Object result = node(root);
        return result instanceof Map ? (Map<String, Object>) result : newNode("null");
    }

    private static Object node(Node n) {
        if (n == null) return null;

        if (n instanceof html.ast.Program p) {
            Map<String, Object> out = newNode("Program");
            out.put("body", listOf(p.getBody(), JinjaAstJsonExporter::node));
            return out;
        }
        if (n instanceof HtmlElement e) {
            Map<String, Object> out = newNode("HtmlElement");
            out.put("tag", e.getTagName());
            out.put("attributes", listOf(e.getAttributes(), JinjaAstJsonExporter::node));
            out.put("children", listOf(e.getChildren(), JinjaAstJsonExporter::node));
            return out;
        }
        if (n instanceof HtmlAttribute a) {
            Map<String, Object> out = newNode("HtmlAttribute");
            out.put("name", a.getName());
            out.put("value", node(a.getValue()));
            return out;
        }
        if (n instanceof IdentifierNode id) {
            Map<String, Object> out = newNode("IdentifierNode");
            out.put("name", id.getName());
            return out;
        }
        if (n instanceof MemberAccessNode m) {
            Map<String, Object> out = newNode("MemberAccessNode");
            out.put("field", m.getField());
            out.put("target", node(m.getTarget()));
            return out;
        }
        if (n instanceof FunctionNode f) {
            Map<String, Object> out = newNode("FunctionNode");
            out.put("name", f.getFunctionName());
            out.put("arguments", listOf(f.getArguments(), JinjaAstJsonExporter::node));
            return out;
        }
        if (n instanceof ArgumentNode arg) {
            Map<String, Object> out = newNode("ArgumentNode");
            out.put("argName", arg.getArgName());
            out.put("value", node(arg.getValue()));
            return out;
        }
        if (n instanceof ArithmeticNode a) {
            Map<String, Object> out = newNode("ArithmeticNode");
            out.put("operator", a.getOperator() != null ? a.getOperator().toString() : null);
            out.put("left", node(a.getLeft()));
            out.put("right", node(a.getRight()));
            return out;
        }
        if (n instanceof LogicNode l) {
            Map<String, Object> out = newNode("LogicNode");
            out.put("operator", l.getOperator() != null ? l.getOperator().toString() : null);
            out.put("left", node(l.getLeft()));
            out.put("right", node(l.getRight()));
            return out;
        }
        if (n instanceof ConcatNode c) {
            Map<String, Object> out = newNode("ConcatNode");
            out.put("parts", listOf(c.getParts(), JinjaAstJsonExporter::node));
            return out;
        }
        if (n instanceof JinjaForBlock f) {
            Map<String, Object> out = newNode("JinjaForBlock");
            out.put("loopVariables", new ArrayList<Object>(f.getVariables()));
            out.put("iterable", node(f.getIterable()));
            out.put("body", listOf(f.getBody(), JinjaAstJsonExporter::node));
            return out;
        }
        if (n instanceof JinjaIfBlock i) {
            Map<String, Object> out = newNode("JinjaIfBlock");
            out.put("condition", node(i.getCondition()));
            out.put("body", listOf(i.getBody(), JinjaAstJsonExporter::node));
            List<Object> elifs = new ArrayList<>();
            if (i.getElifBranches() != null) {
                for (JinjaIfBlock.ElifBranch elif : i.getElifBranches()) {
                    Map<String, Object> elifNode = new LinkedHashMap<>();
                    elifNode.put("condition", node(elif.getCondition()));
                    elifNode.put("body", listOf(elif.getBody(), JinjaAstJsonExporter::node));
                    elifs.add(elifNode);
                }
            }
            out.put("elifBranches", elifs);
            out.put("elseBody", i.getElseBody() != null ? listOf(i.getElseBody(), JinjaAstJsonExporter::node) : List.of());
            return out;
        }
        if (n instanceof TextNode t) {
            Map<String, Object> out = newNode("TextNode");
            out.put("text", t.getText());
            return out;
        }
        if (n instanceof NumberNode num) {
            Map<String, Object> out = newNode("NumberNode");
            out.put("value", num.getValue());
            return out;
        }
        if (n instanceof StyleElement || n instanceof Stylesheet || n instanceof CssRule || n instanceof CssDeclaration) {
            Map<String, Object> out = newNode(n.getClass().getSimpleName());
            out.put("note", "CSS AST classes expose no public accessors in this codebase - not serialized (structure intentionally left untouched)");
            return out;
        }

        Map<String, Object> out = newNode(n.getClass().getSimpleName());
        out.put("warning", "no explicit JSON mapping for this node type - falling back to prettyPrint()");
        out.put("raw", n.prettyPrint(0));
        return out;
    }

    private static Map<String, Object> newNode(String type) {
        Map<String, Object> node = new LinkedHashMap<>();
        node.put("type", type);
        return node;
    }

    private static <T> List<Object> listOf(List<T> items, Function<T, Object> mapper) {
        List<Object> out = new ArrayList<>();
        if (items == null) return out;
        for (T item : items) out.add(mapper.apply(item));
        return out;
    }
}
