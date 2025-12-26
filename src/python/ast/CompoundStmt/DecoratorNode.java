package python.ast.CompoundStmt;

import python.ast.Expression.Expr;
import python.ast.Expression.IdentifierNode;
import python.ast.SimpleStmt.Pair;
import python.ast.Statement;

import java.util.ArrayList;

public class DecoratorNode extends Statement {

    public IdentifierNode nameDec;
    public ArrayList<Pair<Expr, Expr>> arguments;
    public FunDefNode fun;

    public DecoratorNode(int line, IdentifierNode name, ArrayList<Pair<Expr, Expr>> arg, FunDefNode fun) {
        super(line, "decorator_stmt");
        this.nameDec = name;
        this.arguments = arg;
        this.fun = fun;
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
        sb.append(indent(level)).append("DecoratorStmt [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("name:\n");
        sb.append(nameDec.toString(level + 2)).append("\n");
        sb.append(indent(level + 1)).append("arguments:\n");
        sb.append(indent(level + 1)).append("{\n");
        if (arguments != null && !arguments.isEmpty()) {
            int i = 0;
            for (Pair<Expr, Expr> arg : arguments) {
                sb.append(indent(level + 2)).append("argument ").append(i++).append(":\n");
                sb.append(arg.first.toString(level + 3)).append("\n");
                if (arg.second != null) {
                    sb.append(indent(level + 3)).append("value:\n");
                    sb.append(arg.second.toString(level + 4)).append("\n");
                }
            }
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level + 1)).append("function:\n");
        sb.append(fun.toString(level + 2)).append("\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}
