package python.symbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {

    private class Scope {
        String name;
        Scope parent;
        List<Symbol> symbols = new ArrayList<>();

        Scope(String name, Scope parent) {
            this.name = name;
            this.parent = parent;
        }
    }

    private Scope currentScope;
    private List<Scope> allScopes = new ArrayList<>(); // لتخزين كافة النطاقات للطباعة النهائية

    public SymbolTable() {

        currentScope = new Scope("Global_Python", null);
        allScopes.add(currentScope);
    }

    public void pushScope(String name) {
        currentScope = new Scope(name, currentScope);
        allScopes.add(currentScope);
    }

    public void popScope() {
        if (currentScope.parent != null) {
            currentScope = currentScope.parent;
        }
    }

    public void insert(String name, String type, String value, int line) {

        for (Symbol s : currentScope.symbols) {
            if (s.name.equals(name)) {
                System.err.println("Error: Symbol '" + name + "' already defined in scope: " + currentScope.name);
                return;
            }
        }
        currentScope.symbols.add(new Symbol(name, type, value, line));
    }

    public Symbol lookup(String name) {
        Scope temp = currentScope;
        while (temp != null) {
            for (Symbol s : temp.symbols) {
                if (s.name.equals(name)) return s;
            }
            temp = temp.parent;
        }
        return null;
    }

    public void printTable() {
        System.out.println("\n" + "=".repeat(85));
        System.out.println("PYTHON SYMBOL TABLE REPORT");
        System.out.println("=".repeat(85));

        int scopeCounter = 1;

        for (Scope scope : allScopes) {

            if (!scope.symbols.isEmpty()) {
                System.out.println("\n--- SCOPE #" + scopeCounter + " [" + scope.name + "] ---");
                for (Symbol s : scope.symbols) {
                    System.out.printf("| Symbol: %-15s | Type: %-12s | Value: %-25s | Line: %-3d |\n",
                            s.name, s.type, s.value, s.line);
                }
                scopeCounter++;
            }
        }
        System.out.println("\n" + "=".repeat(85));
    }
}