package html.ast;

public class StyleElement extends BaseAstNode {
    private final Stylesheet stylesheet;

    public StyleElement(Stylesheet stylesheet, int line) {
        super(line);
        this.stylesheet = stylesheet;
    }

    @Override
    public String prettyPrint(int indent) {
        return header("StyleElement", indent)
                + stylesheet.prettyPrint(indent + 2)
                + footer(indent);
    }
}
