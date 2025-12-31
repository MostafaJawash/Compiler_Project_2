package python.symbolTable;

public class Symbol {
    String name;
    String type;
    int line;

    public Symbol(String name, String type, int line) {
        this.name = name;
        this.type = type;
        this.line = line;
    }
}
