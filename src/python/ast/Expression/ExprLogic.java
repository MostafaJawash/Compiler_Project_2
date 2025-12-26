package python.ast.Expression;

public class ExprLogic extends Expr {

    public enum Operator {
        AND("and"),
        OR("or"),
        NOT("not"),
        LT("<"),
        GT(">"),
        EQ("=="),
        NEQ1("<>"),
        NEQ2("!="),
        LTE("<="),
        GTE(">=");

        private String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String toString() {
            return symbol;
        }
    }

    public Expr left;
    public Expr right;
    public Operator operator;

    public ExprLogic(int lineNumber, Expr left, Operator operator, Expr right) {
        super(lineNumber, "expr_logic");
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public ExprLogic(int lineNumber, Operator operator, Expr single) {
        super(lineNumber, "expr_logic");
        this.operator = operator;
        this.left = single;
        this.right = null;
    }

    public ExprLogic(int lineNumber, Expr single) {
        super(lineNumber, "expr_logic");
        this.left = single;
        this.operator = null;
        this.right = null;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("ExprLogic [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        if (left != null) {
            sb.append(indent(level + 1)).append("left:\n");
            sb.append(left.toString(level + 2)).append("\n");
        }
        if (operator != null) {
            sb.append(indent(level + 1)).append("operator: ").append(operator).append("\n");
        }
        if (right != null) {
            sb.append(indent(level + 1)).append("right:\n");
            sb.append(right.toString(level + 2)).append("\n");
        }
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}