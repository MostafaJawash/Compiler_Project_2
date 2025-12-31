package html.ast;

public class JinjaVariable extends BaseAstNode {
    private final Node expression;

    public JinjaVariable(Node expression, int line) {
        super(line);
        this.expression = expression;
    }

    @Override
    public String prettyPrint(int indent) {
        return header("JinjaVariable", indent)
                + expression.prettyPrint(indent + 2)
                + footer(indent);
    }
}
