package html.ast;

import java.util.List;

public class Program extends BaseAstNode {
    private final List<Node> body;

    public Program(List<Node> body, int line) {
        super(line);
        this.body = body;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append("Program [line=").append(line).append("]\n{\n");
        for (var node : body) sb.append(node.prettyPrint(2));
        sb.append("}\n");
        return sb.toString();
    }
}
