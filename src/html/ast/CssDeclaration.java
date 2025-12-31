package html.ast;

public class CssDeclaration extends BaseAstNode {
    public CssDeclaration(int line) { super(line); }

    @Override
    public String prettyPrint(int indent) {
        return header("CssDeclaration", indent) + footer(indent);
    }
}
