package html.symbolTable;

import java.util.ArrayList;
import java.util.List;

public class HtmlSymbolTable {

    private class Scope {
        String name;
        Scope parent;
        List<HtmlSymbol> symbols = new ArrayList<>();

        Scope(String name, Scope parent) {
            this.name = name;
            this.parent = parent;
        }
    }

    private Scope currentScope;
    private List<Scope> allScopes = new ArrayList<>();

    public HtmlSymbolTable() {
        currentScope = new Scope("Global_HTML", null);
        allScopes.add(currentScope);
    }

    public void pushScope(String name) {
        currentScope = new Scope(name, currentScope);
        allScopes.add(currentScope);
    }

    public void popScope() {
        if (currentScope.parent != null) currentScope = currentScope.parent;
    }

    public void addSymbol(String name, String type, String value, int line) {
        currentScope.symbols.add(new HtmlSymbol(name, type, value, line));
    }

    public void printTable() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("HTML SYMBOL TABLE REPORT");
        System.out.println("=".repeat(60));
        for (Scope scope : allScopes) {
            System.out.println("\nSCOPE: " + scope.name.toUpperCase());
            System.out.println("-".repeat(60));
            for (HtmlSymbol s : scope.symbols) {

                System.out.printf("| %-15s | %-12s | %-15s | L: %-3d |\n",
                        s.name, s.type, s.value, s.line);
            }
        }
        System.out.println("=".repeat(60));
    }
}
