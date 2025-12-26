package python.ast.CompoundStmt;


import python.ast.Expression.ExprLogic;
import python.ast.Statement;

import java.util.ArrayList;

public class IfStmtNode extends CompoundStmt {

    public ExprLogic condition;
    public ArrayList<ElseIfNode> else_if_stmt;
    public ElseNode else_stmt;

    public IfStmtNode(int line, ExprLogic condition, ArrayList<Statement> body) {
        super(line, "if_stmt", body);
        this.condition = condition;
        else_if_stmt = new ArrayList<>();
    }

    public void addElseIf(ElseIfNode else_if_stmt) {
        this.else_if_stmt.add(else_if_stmt);
    }

    public void addElse(ElseNode else_stmt) {
        this.else_stmt = else_stmt;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("IfStmt [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("condition:\n");
        sb.append(condition.toString(level + 2)).append("\n");
        sb.append(indent(level + 1)).append("body:\n");
        sb.append(indent(level + 1)).append("{\n");
        for (Statement stmt : body) {
            sb.append(stmt.toString(level + 2)).append("\n");
        }
        sb.append(indent(level + 1)).append("}\n");
        for (ElseIfNode node : else_if_stmt) {
            sb.append(indent(level + 1)).append("elif:\n");
            sb.append(node.toString(level + 2)).append("\n");
        }
        if (else_stmt != null) {
            sb.append(indent(level + 1)).append("else:\n");
            sb.append(else_stmt.toString(level + 2)).append("\n");
        }
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}