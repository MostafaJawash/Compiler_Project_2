package python.ast.SimpleStmt;

import python.ast.ASTNode;
import python.ast.Expression.Expr;
import python.ast.Expression.IdentifierNode;


import java.util.ArrayList;


public class AssignmentNode extends SimpleStmt {


    public ArrayList<IdentifierNode> targets;

    public enum Operator {
        ASSIGN("="),
        ADD_ASSIGN("+="),
        SUB_ASSIGN("-="),
        MULT_ASSIGN("*="),
        DIV_ASSIGN("/="),
        MOD_ASSIGN("%="),
        AND_ASSIGN("&="),
        OR_ASSIGN("|="),
        XOR_ASSIGN("^="),
        LEFT_SHIFT_ASSIGN("<<="),
        RIGHT_SHIFT_ASSIGN(">>="),
        POWER_ASSIGN("**=");

        private String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String toString() {
            return symbol;
        }
    }

    public Operator operator;
    public Expr value;

    public AssignmentNode(int line, ArrayList<IdentifierNode> targets, Operator operator, Expr value) {
        super(line, "assignment_stmt");
        this.targets = targets;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("AssignmentStmt [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("targets:\n");
        sb.append(indent(level + 1)).append("{\n");
        for (IdentifierNode t : targets) {
            sb.append(t.toString(level + 2)).append("\n");
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level + 1)).append("operator: ").append(operator).append("\n");
        sb.append(indent(level + 1)).append("value:\n");
        sb.append(value.toString(level + 2)).append("\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}