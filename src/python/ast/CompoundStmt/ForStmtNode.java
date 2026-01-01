package python.ast.CompoundStmt;


import python.ast.Expression.Expr;
import python.ast.Expression.IdentifierNode;
import python.ast.Statement;

import java.util.ArrayList;

public class ForStmtNode extends CompoundStmt {

    public ArrayList<IdentifierNode> var;
    public Expr inExpr;

    public ForStmtNode(int line, ArrayList<IdentifierNode> var, Expr inExpr, ArrayList<Statement> body) {
        super(line, "for_stmt", body);
        this.var = var;
        this.inExpr = inExpr;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("ForStmt [line=").append(lineNumber).append(", node name=").append(name).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("var:\n");
        if (var != null) {
            sb.append(indent(level + 1)).append("[\n");
            for (IdentifierNode id : var) {
                sb.append(id.toString(level + 2)).append("\n");
            }
            sb.append(indent(level + 1)).append("]\n");
        }
        sb.append(indent(level + 1)).append("inExpr:\n");
        if (inExpr != null)
            sb.append(inExpr.toString(level + 2)).append("\n");
        sb.append(indent(level + 1)).append("body:\n");
        sb.append(indent(level + 1)).append("{\n");
        if (body != null) {
            for (Statement stmt : body) {
                sb.append(stmt.toString(level + 2)).append("\n");
            }
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}