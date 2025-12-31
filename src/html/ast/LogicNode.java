package html.ast;

public class LogicNode extends BaseAstNode {
    private final Node left;
    private final Node right;

    public LogicNode(Node left, Node right, int line) {
        super(line);
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(int indent) {
        return header("LogicNode", indent)
                + left.prettyPrint(indent + 2)
                + right.prettyPrint(indent + 2)
                + footer(indent);
    }
}
