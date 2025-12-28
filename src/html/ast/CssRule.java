package html.ast;
import java.util.List;
import java.util.stream.Collectors;

public class CssRule implements Node {
    private final String selector;
    private final List<CssDeclaration> declarations;
    public CssRule(String selector, List<CssDeclaration> declarations) {
        this.selector = selector;
        this.declarations = declarations;
    }

    @Override
    public String prettyPrint(int indent) {
        String indentStr = " ".repeat(indent);
        String decls = declarations.stream()
                .map(d -> d.prettyPrint(indent + 2))
                .collect(Collectors.joining("\n"));
        return String.format("%sRule: %s {\n%s\n%s}", indentStr, selector, decls, indentStr);
    }
}