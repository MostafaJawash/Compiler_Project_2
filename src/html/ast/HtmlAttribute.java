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
        StringBuilder sb = new StringBuilder();
        sb.append(pad).append("HtmlAttribute [line=").append(line).append("] {\n");
        sb.append(pad).append("  name: ").append(name).append("\n");
        sb.append(pad).append("  value:\n");
        if (value != null) {
            String[] lines = value.prettyPrint(indent + 2).split("\n");
            for (String line : lines) {
                sb.append(line).append("\n");
            }
        } else {
            sb.append(pad).append("    <null>\n");
        }
        sb.append(pad).append("}\n");
        return sb.toString();
    }
}

