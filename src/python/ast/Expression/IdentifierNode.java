package python.ast.Expression;

import python.ast.Access.AccessPart;

import java.util.ArrayList;
import java.util.List;

public class IdentifierNode extends Expr {

    public String root;
    public List<AccessPart> parts;

    public IdentifierNode(int lineNumber, String root) {
        super(lineNumber, "identifier");
        this.root = root;
        parts = new ArrayList<>();
    }


    public List<AccessPart> getID() {
        return parts;
    }

    public void setParts(ArrayList<AccessPart> parts) {
        this.parts = parts;
    }

    public int getLine() {
        return lineNumber;
    }

    public void addParts(AccessPart part) {
        parts.add(part);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("Identifier\n");
        sb.append(indent(level)).append("{\n");
        sb.append(indent(level + 1)).append("root: ").append(root).append("\n");

        if (this.parts != null && !parts.isEmpty()) {
            sb.append(indent(level + 1)).append("parts:\n");
            sb.append(indent(level + 1)).append("{\n");
            for (AccessPart part : parts) {
                sb.append(part.toString(level + 2));
            }
            sb.append(indent(level + 1)).append("}\n");
        }
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}