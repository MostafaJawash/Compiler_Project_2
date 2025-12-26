package python.ast.SimpleStmt;


public class ContinueNode extends SimpleStmt {

    public ContinueNode(int line) {
        super(line, "continue_stmt");
    }

    @Override
    public String toString(int level) {
        return indent(level) + "ContinueStmt [line=" + lineNumber + "]";
    }
}