package html.ast;
import java.util.List;

public class StyleElement extends HtmlElement {
    private final Stylesheet stylesheet;

    public StyleElement(Stylesheet stylesheet) {
        super("style", List.of(), List.of());
        this.stylesheet = stylesheet;
    }

    @Override
    public String prettyPrint(int indent) {
        String indentStr = " ".repeat(indent);
        return String.format("%s<StyleElement>\n%s",
                indentStr,
                stylesheet.prettyPrint(indent + 2)
        );
    }
}