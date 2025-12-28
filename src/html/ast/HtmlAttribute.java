package html.ast;

public class HtmlAttribute implements Node {
    private final String name;
    private final String value;

    public HtmlAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String prettyPrint(int indent) {
        return String.format("%s=\"%s\"", name, value);
    }
}