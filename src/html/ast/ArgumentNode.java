package html.ast;

public class ArgumentNode extends BaseAstNode {
    private final String argName;
    private final Node value;

    public ArgumentNode(String argName, Node value, int line) {
        super(line);
        this.argName = argName;
        this.value = value;
    }
    @Override
    public String prettyPrint(int indent) {
        String pad = indent(indent);
        StringBuilder sb = new StringBuilder();

        sb.append(pad).append("ArgumentNode\n");

        if (argName != null && !argName.isEmpty()) {
            sb.append(pad).append("  name: ").append(argName).append("\n");
        }

        if (value != null) {
            sb.append(pad).append("  value: ");
            if (value instanceof TextNode textNode) {
                sb.append("\"").append(textNode.getText()).append("\"\n");
            } else {
                sb.append("\n").append(value.prettyPrint(indent + 4));
            }
        } else {
            sb.append(pad).append("  value: null\n");
        }

        return sb.toString();
    }

}
