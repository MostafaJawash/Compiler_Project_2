package html.ast;

import java.util.List;

public class JinjaIfBlock extends BaseAstNode {
    private final List<Node> body;
    private final List<Node> elseBody;

    public JinjaIfBlock(List<Node> body, List<Node> elseBody, int line) {
        super(line);
        this.body = body;
        this.elseBody = elseBody;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("JinjaIfBlock", indent));
        for (var n : body)
            if (n != null) sb.append(n.prettyPrint(indent + 2));

        for (var n : elseBody)
            if (n != null) sb.append(n.prettyPrint(indent + 2));

        sb.append(footer(indent));
        return sb.toString();
    }
}
