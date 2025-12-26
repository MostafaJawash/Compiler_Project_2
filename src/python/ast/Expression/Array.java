package python.ast.Expression;

import java.util.ArrayList;

public class Array extends Expr {

    public ArrayList<Expr> body;

    public Array(int lineNumber, ArrayList<Expr> body) {
        super(lineNumber, "array");
        this.body = body;
    }


    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("Array [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("elements:\n");
        sb.append(indent(level + 1)).append("{\n");
        for (Expr e : body) {
            sb.append(e.toString(level + 2)).append("\n");
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}