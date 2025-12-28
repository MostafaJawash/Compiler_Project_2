package html.ast;
public class ArithmeticNode implements Node {
    private final String operator;
    private final Node left;
    private final Node right;

    public ArithmeticNode(String operator, Node left, Node right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(int indent) {
        String indentStr = " ".repeat(indent);
        return String.format("%sBinaryOp (%s):\n%s (Left)\n%s (Right)",
                indentStr, operator,
                left.prettyPrint(indent + 2),
                right.prettyPrint(indent + 2));
    }
}