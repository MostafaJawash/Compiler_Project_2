package html.ast;

public class JinjaVariable implements Node {
    private final Node expression;

    public JinjaVariable(Node expression) {
        this.expression = expression;
    }

    @Override
    public String prettyPrint(int indent) {
        String indentStr = " ".repeat(indent);
        return indentStr + "JinjaExpr: {{ \n" + expression.prettyPrint(indent + 2) + "\n" + indentStr + "}}";
    }
}