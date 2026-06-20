package python.visitor;

import java.util.*;

public class PythonTypeChecker {
    private final List<String> typeErrors = new ArrayList<>();
    private final Map<String, String> varTypes = new HashMap<>();

    public void checkTypes(Object root) {
        if (root == null) return;
        String ast = root.toString();
        String[] lines = ast.split("\n");

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();

            // تسجيل الأنواع (مع التحقق من طول النص لتجنب الخطأ)
            if (line.contains("Assign")) {
                try {
                    // نستخدم lookahead آمن
                    if (i + 1 < lines.length && lines[i + 1].contains("root:")) {
                        String var = lines[i + 1].split("root:")[1].replace("}", "").trim();
                        if (i + 2 < lines.length) {
                            if (lines[i + 2].contains("String") || lines[i + 2].contains("\"")) varTypes.put(var, "String");
                            else if (lines[i + 2].contains("Number") || lines[i + 2].contains("Integer")) varTypes.put(var, "Int");
                        }
                    }
                } catch (Exception e) { /* تجاهل الأسطر التي لا تطابق التنسيق */ }
            }

            // فحص الخطأ (مع حماية إضافية)
            if (line.contains("plus") || line.contains("BinaryOp")) {
                boolean hasString = false, hasInt = false;
                for (int j = i + 1; j < Math.min(i + 5, lines.length); j++) {
                    String val = lines[j].trim();
                    if (val.contains("root:")) {
                        try {
                            String name = val.split("root:")[1].replace("}", "").trim();
                            if ("String".equals(varTypes.get(name))) hasString = true;
                            if ("Int".equals(varTypes.get(name))) hasInt = true;
                        } catch (Exception e) {}
                    }
                    if (val.contains("String") || val.contains("\"")) hasString = true;
                    if (val.contains("Number") || val.contains("Integer")) hasInt = true;
                }
                if (hasString && hasInt) {
                    typeErrors.add("Type Error: Cannot add String and Int types.");
                }
            }
        }
    }
    public List<String> getTypeErrors() { return typeErrors; }
}