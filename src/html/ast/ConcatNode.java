package html.ast;

import java.util.List;

public class ConcatNode extends BaseAstNode {
    private final List<Node> parts;

    public ConcatNode(List<Node> parts, int line) {
        super(line);
        this.parts = parts;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("ConcatNode", indent));
        for (Node n : parts) {
            if (n != null) sb.append(n.prettyPrint(indent + 2));
        }
        sb.append(footer(indent));
        return sb.toString();
    }
}
