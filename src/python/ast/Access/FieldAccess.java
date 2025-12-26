package python.ast.Access;

public class FieldAccess extends AccessPart {

    public String field;

    public FieldAccess(int lineNumber, String field) {
        super(lineNumber, "field_access");
        this.field = field;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("FieldAccess\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("field: ").append(field).append("\n");
        sb.append(indent(level)).append("}\n");
        return sb.toString();
    }
}