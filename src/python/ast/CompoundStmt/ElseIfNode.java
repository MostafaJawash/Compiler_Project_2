package python.ast.CompoundStmt;


import python.ast.Expression.ExprLogic;
import python.ast.Statement;

import java.util.ArrayList;

public class ElseIfNode extends CompoundStmt {

    public ExprLogic condition;

    public ElseIfNode(int line, ExprLogic condition, ArrayList<Statement> body) {
        super(line, "else_if_stmt", body);
        this.condition = condition;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("ElseIfStmt [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("condition:\n");
        sb.append(condition.toString(level + 2)).append("\n");
        sb.append(indent(level + 1)).append("body:\n");
        sb.append(indent(level + 1)).append("{\n");
        for (Statement stmt : body) {
            sb.append(stmt.toString(level + 2)).append("\n");
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}