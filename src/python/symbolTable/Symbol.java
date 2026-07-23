package python.symbolTable;

public class Symbol {
    public String name;
    public String type;
    public String value;
    public int line;


    public Symbol(String name, String type, String value, int line) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.line = line;

    }
}
