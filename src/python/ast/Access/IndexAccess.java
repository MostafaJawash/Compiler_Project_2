package python.ast.Access;

import python.ast.ASTNode;

public class IndexAccess extends AccessPart {
    public Object index;
    public String type;

    public IndexAccess(int lineNumber, Object index) {
        super(lineNumber, "index_access");
        this.index = index;
        type = index.getClass().getSimpleName();
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("IndexAccess [type=").append(type).append("]\n");
        sb.append(indent(level)).append("{\n");
        if (index instanceof ASTNode) {
            sb.append(((ASTNode) index).toString(level + 1)).append("\n");
        } else if (index instanceof String) {
            sb.append(indent(level + 1)).append(index).append("\n");
        } else {
            sb.append(indent(level + 1)).append(index).append("\n");
        }
        sb.append(indent(level)).append("}\n");
        return sb.toString();
    }
}