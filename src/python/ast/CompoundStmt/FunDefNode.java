package python.ast.CompoundStmt;


import python.ast.Expression.Expr;
import python.ast.Expression.IdentifierNode;
import python.ast.SimpleStmt.Pair;
import python.ast.Statement;

import java.util.ArrayList;

public class FunDefNode extends CompoundStmt {

    public IdentifierNode nameFun;
    public ArrayList<Pair<Expr, Expr>> arguments;

    public FunDefNode(int line, IdentifierNode name, ArrayList<Pair<Expr, Expr>> arguments, ArrayList<Statement> body) {
        super(line, "fun_def", body);
        this.nameFun = name;
        this.arguments = arguments;
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
        sb.append(indent(level)).append("FunStmt [line=").append(lineNumber).append(", node name=").append(name).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("name:\n");
        if (nameFun != null)
            sb.append(nameFun.toString(level + 2)).append("\n");
        sb.append(indent(level + 1)).append("arguments:\n");
        sb.append(indent(level + 1)).append("{\n");
        if (arguments != null) {
            int i = 0;
            for (Pair<Expr, Expr> arg : arguments) {
                sb.append(indent(level + 2)).append("argument ").append(i++).append(":\n");
                if (arg.first != null)
                    sb.append(arg.first.toString(level + 3)).append("\n");
                if (arg.second != null) {
                    sb.append(indent(level + 3)).append("value:\n");
                    sb.append(arg.second.toString(level + 4)).append("\n");
                }
            }
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level + 1)).append("body:\n");
        sb.append(indent(level + 1)).append("{\n");
        if (body != null) {
            for (Statement stmt : body) {
                if (stmt != null)
                    sb.append(stmt.toString(level + 2)).append("\n");
            }
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}