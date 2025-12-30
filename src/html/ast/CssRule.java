package html.ast;

import java.util.List;

public class CssRule extends BaseAstNode {
    private final List<CssDeclaration> declarations;

    public CssRule(List<CssDeclaration> declarations, int line) {
        super(line);
        this.declarations = declarations;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("CssRule", indent));
        for (var decl : declarations) sb.append(decl.prettyPrint(indent + 2));
        sb.append(footer(indent));
        return sb.toString();
    }
}
