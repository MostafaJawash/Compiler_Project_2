package python.ast.Expression;

import python.ast.ASTNode;

import java.util.ArrayList;

public class ConcatStr extends Expr {


    public ArrayList<Expr> texts;

    public ConcatStr(int lineNumber, ArrayList<Expr> texts) {
        super(lineNumber, "concat_str");
        this.texts = texts;
    }


    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("ConcatStr [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("texts:\n");
        sb.append(indent(level + 1)).append("{\n");
        for (int i = 0; i < texts.size(); i++) {
            Object t = texts.get(i);
            if (t instanceof ASTNode) {
                sb.append(((ASTNode) t).toString(level + 2));
            } else {
                sb.append(indent(level + 2)).append(t.toString());
            }
            if (i < texts.size() - 1) sb.append(" +");
            sb.append("\n");
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}