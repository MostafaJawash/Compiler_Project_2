package html.ast;

public class ArithmeticNode extends BaseAstNode {
    private final Node left;
    private final Node right;

    public ArithmeticNode(Node left, Node right, int line) {
        super(line);
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(int indent) {
        return header("ArithmeticNode", indent)
                + left.prettyPrint(indent + 2)
                + right.prettyPrint(indent + 2)
                + footer(indent);
    }
}
