package python.symbolTable;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Symbol> symbols = new HashMap<>();
    private SymbolTable parent;

    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }

    public void insert(String name, String type, int line) {
        if (!symbols.containsKey(name)) {
            symbols.put(name, new Symbol(name, type, line));
        } else {
            System.err.println("Error: " + name + " already defined in this scope.");
        }
    }

    public Symbol lookup(String name) {
        if (symbols.containsKey(name)) return symbols.get(name);
        if (parent != null) return parent.lookup(name);
        return null;
    }

    public void printTable() {
        System.out.println("\n--- Symbol Table ---");
        if (symbols.isEmpty()) {
            System.out.println("(Empty Scope)");
        } else {
            for (Symbol s : symbols.values()) {
                System.out.println("Node: " + s.name + " | Type: " + s.type + " | Line: " + s.line);
            }
        }

        if (parent != null) {
            System.out.println(">>> Linked to Parent Scope:");
            parent.printTable();
        }
    }

    public SymbolTable getParent() {
        return parent;
    }
}