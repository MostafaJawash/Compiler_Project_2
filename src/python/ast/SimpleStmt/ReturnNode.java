package python.ast.SimpleStmt;


import python.ast.Expression.Expr;

import java.util.ArrayList;

public class ReturnNode extends SimpleStmt {

    public ArrayList<Expr> values;

    public ReturnNode(int line, ArrayList<Expr> values) {
        super(line, "return_stmt");
        this.values = values;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("ReturnStmt [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("values:\n");
        sb.append(indent(level + 1)).append("{\n");
        for (Expr v : values) {
            sb.append(v.toString(level + 2)).append("\n");
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}