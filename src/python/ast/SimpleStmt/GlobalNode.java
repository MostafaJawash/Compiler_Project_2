package python.ast.SimpleStmt;


import python.ast.Expression.IdentifierNode;

import java.util.ArrayList;

public class GlobalNode extends SimpleStmt {

    ArrayList<IdentifierNode> names;

    public GlobalNode(int line) {
        super(line, "global_stmt");
        this.names = new ArrayList<>();
    }

    public ArrayList<IdentifierNode> getNames() {
        return names;
    }

    public void addChild(IdentifierNode node) {
        this.names.add(node);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("GlobalStmt [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("names:\n");
        sb.append(indent(level + 1)).append("{\n");
        for (IdentifierNode id : names) {
            if (id == null) {
                sb.append(indent(level + 2)).append("<null>\n");
            } else {
                sb.append(id.toString(level + 2)).append("\n");
            }
        }
        sb.append(indent(level + 1)).append("}\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}