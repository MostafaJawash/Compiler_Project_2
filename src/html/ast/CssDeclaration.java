package html.ast;

public class CssDeclaration extends BaseAstNode {
    private final String property;
    private final String value;

    public CssDeclaration(String property, String value, int line) {
        super(line);
        this.property = property;
        this.value = value;
    }

    @Override
    public String prettyPrint(int indent) {
        String pad = indent(indent);
        return pad + "CssDeclaration [line=" + line + "] { "
                + property + ": " + value + " }\n";
    }
}