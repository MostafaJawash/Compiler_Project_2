package html.ast;

import java.util.List;

public class JinjaForBlock extends BaseAstNode {
    private final List<String> variables;
    private final Node iterable;
    private final List<Node> body;

    public JinjaForBlock(List<String> variables, Node iterable, List<Node> body, int line) {
        super(line);
        this.variables = variables;
        this.iterable = iterable;
        this.body = body;
    }

    public List<String> getVariables() {
        return variables;
    }

    public Node getIterable() {
        return iterable;
    }

    public List<Node> getBody() {
        return body;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("JinjaForBlock", level));

        sb.append(indent(level + 1)).append("Variables: ").append(variables).append("\n");

        sb.append(indent(level + 1)).append("Iterable:\n");
        if (iterable != null) sb.append(iterable.prettyPrint(level + 2));

        sb.append(indent(level + 1)).append("Body:\n");
        for (Node node : body) if (node != null) sb.append(node.prettyPrint(level + 2));

        sb.append(footer(level));
        return sb.toString();
    }
}
