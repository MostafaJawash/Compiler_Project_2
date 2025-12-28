package html.ast;

public class TextNode implements Node {
    private final String text;

    public TextNode(String text) {
        this.text = text.trim();
    }

    public String getText() {
        return text;
    }

    @Override
    public String prettyPrint(int indent) {
        if (text.trim().isEmpty()) {
            return "";
        }
        return " ".repeat(indent) + "Text: \"" + text + "\"";
    }
}