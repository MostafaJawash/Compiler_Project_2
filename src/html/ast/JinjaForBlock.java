package html.ast;

import java.util.List;

public class JinjaForBlock extends BaseAstNode {
    private final List<Node> body;

    public JinjaForBlock(List<Node> body, int line) {
        super(line);
        this.body = body;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("JinjaForBlock", indent));
        for (var n : body) {
            if (n != null)
                sb.append(n.prettyPrint(indent + 2));
        }
        sb.append(footer(indent));
        return sb.toString();
    }
}
