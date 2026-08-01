package generation;

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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Converts the Python AST into a plain tree of Map/List/primitives (node type +
 * relevant fields + children) for Gson to serialize as readable JSON - never
 * Gson-serializes the AST objects themselves. The AST classes were checked
 * first: none carry a parent pointer, so there is no circular-reference risk
 * either way, but building a fresh tree here also means Gson never has to
 * reflect over private fields on classes it doesn't know about.
 */
public final class PythonAstJsonExporter {

    private PythonAstJsonExporter() {}

    public static Map<String, Object> export(Program program) {
        Map<String, Object> node = newNode("Program");
        node.put("children", listOf(program.getChildren(), PythonAstJsonExporter::statement));
        return node;
    }

    private static Object statement(Statement stmt) {
        if (stmt == null) return null;

        if (stmt instanceof ImportNode n) return importNode(n);
        if (stmt instanceof AssignmentNode n) return assignmentNode(n);
        if (stmt instanceof CallNode n) return callNode(n);
        if (stmt instanceof ReturnNode n) return returnNode(n);
        if (stmt instanceof DelNode n) return delNode(n);
        if (stmt instanceof GlobalNode n) return globalNode(n);
        if (stmt instanceof BreakNode n) return leaf("BreakNode", n.lineNumber);
        if (stmt instanceof ContinueNode n) return leaf("ContinueNode", n.lineNumber);
        if (stmt instanceof PassNode n) return leaf("PassNode", n.lineNumber);
        if (stmt instanceof FunDefNode n) return funDefNode(n);
        if (stmt instanceof DecoratorNode n) return decoratorNode(n);
        if (stmt instanceof IfStmtNode n) return ifStmtNode(n);
        if (stmt instanceof ForStmtNode n) return forStmtNode(n);
        if (stmt instanceof WhileStmtNode n) return whileStmtNode(n);

        return unknown(stmt);
    }

    private static Object expr(Expr expr) {
        if (expr == null) return null;

        if (expr instanceof Atom n) return atom(n);
        if (expr instanceof IdentifierNode n) return identifier(n);
        if (expr instanceof ExprMath n) return exprMath(n);
        if (expr instanceof ExprLogic n) return exprLogic(n);
        if (expr instanceof ConcatStr n) return concatStr(n);
        if (expr instanceof Array n) return array(n);
        if (expr instanceof Dictionary n) return dictionary(n);
        if (expr instanceof CallStmt n) return callStmt(n);

        return unknown(expr);
    }

    private static Map<String, Object> importNode(ImportNode n) {
        Map<String, Object> node = newNode("ImportNode");
        node.put("importKind", n.type != null ? n.type.toString() : null);
        node.put("fromModule", n.fromModule != null ? identifier(n.fromModule) : null);
        node.put("modules", n.modules != null ? listOf(n.modules, PythonAstJsonExporter::identifier) : List.of());
        node.put("alias", n.aliases != null ? identifier(n.aliases) : null);
        if (n.namesWithAliases != null) {
            List<Object> pairs = new ArrayList<>();
            for (Pair<IdentifierNode, Object> p : n.namesWithAliases) {
                Map<String, Object> pairNode = new LinkedHashMap<>();
                pairNode.put("name", p.first != null ? identifier(p.first) : null);
                pairNode.put("alias", p.second instanceof IdentifierNode alias ? identifier(alias) : p.second);
                pairs.add(pairNode);
            }
            node.put("namesWithAliases", pairs);
        }
        return node;
    }

    private static Map<String, Object> assignmentNode(AssignmentNode n) {
        Map<String, Object> node = newNode("AssignmentNode");
        node.put("targets", listOf(n.targets, PythonAstJsonExporter::identifier));
        node.put("operator", n.operator.toString());
        node.put("value", expr(n.value));
        return node;
    }

    private static Map<String, Object> callNode(CallNode n) {
        Map<String, Object> node = newNode("CallNode");
        node.put("receiver", n.ide != null ? identifier(n.ide) : null);
        node.put("call", callStmt(n.callNode));
        return node;
    }

    private static Map<String, Object> returnNode(ReturnNode n) {
        Map<String, Object> node = newNode("ReturnNode");
        node.put("values", n.values != null ? listOf(n.values, PythonAstJsonExporter::expr) : List.of());
        return node;
    }

    private static Map<String, Object> delNode(DelNode n) {
        Map<String, Object> node = newNode("DelNode");
        node.put("targets", listOf(n.getNames(), PythonAstJsonExporter::identifier));
        return node;
    }

    private static Map<String, Object> globalNode(GlobalNode n) {
        Map<String, Object> node = newNode("GlobalNode");
        node.put("names", listOf(n.getNames(), PythonAstJsonExporter::identifier));
        return node;
    }

    private static Map<String, Object> funDefNode(FunDefNode n) {
        Map<String, Object> node = newNode("FunDefNode");
        node.put("name", n.nameFun != null ? n.nameFun.root : null);
        node.put("parameters", n.arguments != null ? listOf(n.arguments, PythonAstJsonExporter::pair) : List.of());
        node.put("body", listOf(n.body, PythonAstJsonExporter::statement));
        return node;
    }

    private static Map<String, Object> decoratorNode(DecoratorNode n) {
        Map<String, Object> node = newNode("DecoratorNode");
        node.put("name", n.nameDec != null ? identifier(n.nameDec) : null);
        node.put("arguments", n.arguments != null ? listOf(n.arguments, PythonAstJsonExporter::pair) : List.of());
        node.put("function", n.fun != null ? funDefNode(n.fun) : null);
        return node;
    }

    private static Map<String, Object> ifStmtNode(IfStmtNode n) {
        Map<String, Object> node = newNode("IfStmtNode");
        node.put("condition", expr(n.condition));
        node.put("body", listOf(n.body, PythonAstJsonExporter::statement));
        node.put("elifBranches", n.else_if_stmt != null ? listOf(n.else_if_stmt, PythonAstJsonExporter::elseIfNode) : List.of());
        node.put("elseBody", n.else_stmt != null ? listOf(n.else_stmt.body, PythonAstJsonExporter::statement) : null);
        return node;
    }

    private static Map<String, Object> elseIfNode(ElseIfNode n) {
        Map<String, Object> node = new LinkedHashMap<>();
        node.put("condition", expr(n.condition));
        node.put("body", listOf(n.body, PythonAstJsonExporter::statement));
        return node;
    }

    private static Map<String, Object> forStmtNode(ForStmtNode n) {
        Map<String, Object> node = newNode("ForStmtNode");
        node.put("loopVariables", listOf(n.var, PythonAstJsonExporter::identifier));
        node.put("iterable", expr(n.inExpr));
        node.put("body", listOf(n.body, PythonAstJsonExporter::statement));
        return node;
    }

    private static Map<String, Object> whileStmtNode(WhileStmtNode n) {
        Map<String, Object> node = newNode("WhileStmtNode");
        node.put("condition", expr(n.condition));
        node.put("body", listOf(n.body, PythonAstJsonExporter::statement));
        return node;
    }

    private static Map<String, Object> atom(Atom n) {
        Map<String, Object> node = newNode("Atom");
        node.put("value", n.object);
        node.put("valueType", n.type);
        return node;
    }

    private static Map<String, Object> identifier(IdentifierNode n) {
        Map<String, Object> node = newNode("IdentifierNode");
        node.put("root", n.root);
        node.put("parts", n.parts != null ? listOf(n.parts, PythonAstJsonExporter::accessPart) : List.of());
        return node;
    }

    private static Object accessPart(AccessPart part) {
        if (part instanceof FieldAccess fa) {
            Map<String, Object> node = newNode("FieldAccess");
            node.put("field", fa.field);
            return node;
        }
        if (part instanceof IndexAccess ia) {
            Map<String, Object> node = newNode("IndexAccess");
            node.put("indexType", ia.type);
            node.put("index", ia.index instanceof IdentifierNode id ? identifier(id) : ia.index);
            return node;
        }
        return unknown(part);
    }

    private static Map<String, Object> exprMath(ExprMath n) {
        Map<String, Object> node = newNode("ExprMath");
        node.put("operator", n.operator != null ? n.operator.toString() : null);
        node.put("left", expr(n.left));
        node.put("right", n.operator != null ? expr(n.right) : null);
        return node;
    }

    private static Map<String, Object> exprLogic(ExprLogic n) {
        Map<String, Object> node = newNode("ExprLogic");
        node.put("operator", n.operator != null ? n.operator.toString() : null);
        node.put("left", expr(n.left));
        node.put("right", expr(n.right));
        return node;
    }

    private static Map<String, Object> concatStr(ConcatStr n) {
        Map<String, Object> node = newNode("ConcatStr");
        node.put("parts", listOf(n.texts, PythonAstJsonExporter::expr));
        return node;
    }

    private static Map<String, Object> array(Array n) {
        Map<String, Object> node = newNode("Array");
        node.put("elements", listOf(n.body, PythonAstJsonExporter::expr));
        return node;
    }

    private static Map<String, Object> dictionary(Dictionary n) {
        Map<String, Object> node = newNode("Dictionary");
        node.put("entries", listOf(n.dic, PythonAstJsonExporter::keyValue));
        return node;
    }

    private static Map<String, Object> keyValue(KeyValue n) {
        Map<String, Object> node = newNode("KeyValue");
        node.put("key", n.key);
        node.put("value", expr(n.value));
        return node;
    }

    private static Map<String, Object> callStmt(CallStmt n) {
        Map<String, Object> node = newNode("CallStmt");
        node.put("name", n.nameCall != null ? identifier(n.nameCall) : null);
        node.put("arguments", n.arguments != null ? listOf(n.arguments, PythonAstJsonExporter::pair) : List.of());
        return node;
    }

    private static Map<String, Object> pair(Pair<Expr, Expr> p) {
        Map<String, Object> node = new LinkedHashMap<>();
        node.put("name", p.first != null ? expr(p.first) : null);
        node.put("value", p.second != null ? expr(p.second) : null);
        return node;
    }

    private static Map<String, Object> leaf(String type, int line) {
        Map<String, Object> node = newNode(type);
        node.put("line", line);
        return node;
    }

    private static Map<String, Object> unknown(ASTNode n) {
        Map<String, Object> node = newNode(n.getClass().getSimpleName());
        node.put("warning", "no explicit JSON mapping for this node type - falling back to toString()");
        node.put("raw", n.toString());
        return node;
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
