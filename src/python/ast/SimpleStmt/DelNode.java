package python.ast.SimpleStmt;


import python.ast.Expression.IdentifierNode;

import java.util.ArrayList;

public class DelNode extends SimpleStmt {


    ArrayList<IdentifierNode> targets;

    public DelNode(int line, ArrayList<IdentifierNode> targets) {
        super(line, "del_stmt");
        this.targets = targets;
    }

    public ArrayList<IdentifierNode> getNames() {
        return targets;
    }


    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("DelStmt [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("targets:\n");
        sb.append(indent(level + 1)).append("{\n");
        for (IdentifierNode t : targets) {
            sb.append(t.toString(level + 2)).append("\n");
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}