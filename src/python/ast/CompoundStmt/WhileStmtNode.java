package python.ast.CompoundStmt;


import python.ast.Expression.ExprLogic;
import python.ast.Statement;

import java.util.ArrayList;

public class WhileStmtNode extends CompoundStmt {

    public ExprLogic condition;

    public WhileStmtNode(int line, ExprLogic condition, ArrayList<Statement> body) {
        super(line, "while_stmt", body);
        this.condition = condition;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("WhileStmt [line=").append(lineNumber).append(", node name=").append(name).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("condition:\n");
        if (condition != null) {
            sb.append(condition.toString(level + 2)).append("\n");
        }
        sb.append(indent(level + 1)).append("body:\n");
        sb.append(indent(level + 1)).append("{\n");
        if (body != null) {
            for (Statement stmt : body) {
                if (stmt != null) {
                    sb.append(stmt.toString(level + 2)).append("\n");
                }
            }
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}