package html.ast;

public class LogicNode extends BaseAstNode {

    public enum LogicOp {
        AND, OR, NOT, EQ, NEQ, GT, GTE, LT, LTE
    }

    private final Node left;
    private final Node right;
    private final LogicOp operator;

    public LogicNode(Node left, Node right, LogicOp operator, int line) {
        super(line);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public LogicOp getOperator() {
        return operator;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("LogicNode (" + operator + ")", indent));

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
