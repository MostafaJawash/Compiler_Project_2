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
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("HtmlElement <" + tagName + ">", level));

        if (!attributes.isEmpty()) {
            sb.append(indent(level + 1)).append("Attributes:\n");
            for (var attr : attributes) sb.append(attr.prettyPrint(level + 2));
        }

        if (!children.isEmpty()) {
            sb.append(indent(level + 1)).append("Children:\n");
            for (var child : children) sb.append(child.prettyPrint(level + 2));
        }

        sb.append(footer(level));
        return sb.toString();
    }
}