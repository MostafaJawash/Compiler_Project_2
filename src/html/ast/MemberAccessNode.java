package html.ast;

public class MemberAccessNode extends BaseAstNode {
    private final Node base;
    private final String property;

    public MemberAccessNode(Node base, String property, int line) {
        super(line);
        this.base = base;
        this.property = property;
    }

    @Override
    public String prettyPrint(int indent) {
        String pad = indent(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(pad).append("MemberAccess\n");
        sb.append(base.prettyPrint(indent + 4));
        sb.append(pad).append("  property: ").append(property).append("\n");
        return sb.toString();
    }
}
