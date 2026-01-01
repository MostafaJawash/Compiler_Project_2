package html.ast;

import java.util.List;

public class CssRule extends BaseAstNode {

    private final String selector;
    private final List<CssDeclaration> declarations;

    public CssRule(String selector, List<CssDeclaration> declarations, int line) {
        super(line);
        this.selector = selector;
        this.declarations = declarations;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(header("CssRule", indent));

        sb.append(indent(indent + 2))
                .append("selector: ")
                .append(selector != null ? selector : "<unknown>")
                .append("\n");

        if (declarations != null && !declarations.isEmpty()) {
            for (var decl : declarations) {
                if (decl != null)
                    sb.append(decl.prettyPrint(indent + 2));
            }
        } else {
            sb.append(indent(indent + 2)).append("<no declarations>\n");
        }

        sb.append(footer(indent));
        return sb.toString();
    }
}
