package python.visitor;

import python.symbolTable.SymbolTable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PythonSemanticChecker {
    private final SymbolTable symbolTable;
    private final List<String> errors = new ArrayList<>();
    private final Set<String> definedSymbols = new HashSet<>();

    public PythonSemanticChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        // الكلمات المفتاحية
        definedSymbols.add("flask"); definedSymbols.add("Flask");
        definedSymbols.add("render_template"); definedSymbols.add("request");
        definedSymbols.add("redirect"); definedSymbols.add("url_for");
        definedSymbols.add("len"); definedSymbols.add("append"); definedSymbols.add("print");
    }

    public void check(Object root) {
        String ast = root.toString();
        // مسح تلقائي: أي متغير يظهر في جهة اليسار لعملية إسناد (Assign) يعتبر معرفاً
        for (String line : ast.split("\n")) {
            if (line.contains("Assign") || line.contains("assign")) {
                int idx = ast.indexOf("root:", ast.indexOf(line));
                if (idx != -1) {
                    String varName = ast.substring(idx + 5, ast.indexOf("}", idx)).trim();
                    definedSymbols.add(varName);
                }
            }
        }
        // الفحص الصارم
        for (String line : ast.split("\n")) {
            if (line.contains("root:")) {
                String var = line.substring(line.indexOf("root:") + 5).replace("}", "").trim();
                if (!definedSymbols.contains(var) && (symbolTable == null || symbolTable.lookup(var) == null)) {
                    errors.add("Semantic Error: Variable '" + var + "' is undefined.");
                }
            }
        }
    }
    public List<String> getErrors() { return errors; }
}