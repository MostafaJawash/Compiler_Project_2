package python.ast.CompoundStmt;

import python.ast.Statement;

import java.util.ArrayList;

public class ElseNode extends CompoundStmt {


    public ElseNode(int line, ArrayList<Statement> body) {
        super(line, "else_stmt", body);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("ElseStmt [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
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