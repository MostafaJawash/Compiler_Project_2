package html.ast;

public class TextNode extends BaseAstNode {
    private final String text;

    public TextNode(String text, int line) {
        super(line);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String prettyPrint(int level) {
        String display = text.trim();
        if (display.isEmpty()) return "";
        return indent(level) + "TextNode: \"" + display + "\"\n";
    }
}
