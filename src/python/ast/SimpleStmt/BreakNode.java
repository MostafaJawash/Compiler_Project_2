package python.ast.SimpleStmt;


public class BreakNode extends SimpleStmt {

    public BreakNode(int line) {
        super(line, "break_stmt");
    }

    @Override
    public String toString(int level) {
        return indent(level) + "BreakStmt [line=" + lineNumber + "]";
    }
}
