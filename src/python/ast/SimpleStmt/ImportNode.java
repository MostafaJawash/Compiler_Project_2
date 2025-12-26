package python.ast.SimpleStmt;


import python.ast.ASTNode;
import python.ast.Expression.IdentifierNode;

import java.util.List;


public class ImportNode extends SimpleStmt {

    public enum Type {TYPE1, TYPE2, TYPE3}

    public Type type;
    public IdentifierNode fromModule;
    public List<IdentifierNode> modules;
    public IdentifierNode aliases;
    public List<Pair<IdentifierNode, Object>> namesWithAliases;

    public ImportNode(List<IdentifierNode> modules, IdentifierNode aliases, int line) {
        super(line, "import_stmt");
        this.type = Type.TYPE1;
        this.modules = modules;
        this.aliases = aliases;
    }


    public ImportNode(IdentifierNode fromModule, List<IdentifierNode> names, IdentifierNode aliases, int line) {
        super(line, "import_stmt");
        this.type = Type.TYPE2;
        this.fromModule = fromModule;
        this.modules = names;
        this.aliases = aliases;
    }


    public ImportNode(IdentifierNode fromModule, List<Pair<IdentifierNode, Object>> namesWithAliases, int line) {
        super(line, "import_stmt");
        this.type = Type.TYPE3;
        this.fromModule = fromModule;
        this.namesWithAliases = namesWithAliases;
    }


    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append("ImportStmt [line=").append(lineNumber).append(", node name=").append(name).append("]\n");
        sb.append(indent(level)).append("{\n");
        switch (type) {
            case TYPE1:
                sb.append(indent(level + 1)).append("TYPE1: import\n");
                sb.append(indent(level + 1)).append("{\n");
                for (int i = 0; i < modules.size(); i++) {
                    IdentifierNode module = modules.get(i);
                    sb.append(module.toString(level + 2)).append("\n");

                    if (aliases != null) {
                        sb.append(indent(level + 2)).append("as\n");
                        if (aliases instanceof ASTNode) {
                            sb.append(((ASTNode) aliases).toString(level + 3)).append("\n");
                        } else {
                            sb.append(indent(level + 3)).append(aliases).append("\n");
                        }
                    }
                }
                sb.append(indent(level + 1)).append("}\n");
                break;
            case TYPE2:
                sb.append(indent(level + 1)).append("TYPE2:\n");
                sb.append(indent(level + 2)).append("from\n");
                if (fromModule instanceof ASTNode) {
                    sb.append(((ASTNode) fromModule).toString(level + 3)).append("\n");
                } else {
                    sb.append(indent(level + 3)).append(fromModule).append("\n");
                }
                sb.append(indent(level + 2)).append("import\n");
                sb.append(indent(level + 2)).append("{\n");
                for (IdentifierNode module : modules) {
                    sb.append(module.toString(level + 3)).append("\n");
                    if (aliases != null) {
                        sb.append(indent(level + 3)).append("as\n");
                        if (aliases instanceof ASTNode) {
                            sb.append(((ASTNode) aliases).toString(level + 4)).append("\n");
                        } else {
                            sb.append(indent(level + 4)).append(aliases).append("\n");
                        }
                    }
                }
                sb.append(indent(level + 2)).append("}\n");
                break;
            case TYPE3:
                sb.append(indent(level + 1)).append("TYPE3:\n");
                sb.append(indent(level + 2)).append("from\n");
                if (fromModule instanceof ASTNode) {
                    sb.append(((ASTNode) fromModule).toString(level + 3)).append("\n");
                } else {
                    sb.append(indent(level + 3)).append(fromModule).append("\n");
                }
                sb.append(indent(level + 2)).append("import\n");
                sb.append(indent(level + 2)).append("{\n");
                for (Pair<IdentifierNode, Object> p : namesWithAliases) {
                    sb.append(p.first.toString(level + 3)).append("\n");

                    if (p.second != null) {
                        sb.append(indent(level + 3)).append("as\n");
                        if (p.second instanceof ASTNode) {
                            sb.append(((ASTNode) p.second).toString(level + 4)).append("\n");
                        } else {
                            sb.append(indent(level + 4)).append(p.second).append("\n");
                        }
                    }
                }
                sb.append(indent(level + 2)).append("}\n");
                break;
            default:
                sb.append(indent(level + 1)).append("Unknown ImportStmt\n");
        }
        sb.append(indent(level)).append("}");
        return sb.toString();
    }
}

