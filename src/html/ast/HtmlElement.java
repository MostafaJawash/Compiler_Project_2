package html.ast;

import java.util.List;

public class HtmlElement extends BaseAstNode {
    private final String tagName;
    private final List<HtmlAttribute> attributes;
    private final List<Node> children;

    public HtmlElement(String tagName, List<HtmlAttribute> attributes, List<Node> children, int line) {
        super(line);
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }

    @Override
    public String prettyPrint(int indent) {
        String pad = indent(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(header("HtmlElement", indent));
        sb.append(pad).append("  tag: ").append(tagName).append("\n");

        if (!attributes.isEmpty()) {
            sb.append(pad).append("  attributes:\n").append(pad).append("  {\n");
            for (var attr : attributes) sb.append(attr.prettyPrint(indent + 2));
            sb.append(pad).append("  }\n");
        }

        if (!children.isEmpty()) {
            sb.append(pad).append("  children:\n").append(pad).append("  {\n");
            for (var child : children) sb.append(child.prettyPrint(indent + 2));
            sb.append(pad).append("  }\n");
        }

        sb.append(footer(indent));
        return sb.toString();
    }
}
