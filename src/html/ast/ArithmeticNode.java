package html.ast;

public class ArithmeticNode extends BaseAstNode {

    public enum Operator {
        ADD, SUB, MUL, DIV, MOD
    }

    private final Node left;
    private final Node right;
    private final Operator operator;

    public ArithmeticNode(Node left, Node right, Operator operator, int line) {
        super(line);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String prettyPrint(int indent) {
        String pad = indent(indent);
        StringBuilder sb = new StringBuilder();

        sb.append(pad)
                .append("ArithmeticNode (")
                .append(operator)
                .append(")\n");

        if (left != null) {
            sb.append(left.prettyPrint(indent + 2));
        } else {
            sb.append(pad).append("  <left: null>\n");
        }

        if (right != null) {
            sb.append(right.prettyPrint(indent + 2));
        } else {
            sb.append(pad).append("  <right: null>\n");
        }

        return sb.toString();
    }

}
