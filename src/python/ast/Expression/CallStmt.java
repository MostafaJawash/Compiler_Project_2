package python.ast.Expression;

import python.ast.SimpleStmt.Pair;

import java.util.ArrayList;

public class CallStmt extends Expr {

    public IdentifierNode nameCall;
    public ArrayList<Pair<Expr, Expr>> arguments;

    public CallStmt(int lineNumber, IdentifierNode name) {
        super(lineNumber, "call_stmt_expr");
        this.nameCall = name;
        this.arguments = new ArrayList<>();
    }

    public void addArg(Pair<Expr, Expr> arg) {
        arguments.add(arg);
    }

    public void setArguments(ArrayList<Pair<Expr, Expr>> arguments) {
        this.arguments = arguments;
    }


    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("CallExpr [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("name:\n");
        sb.append(nameCall.toString(level + 2)).append("\n");
        sb.append(indent(level + 1)).append("arguments:\n");
        sb.append(indent(level + 1)).append("{\n");
        int i = 0;
        for (Pair<Expr, Expr> p : arguments) {
            sb.append(indent(level + 2)).append("argument ").append(i++).append(":\n");
            sb.append(p.first.toString(level + 3)).append("\n");
            if (p.second != null) {
                sb.append(indent(level + 3)).append("value:\n");
                sb.append(p.second.toString(level + 4)).append("\n");
            }
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}