package html.ast;

public class StyleElement extends BaseAstNode {
    private final Stylesheet stylesheet;

    public StyleElement(Stylesheet stylesheet, int line) {
        super(line);
        this.stylesheet = stylesheet;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("StyleElement", indent));

        if (stylesheet != null)
            sb.append(stylesheet.prettyPrint(indent + 2));
        else
            sb.append(indent(indent + 2)).append("<empty stylesheet>\n");

        sb.append(footer(indent));
        return sb.toString();
    }

}
