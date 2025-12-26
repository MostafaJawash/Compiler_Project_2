package python.ast.SimpleStmt;


public class PassNode extends SimpleStmt {

    public PassNode(int line) {
        super(line, "pass_stmt");
    }

    @Override
    public String toString(int level) {
        return indent(level) + "PassStmt [line=" + lineNumber + "]";
    }
}