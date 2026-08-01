package html.ast;

import java.util.List;

public class JinjaIfBlock extends BaseAstNode {

    /** One {% elif cond %}...{% endif/elif/else %} clause: its own condition + body. */
    public static final class ElifBranch {
        private final Node condition;
        private final List<Node> body;

        public ElifBranch(Node condition, List<Node> body) {
            this.condition = condition;
            this.body = body;
        }

        public Node getCondition() {
            return condition;
        }

        public List<Node> getBody() {
            return body;
        }
    }

    private final Node condition;
    private final List<Node> body;
    private final List<ElifBranch> elifBranches;
    private final List<Node> elseBody;

    public JinjaIfBlock(Node condition, List<Node> body, List<ElifBranch> elifBranches, List<Node> elseBody, int line) {
        super(line);
        this.condition = condition;
        this.body = body;
        this.elifBranches = elifBranches;
        this.elseBody = elseBody;
    }

    public Node getCondition() {
        return condition;
    }

    public List<Node> getBody() {
        return body;
    }

    public List<ElifBranch> getElifBranches() {
        return elifBranches;
    }

    public List<Node> getElseBody() {
        return elseBody;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(header("JinjaIfBlock", indent));

        sb.append(indent(indent + 2)).append("condition:\n");
        if (condition != null) sb.append(condition.prettyPrint(indent + 4));

        sb.append(indent(indent + 2)).append("body:\n");
        for (Node n : body) if (n != null) sb.append(n.prettyPrint(indent + 4));

        if (elifBranches != null) {
            for (ElifBranch elif : elifBranches) {
                sb.append(indent(indent + 2)).append("elif:\n");
                if (elif.getCondition() != null) sb.append(elif.getCondition().prettyPrint(indent + 4));
                for (Node n : elif.getBody()) if (n != null) sb.append(n.prettyPrint(indent + 4));
            }
        }

        if (elseBody != null && !elseBody.isEmpty()) {
            sb.append(indent(indent + 2)).append("else:\n");
            for (Node n : elseBody) if (n != null) sb.append(n.prettyPrint(indent + 4));
        }

        sb.append(footer(indent));
        return sb.toString();
    }
}
