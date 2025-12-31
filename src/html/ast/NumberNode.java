package html.ast;

public class NumberNode extends BaseAstNode {
    public NumberNode(int line) { super(line); }

    @Override
    public String prettyPrint(int indent) {
        return header("NumberNode", indent) + footer(indent);
    }
}
