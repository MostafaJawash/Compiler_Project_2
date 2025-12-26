package python.ast.SimpleStmt;

import python.ast.Expression.CallStmt;
import python.ast.Expression.IdentifierNode;

public class CallNode extends SimpleStmt {

    public IdentifierNode ide;
    public CallStmt callNode;

    public CallNode(int line, CallStmt callNode) {
        super(line, "call_stmt_node");
        this.ide = null;
        this.callNode = callNode;
    }

    public void setIde(IdentifierNode ide) {
        this.ide = ide;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("CallNode [line=").append(lineNumber).append("]\n");
        sb.append(indent(level)).append("{\n");
        if (ide != null) {
            sb.append(indent(level + 1)).append("identifier:\n");
            sb.append(ide.toString(level + 2)).append("\n");
        }
        sb.append(indent(level + 1)).append("call:\n");
        sb.append(callNode.toString(level + 2)).append("\n");
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}
