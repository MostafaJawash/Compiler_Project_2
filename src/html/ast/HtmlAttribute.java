package html.ast;

public class HtmlAttribute extends BaseAstNode {
    private final String name;
    private final Node value;

    public HtmlAttribute(String name, Node value, int line) {
        super(line);
        this.name = name;
        this.value = value;
    }

    @Override
    public String prettyPrint(int indent) {
        String pad = indent(indent);
        String valStr = "";

        if (value != null) {
            valStr = value.prettyPrint(0).trim();
        }

        return pad + "HtmlAttribute [line=" + line + "] { name: " + name +
                ", value: " + valStr + " }\n";
    }
}

