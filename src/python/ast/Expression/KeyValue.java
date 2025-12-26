package python.ast.Expression;

public class KeyValue extends Expr {

    public String key;
    public Expr value;

    public KeyValue(int lineNumber, String key, Expr value) {
        super(lineNumber, "key_value");
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("KeyValue\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("key:\n");
        sb.append(indent(level + 2));
        sb.append(key).append("\n");
        sb.append(indent(level + 1)).append("value:\n");
        sb.append(value.toString(level + 2)).append("\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}