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
        for (HtmlSymbol s : currentScope.symbols) {
            if (s.name.equals(name)) {
                // Repeated sibling HTML tags are valid markup, so keep the existing
                // duplicate handling but do not report them as symbol errors.
                if (!isHtmlTagType(type)) {
                    System.err.println("Error: Symbol '" + name + "' already defined in scope: " + currentScope.name);
                }
                return;
            }
        }
        currentScope.symbols.add(new HtmlSymbol(name, type, value, line));
    }

    private boolean isHtmlTagType(String type) {
        return "Html_Element".equals(type)
                || "Div_Block".equals(type)
                || "Form_Structure".equals(type)
                || "Input_Field".equals(type)
                || "Button_Action".equals(type)
                || "Text_Area".equals(type);
    }

    public HtmlSymbol lookup(String name) {
        Scope temp = currentScope;
        while (temp != null) {
            for (HtmlSymbol s : temp.symbols) {
                if (s.name.equals(name)) return s;
            }
            temp = temp.parent;
        }
        return null;
    }

    public void printTable() {
        System.out.println("\n" + "=".repeat(85));
        System.out.println("HTML / CSS / JINJA2 SYMBOL TABLE REPORT");
        System.out.println("=".repeat(85));

        int scopeCounter = 1;

        for (Scope scope : allScopes) {
            if (!scope.symbols.isEmpty()) {
                System.out.println("\n--- SCOPE #" + scopeCounter + " ---");
                for (HtmlSymbol s : scope.symbols) {
                    System.out.printf("| Symbol: %-15s | Type: %-12s | Value: %-25s | Line: %-3d |\n",
                            s.name, s.type, s.value, s.line);
                }
                scopeCounter++;
            }
        }
        System.out.println("\n" + "=".repeat(85));
    }
}
