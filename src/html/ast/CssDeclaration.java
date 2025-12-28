package html.ast;

public class CssDeclaration implements Node {
    private final String property;
    private final String value;
    public CssDeclaration(String property, String value) {
        this.property = property;
        this.value = value;
    }
    @Override
    public String prettyPrint(int indent) {
        return String.format("%s%s: %s;", " ".repeat(indent), property, value);
    }
}