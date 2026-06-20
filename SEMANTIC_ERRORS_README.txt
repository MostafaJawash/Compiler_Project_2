Semantic errors added in this version:

1) Undefined Variable Error
   - Detected when a Python identifier is used before definition.
   - Example: x = y

2) Type Error
   - Detected when an invalid operator is used with an incompatible type.
   - Example: wrong_math = name - 5 when name is a string.

3) Scope Error
   - Detected when break/continue is used outside a loop, or return is used outside a function.
   - Example: break at global scope.

4) Type Mismatch Error
   - Detected when incompatible types are combined or assigned.
   - Example: final_score = total_price + 150 when total_price is a string.

5) Missing Flask Variable Error
   - Detected when a Jinja variable is used in HTML but Flask does not pass it through render_template(...).
   - Example: {{ user.name }} without render_template(..., user=user).

Main files added/modified:
- src/python/visitor/PythonAdvancedSemanticChecker.java
- src/html/visitor/HtmlJinjaCssSemanticChecker.java
- src/Main.java
- src/python/ast/Program.java
- Tests/PYTHON/Semantic tests/python_semantic_errors.txt
- Tests/HTML + JINJA + CSS/Semantic tests/semantic_template.txt

