package python.ast.CompoundStmt;

import python.ast.Statement;

import java.util.ArrayList;


public abstract class CompoundStmt extends Statement {
    public ArrayList<Statement> body;

    public CompoundStmt(int line, String name, ArrayList<Statement> body) {
        super(line, name);
        this.body = body;
    }

}