package python.ast;

import java.util.ArrayList;

public class Program extends ASTNode {
    ArrayList<Statement> children;

    public Program(int line) {
        super(line, "Program");
        this.children = new ArrayList<>();
    }

    public void addChild(Statement child) {
        this.children.add(child);
    }


    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append("Program\n{\n");
        for (Statement s : children) {
            sb.append(s.toString(level + 1)).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}