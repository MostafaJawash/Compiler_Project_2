package python.ast.Expression;

import java.util.ArrayList;

public class Dictionary extends Expr {

    public ArrayList<KeyValue> dic;

    public Dictionary(int lineNumber, ArrayList<KeyValue> dic) {
        super(lineNumber, "dictionary");
        this.dic = dic;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("Dictionary [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        for (KeyValue kv : dic) {
            sb.append(kv.toString(level + 1)).append("\n");
        }
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}