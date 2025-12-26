package python.ast.SimpleStmt;

import python.ast.Statement;


public abstract class SimpleStmt extends Statement {
    public SimpleStmt(int line, String name) {
        super(line, name);
    }
}