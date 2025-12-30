package html.ast;

public class JinjaExpressionNode extends BaseAstNode {
    private final Node expressionContent;

    public JinjaExpressionNode(Node expressionContent, int line) {
        super(line);
        this.expressionContent = expressionContent;
    }

    @Override
    public String prettyPrint(int indent) {
        String pad = indent(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(pad).append("JinjaExpression {{ ... }} [line=").append(line).append("]\n");
        sb.append(expressionContent.prettyPrint(indent + 4));
        return sb.toString();
    }
}
