package html.ast;

public class TextNode extends BaseAstNode {
    private final String text;

    public TextNode(String text, int line) {
        super(line);
        this.text = text.trim();
    }

    @Override
    public String prettyPrint(int indent) {
        if (text.isEmpty()) return "";
        String pad = indent(indent);
        return pad + "TextNode \"" + text + "\" [line=" + line + "]\n";
    }
}
