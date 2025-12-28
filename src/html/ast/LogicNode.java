package html.ast;

public class LogicNode implements Node {
    private final String operator;
    private final Node left;
    private final Node right;

    public LogicNode(String operator, Node left, Node right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(int indent) {
        String indentStr = " ".repeat(indent);
        return String.format("%sLogicOp (%s):\n%s\n%s",
                indentStr,
                operator,
                left.prettyPrint(indent + 2),
                right.prettyPrint(indent + 2)
        );
    }
}