package html.ast;
import java.util.List;
import java.util.stream.Collectors;

public class HtmlElement implements Node {
    private final String tagName;
    private final List<HtmlAttribute> attributes;
    private final List<Node> children;

    public HtmlElement(String tagName, List<HtmlAttribute> attributes, List<Node> children) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }

    @Override
    public String prettyPrint(int indent) {
        String indentStr = " ".repeat(indent);
        String attrs = attributes.stream()
                .map(attr -> attr.prettyPrint(0))
                .collect(Collectors.joining(" "));
        String childrenStr = children.stream()
                .map(node -> node.prettyPrint(indent + 2))
                .collect(Collectors.joining("\n"));

        return String.format("%s<Element: %s%s>\n%s",
                indentStr,
                tagName,
                (attrs.isEmpty() ? "" : " " + attrs),
                (childrenStr.isEmpty() ? "" : childrenStr)
        );
    }
}