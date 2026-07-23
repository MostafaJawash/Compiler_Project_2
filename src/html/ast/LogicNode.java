package html.ast;

public class LogicNode extends BaseAstNode {
    private final Node left;
    private final Node right;

    public LogicNode(Node left, Node right, int line) {
        super(line);
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("LogicNode", indent));

        if (left != null)
            sb.append(left.prettyPrint(indent + 2));
        else
            sb.append(indent(indent + 2)).append("<null left>\n");

        if (right != null)
            sb.append(right.prettyPrint(indent + 2));
        else
            sb.append(indent(indent + 2)).append("<null right>\n");

        sb.append(footer(indent));
        return sb.toString();
    }

}
