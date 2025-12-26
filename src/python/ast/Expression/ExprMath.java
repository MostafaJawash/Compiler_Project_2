package python.ast.Expression;

public class ExprMath extends Expr {

    public enum Operator {
        ADD("+"),
        SUB("-"),
        MUL("*"),
        DIV("/"),
        MOD("%"),
        POWER("**");

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


    public ExprMath(int lineNumber, Expr left, Operator operator, Expr right) {
        super(lineNumber, "expr_math");
        this.left = left;
        this.operator = operator;
        this.right = right;
    }


    public ExprMath(int lineNumber, Expr single) {
        super(lineNumber, "expr_math");
        this.left = single;
        this.operator = null;
        this.right = null;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("ExprMath [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("left:\n");
        sb.append(left.toString(level + 2)).append("\n");
        if (operator != null) {
            sb.append(indent(level + 1)).append("operator: ").append(operator).append("\n");
            sb.append(indent(level + 1)).append("right:\n");
            sb.append(right.toString(level + 2)).append("\n");
        }
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}