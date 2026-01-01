package html.ast;

public class MemberAccessNode extends BaseAstNode {
    private final Node target;
    private final String field;

    public MemberAccessNode(Node target, String field, int line) {
        super(line);
        this.target = target;
        this.field = field;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("MemberAccess (field: ").append(field).append(")\n");
        if (target != null) {
            sb.append(target.prettyPrint(level + 1));
        }
        return sb.toString();
    }
}