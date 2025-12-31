package python.visitor;
import python.generated.pythonParser;
import python.generated.pythonParserBaseVisitor;
import python.ast.ASTNode;
import python.ast.Access.AccessPart;
import python.ast.Access.FieldAccess;
import python.ast.Access.IndexAccess;
import python.ast.CompoundStmt.*;
import python.ast.Expression.*;
import python.ast.Program;
import python.ast.SimpleStmt.*;
import python.ast.Statement;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import python.symbolTable.SymbolTable;
import python.symbolTable.Symbol;
import java.util.ArrayList;
import java.util.List;

public class visitorAst extends pythonParserBaseVisitor {
    public SymbolTable symbolTable = new SymbolTable(null); // إنشاء الجدول العام

    @Override
    public Program visitFile_input(pythonParser.File_inputContext ctx) {
        Program program = new Program(ctx.getStart().getLine());
        for (int i = 0; i < ctx.stmt().size(); i++) {
            ASTNode node = (ASTNode) visit(ctx.stmt(i));
            program.addChild((Statement) node);
        }
        return program;
    }

    @Override
    public ASTNode visitSimple_stmt_label(pythonParser.Simple_stmt_labelContext ctx) {
        return (ASTNode) visit(ctx.simple_stmt());
    }

    @Override
    public ASTNode visitCompound_stmt_label(pythonParser.Compound_stmt_labelContext ctx) {
        return (ASTNode) visit(ctx.compound_stmt());
    }

    private AssignmentNode buildOpAssignment(pythonParser.TargetContext targetCtx, pythonParser.Value_stmtContext valueCtx, AssignmentNode.Operator op, int line) {
        ArrayList<IdentifierNode> targets = new ArrayList<>();
        targets.add((IdentifierNode) visit(targetCtx));
        Expr value = (Expr) visit(valueCtx);
        return new AssignmentNode(line, targets, op, value);
    }

    @Override
    public ASTNode visitSimple_stmt_assignment(pythonParser.Simple_stmt_assignmentContext ctx) {
        return (ASTNode) visit(ctx.assignment());
    }

    @Override
    public ASTNode visitSimple_stmt_call(pythonParser.Simple_stmt_callContext ctx) {
        IdentifierNode ide = null;
        if (ctx.IDENTIFIER(0) != null) {
            ide = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER(0).getText());
            for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
                ide.addParts(new FieldAccess(ctx.getStart().getLine(), ctx.IDENTIFIER(i).getText()));
            }
        }
        CallNode call = new CallNode(ctx.getStart().getLine(), (CallStmt) visit(ctx.call_stmt()));
        call.setIde(ide);
        return call;
    }

    @Override
    public ASTNode visitSimple_stmt_import(pythonParser.Simple_stmt_importContext ctx) {
        return (ASTNode) visit(ctx.import_stmt());
    }

    @Override
    public ASTNode visitSimple_stmt_return(pythonParser.Simple_stmt_returnContext ctx) {
        return (ASTNode) visit(ctx.return_stmt());
    }

    @Override
    public ASTNode visitSimple_stmt_del(pythonParser.Simple_stmt_delContext ctx) {
        return (ASTNode) visit(ctx.del_stmt());
    }

    @Override
    public ASTNode visitSimple_stmt_global(pythonParser.Simple_stmt_globalContext ctx) {
        return (ASTNode) visit(ctx.global_stmt());
    }

    @Override
    public ASTNode visitSimple_stmt_break(pythonParser.Simple_stmt_breakContext ctx) {
        return new BreakNode(ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitSimple_stmt_continue(pythonParser.Simple_stmt_continueContext ctx) {
        return new ContinueNode(ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitSimple_stmt_pass(pythonParser.Simple_stmt_passContext ctx) {
        return new PassNode(ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitGlobal_stmt(pythonParser.Global_stmtContext ctx) {
        GlobalNode global = new GlobalNode(ctx.getStart().getLine());
        for (TerminalNode id : ctx.IDENTIFIER()) {
            IdentifierNode node = new IdentifierNode(ctx.getStart().getLine(), id.getText());
            global.addChild(node);
        }
        return global;
    }

    @Override
    public ASTNode visitAssignment_multiple(pythonParser.Assignment_multipleContext ctx) {
        int line = ctx.getStart().getLine();
        for (pythonParser.TargetContext t : ctx.target()) {
            String varName = t.getText();
            symbolTable.insert(varName, "Variable", line);
        }
        ArrayList<IdentifierNode> targets = new ArrayList<>();
        for (pythonParser.TargetContext t : ctx.target()) {
            targets.add((IdentifierNode) visit(t));
        }
        Expr value = (Expr) visit(ctx.value_stmt());

        return new AssignmentNode(line, targets, AssignmentNode.Operator.ASSIGN, value);
    }

    @Override
    public ASTNode visitAssignment_add(pythonParser.Assignment_addContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.ADD_ASSIGN, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitAssignment_sub(pythonParser.Assignment_subContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.SUB_ASSIGN, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitAssignment_mult(pythonParser.Assignment_multContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.MULT_ASSIGN, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitAssignment_div(pythonParser.Assignment_divContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.DIV_ASSIGN, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitAssignment_mod(pythonParser.Assignment_modContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.MOD_ASSIGN, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitAssignment_and(pythonParser.Assignment_andContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.AND_ASSIGN, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitAssignment_or(pythonParser.Assignment_orContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.OR_ASSIGN, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitAssignment_xor(pythonParser.Assignment_xorContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.XOR_ASSIGN, ctx.getStart().getLine());
    }


    @Override
    public ASTNode visitAssignment_lshift(pythonParser.Assignment_lshiftContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.LEFT_SHIFT_ASSIGN, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitAssignment_rshift(pythonParser.Assignment_rshiftContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.RIGHT_SHIFT_ASSIGN, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitAssignment_power(pythonParser.Assignment_powerContext ctx) {
        return buildOpAssignment(ctx.target(), ctx.value_stmt(), AssignmentNode.Operator.POWER_ASSIGN, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitTarget(pythonParser.TargetContext ctx) {
        IdentifierNode node = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER().getText());
        ArrayList<AccessPart> accessPart = null;
        if (ctx.suffix() != null) {
            accessPart = (ArrayList<AccessPart>) visit(ctx.suffix());
        }
        node.setParts(accessPart);
        return node;
    }

    @Override
    public ArrayList<AccessPart> visitSuffix(pythonParser.SuffixContext ctx) {
        ArrayList<AccessPart> parts = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode) {
                TerminalNode tn = (TerminalNode) child;
                if (tn.getSymbol().getType() == pythonParser.IDENTIFIER) {
                    parts.add(new FieldAccess(tn.getSymbol().getLine(), tn.getText()));
                }
            } else if (child instanceof pythonParser.Value_indexContext) {
                parts.add((AccessPart) visit(child));
            }
        }
        return parts;
    }

    @Override
    public ASTNode visitValue_stmt_identifier(pythonParser.Value_stmt_identifierContext ctx) {
        IdentifierNode id = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER(0).getText());
        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            id.addParts(new FieldAccess(ctx.getStart().getLine(), ctx.IDENTIFIER(i).getText()));
        }
        for (int i = 0; i < ctx.value_index().size(); i++) {
            id.addParts((AccessPart) visit(ctx.value_index(i)));
        }
        return id;
    }

    @Override
    public ASTNode visitValue_stmt_atom(pythonParser.Value_stmt_atomContext ctx) {
        return (ASTNode) visit(ctx.atom());
    }

    @Override
    public ASTNode visitValue_stmt_call(pythonParser.Value_stmt_callContext ctx) {
        IdentifierNode node = null;
        if (ctx.IDENTIFIER(0) != null) {
            node = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER(0).getText());
            for (int i = 1; i < ctx.IDENTIFIER().size(); i++)
                node.addParts(new FieldAccess(ctx.getStart().getLine(), ctx.IDENTIFIER(i).getText()));
        }
        CallStmt call = (CallStmt) visit(ctx.call_stmt());//expr
        if (node != null) {
            node.addParts(new FieldAccess(ctx.getStart().getLine(), call.nameCall.root));
            call.nameCall = node;
        }
        return call;
    }

    @Override
    public ASTNode visitValue_stmt_array(pythonParser.Value_stmt_arrayContext ctx) {
        return (ASTNode) visit(ctx.array());
    }

    @Override
    public ASTNode visitValue_stmt_expr(pythonParser.Value_stmt_exprContext ctx) {
        return (ASTNode) visit(ctx.expr_math());
    }

    @Override
    public ASTNode visitValue_stmt_dict(pythonParser.Value_stmt_dictContext ctx) {
        return (ASTNode) visit(ctx.dictionary());
    }

    @Override
    public ASTNode visitReturn_stmt(pythonParser.Return_stmtContext ctx) {
        ArrayList<Expr> values = new ArrayList<>();
        if (ctx.value_stmt() != null) {
            for (pythonParser.Value_stmtContext valCtx : ctx.value_stmt()) {
                Expr expr = (Expr) visit(valCtx);
                values.add(expr);
            }
        }
        int line = ctx.getStart().getLine();
        return new ReturnNode(line, values);
    }

    @Override
    public ASTNode visitDel_stmt(pythonParser.Del_stmtContext ctx) {
        ArrayList<IdentifierNode> targets = new ArrayList<>();
        int line = ctx.getStart().getLine();
        int i = 1;
        while (i < ctx.getChildCount()) {
            String rootName = ctx.getChild(i).getText();
            IdentifierNode idNode = new IdentifierNode(line, rootName);
            i++;
            while (i < ctx.getChildCount()) {
                String childText = ctx.getChild(i).getText();
                if (childText.equals(",")) {
                    i++;
                    break;
                }
                if (childText.equals(".")) {
                    String fieldName = ctx.getChild(i + 1).getText();
                    idNode.addParts(new FieldAccess(line, fieldName));
                    i += 2;
                } else {
                    Object index = visit(ctx.getChild(i));
                    idNode.addParts((AccessPart) index);
                    i++;
                }
            }
            targets.add(idNode);
        }
        return new DelNode(line, targets);
    }

    @Override
    public ASTNode visitMathAtom_call(pythonParser.MathAtom_callContext ctx) {
        return (ASTNode) visit(ctx.call_stmt());
    }

    @Override
    public ASTNode visitMathAtom_float(pythonParser.MathAtom_floatContext ctx) {
        return new Atom(ctx.getStart().getLine(), "float", Double.parseDouble(ctx.FLOAT_NUMBER().getText()));
    }

    @Override
    public ASTNode visitMathAtom_num(pythonParser.MathAtom_numContext ctx) {
        return new Atom(ctx.getStart().getLine(), "number", Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public ASTNode visitMathAtom_id(pythonParser.MathAtom_idContext ctx) {
        return new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER().getText());
    }

    @Override
    public ASTNode visitMathAtom_paren(pythonParser.MathAtom_parenContext ctx) {
        return (ASTNode) visit(ctx.expr_math());
    }

    @Override
    public ASTNode visitMathPow_power(pythonParser.MathPow_powerContext ctx) {
        Expr left = (Expr) visit(ctx.math_atom());
        Expr right = (Expr) visit(ctx.math_power());
        return new ExprMath(ctx.getStart().getLine(), left, ExprMath.Operator.POWER, right);
    }

    @Override
    public ASTNode visitMathPow_atom(pythonParser.MathPow_atomContext ctx) {
        return (ASTNode) visit(ctx.math_atom());
    }

    @Override
    public ASTNode visitMathMul_div(pythonParser.MathMul_divContext ctx) {
        Expr left = (Expr) visit(ctx.math_mul());
        Expr right = (Expr) visit(ctx.math_power());
        return new ExprMath(ctx.getStart().getLine(), left, ExprMath.Operator.DIV, right);
    }

    @Override
    public ASTNode visitMathMul_mod(pythonParser.MathMul_modContext ctx) {
        Expr left = (Expr) visit(ctx.math_mul());
        Expr right = (Expr) visit(ctx.math_power());
        return new ExprMath(ctx.getStart().getLine(), left, ExprMath.Operator.MOD, right);
    }

    @Override
    public ASTNode visitMathMul_power(pythonParser.MathMul_powerContext ctx) {
        return (ASTNode) visit(ctx.math_power());
    }

    @Override
    public ASTNode visitMathMul_mul(pythonParser.MathMul_mulContext ctx) {
        Expr left = (Expr) visit(ctx.math_mul());
        Expr right = (Expr) visit(ctx.math_power());
        return new ExprMath(ctx.getStart().getLine(), left, ExprMath.Operator.MUL, right);
    }

    @Override
    public ASTNode visitMathAdd_add(pythonParser.MathAdd_addContext ctx) {
        Expr left = (Expr) visit(ctx.math_add());
        Expr right = (Expr) visit(ctx.math_mul());
        return new ExprMath(ctx.getStart().getLine(), left, ExprMath.Operator.ADD, right);
    }

    @Override
    public ASTNode visitMathAdd_mul(pythonParser.MathAdd_mulContext ctx) {
        return (ASTNode) visit(ctx.math_mul());
    }

    @Override
    public ASTNode visitMathAdd_sub(pythonParser.MathAdd_subContext ctx) {
        Expr left = (Expr) visit(ctx.math_add());
        Expr right = (Expr) visit(ctx.math_mul());
        return new ExprMath(ctx.getStart().getLine(), left, ExprMath.Operator.SUB, right);
    }

    @Override
    public ASTNode visitExpr_math(pythonParser.Expr_mathContext ctx) {
        return (ASTNode) visit(ctx.math_add());
    }

    @Override
    public ASTNode visitCompound_stmt_fun(pythonParser.Compound_stmt_funContext ctx) {
        return (ASTNode) visit(ctx.fun_def());
    }

    @Override
    public ASTNode visitCompound_stmt_if(pythonParser.Compound_stmt_ifContext ctx) {
        return (ASTNode) visit(ctx.if_stmt());
    }

    @Override
    public ASTNode visitCompound_stmt_for(pythonParser.Compound_stmt_forContext ctx) {
        return (ASTNode) visit(ctx.for_stmt());
    }

    @Override
    public ASTNode visitCompound_stmt_while(pythonParser.Compound_stmt_whileContext ctx) {
        return (ASTNode) visit(ctx.while_stmt());
    }

    @Override
    public ASTNode visitCompound_stmt_decorator(pythonParser.Compound_stmt_decoratorContext ctx) {
        return (ASTNode) visit(ctx.decorator());
    }

    private IdentifierNode buildIdentifierNode(int line, List<String> parts) {
        String root = parts.get(0);
        IdentifierNode idNode = new IdentifierNode(line, root);
        for (int j = 1; j < parts.size(); j++) {
            idNode.addParts(new FieldAccess(line, parts.get(j)));
        }
        return idNode;
    }

    @Override
    public ASTNode visitImport_stmt(pythonParser.Import_stmtContext ctx) {
        if (ctx.import_stm1() != null) {
            return visitImport_stm1_label((pythonParser.Import_stm1_labelContext) ctx.import_stm1());
        } else if (ctx.import_stm2() != null) {
            return visitImport_stm2_label((pythonParser.Import_stm2_labelContext) ctx.import_stm2());
        }
        return visitImport_stm3_label((pythonParser.Import_stm3_labelContext) ctx.import_stm3());
    }

    @Override
    public ASTNode visitImport_stm1_label(pythonParser.Import_stm1_labelContext ctx) {
        List<IdentifierNode> modules = new ArrayList<>();
        IdentifierNode alias = null;
        int line = ctx.getStart().getLine();
        List<String> currentParts = new ArrayList<>();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            String text = ctx.getChild(i).getText();
            if (text.equals("import") || text.equals(".")) {
                continue;
            }
            if (text.equals(",")) {
                if (!currentParts.isEmpty()) {
                    modules.add(buildIdentifierNode(line, currentParts));
                    currentParts.clear();
                }
                continue;
            }
            if (text.equals("as")) {
                alias = buildIdentifierNode(line, List.of(ctx.getChild(i + 1).getText()));
                break;
            }
            currentParts.add(text);
        }
        if (!currentParts.isEmpty()) {
            modules.add(buildIdentifierNode(line, currentParts));
        }
        return new ImportNode(modules, alias, line);
    }

    @Override
    public ASTNode visitImport_stm2_label(pythonParser.Import_stm2_labelContext ctx) {
        int line = ctx.getStart().getLine();
        List<String> fromParts = new ArrayList<>();
        int i = 1;
        while (i < ctx.getChildCount()) {
            String text = ctx.getChild(i).getText();
            if (text.equals("import")) break;
            if (!text.equals(".")) {
                fromParts.add(text);
            }
            i++;
        }
        IdentifierNode fromModule = buildIdentifierNode(line, fromParts);
        List<IdentifierNode> modules = new ArrayList<>();
        IdentifierNode alias = null;
        List<String> currentParts = new ArrayList<>();
        i++;
        for (; i < ctx.getChildCount(); i++) {
            String text = ctx.getChild(i).getText();

            if (text.equals(".")) continue;

            if (text.equals(",")) {
                if (!currentParts.isEmpty()) {
                    modules.add(buildIdentifierNode(line, currentParts));
                    currentParts.clear();
                }
                continue;
            }
            if (text.equals("as")) {
                alias = buildIdentifierNode(line, List.of(ctx.getChild(i + 1).getText()));
                break;
            }
            currentParts.add(text);
        }

        if (!currentParts.isEmpty()) {
            modules.add(buildIdentifierNode(line, currentParts));
        }
        return new ImportNode(fromModule, modules, alias, line);
    }

    @Override
    public ASTNode visitImport_stm3_label(pythonParser.Import_stm3_labelContext ctx) {
        int line = ctx.getStart().getLine();
        List<String> fromParts = new ArrayList<>();
        int i = 1;
        while (!ctx.getChild(i).getText().equals("import")) {
            if (!ctx.getChild(i).getText().equals(".")) {
                fromParts.add(ctx.getChild(i).getText());
            }
            i++;
        }
        IdentifierNode fromModule = buildIdentifierNode(line, fromParts);
        List<Pair<IdentifierNode, Object>> namesWithAliases = new ArrayList<>();
        List<String> currentParts = new ArrayList<>();
        IdentifierNode alias = null;
        i += 2;
        while (!ctx.getChild(i).getText().equals(")")) {
            String text = ctx.getChild(i).getText();
            if (text.equals(".")) {
                i++;
                continue;
            }
            if (text.equals(",")) {
                if (!currentParts.isEmpty()) {
                    namesWithAliases.add(new Pair<>(buildIdentifierNode(line, currentParts), alias));
                    currentParts.clear();
                    alias = null;
                }
                i++;
                continue;
            }
            if (text.equals("as")) {
                alias = buildIdentifierNode(line, List.of(ctx.getChild(i + 1).getText()));
                i += 2;
                continue;
            }
            currentParts.add(text);
            i++;
        }
        if (!currentParts.isEmpty()) {
            namesWithAliases.add(new Pair<>(buildIdentifierNode(line, currentParts), alias));
        }
        return new ImportNode(fromModule, namesWithAliases, line);
    }

    @Override
    public ASTNode visitFun_def(pythonParser.Fun_defContext ctx) {
        int line = ctx.getStart().getLine();
        String funcName = ctx.IDENTIFIER().getText();
        symbolTable.insert(funcName, "Function", line);
        IdentifierNode name = new IdentifierNode(line, funcName);
        ArrayList<Pair<Expr, Expr>> arg = null;
        if (ctx.arguments() != null)
            arg = (ArrayList<Pair<Expr, Expr>>) visit(ctx.arguments());

        ArrayList<Statement> body = (ArrayList<Statement>) visit(ctx.suite());

        return new FunDefNode(line, name, arg, body);
    }

    @Override
    public ArrayList<Pair<Expr, Expr>> visitArguments(pythonParser.ArgumentsContext ctx) {
        ArrayList<Pair<Expr, Expr>> arguments = new ArrayList<>();
        for (pythonParser.ArgumentContext arg : ctx.argument()) {
            arguments.add((Pair<Expr, Expr>) visit(arg));
        }
        return arguments;
    }

    @Override
    public Pair<Expr, Expr> visitArgument_identifier(pythonParser.Argument_identifierContext ctx) {
        IdentifierNode node = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER(0).getText());
        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            node.addParts(new FieldAccess(ctx.getStart().getLine(), ctx.IDENTIFIER(1).getText()));
        }
        Expr value = null;
        if (ctx.ASSIGN() != null) {
            value = (Expr) visit(ctx.value_fun());
        }
        return new Pair<>(node, value);
    }

    @Override
    public Pair<Expr, Expr> visitArgument_atom(pythonParser.Argument_atomContext ctx) {
        return new Pair<>((Expr) visit(ctx.atom()), null);
    }

    @Override
    public Pair<Expr, Expr> visitArgument_concat(pythonParser.Argument_concatContext ctx) {
        return new Pair<>((Expr) visit(ctx.concat_str()), null);
    }

    @Override
    public Pair<Expr, Expr> visitArgument_call(pythonParser.Argument_callContext ctx) {
        return new Pair<>((Expr) visit(ctx.call_stmt()), null);
    }

    @Override
    public Pair<Expr, Expr> visitArgument_expr(pythonParser.Argument_exprContext ctx) {
        return new Pair<>((Expr) visit(ctx.expr_math()), null);
    }

    @Override
    public Pair<Expr, Expr> visitArgument_dict(pythonParser.Argument_dictContext ctx) {
        return new Pair<>((Expr) visit(ctx.dictionary()), null);
    }

    @Override
    public Pair<Expr, Expr> visitArgument_array(pythonParser.Argument_arrayContext ctx) {
        return new Pair<>((Expr) visit(ctx.array()), null);
    }

    @Override
    public ASTNode visitValue_fun_identifier(pythonParser.Value_fun_identifierContext ctx) {
        IdentifierNode node = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER(0).getText());
        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            node.addParts(new FieldAccess(ctx.getStart().getLine(), ctx.IDENTIFIER(i).getText()));
        }
        return node;
    }

    @Override
    public ASTNode visitValue_fun_atom(pythonParser.Value_fun_atomContext ctx) {
        return (ASTNode) visit(ctx.atom());
    }

    @Override
    public ASTNode visitValue_fun_concat(pythonParser.Value_fun_concatContext ctx) {
        return (ASTNode) visit(ctx.concat_str());
    }

    @Override
    public ASTNode visitValue_fun_call(pythonParser.Value_fun_callContext ctx) {
        return (ASTNode) visit(ctx.call_stmt());
    }

    @Override
    public ASTNode visitValue_fun_expr(pythonParser.Value_fun_exprContext ctx) {
        return (ASTNode) visit(ctx.expr_math());
    }

    @Override
    public ASTNode visitValue_fun_dict(pythonParser.Value_fun_dictContext ctx) {
        return (ASTNode) visit(ctx.dictionary());
    }

    @Override
    public ASTNode visitValue_fun_array(pythonParser.Value_fun_arrayContext ctx) {
        return (ASTNode) visit(ctx.array());
    }

    @Override
    public ArrayList<Statement> visitSuite(pythonParser.SuiteContext ctx) {
        ArrayList<Statement> staments = new ArrayList<>();
        for (int i = 0; i < ctx.stmt().size(); i++) {
            staments.add((Statement) visit(ctx.stmt(i)));
        }
        return staments;
    }

    @Override
    public ASTNode visitIf_stmt(pythonParser.If_stmtContext ctx) {
        ExprLogic ifCondition = (ExprLogic) visit(ctx.expr_logic(0));
        ArrayList<Statement> ifBody = (ArrayList<Statement>) visit(ctx.suite(0));
        IfStmtNode ifNode = new IfStmtNode(ctx.start.getLine(), ifCondition, ifBody);
        for (int i = 0; i < ctx.ELIF().size(); i++) {
            ExprLogic elifCond = (ExprLogic) visit(ctx.expr_logic(i + 1));
            ArrayList<Statement> elifBody = (ArrayList<Statement>) visit(ctx.suite(i + 1));
            ElseIfNode elifNode = new ElseIfNode(ctx.ELIF(i).getSymbol().getLine(), elifCond, elifBody);
            ifNode.addElseIf(elifNode);
        }
        if (ctx.ELSE() != null) {
            int elseIndex = ctx.suite().size() - 1;
            ArrayList<Statement> elseBody = (ArrayList<Statement>) visit(ctx.suite(elseIndex));
            ElseNode elseNode = new ElseNode(ctx.ELSE().getSymbol().getLine(), elseBody);
            ifNode.addElse(elseNode);
        }
        return ifNode;
    }

    @Override
    public ASTNode visitFor_stmt(pythonParser.For_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        String loopVarName = ctx.IDENTIFIER(0).getText();
        symbolTable.insert(loopVarName, "Loop Variable", line);
        IdentifierNode var = new IdentifierNode(line, loopVarName);
        int idx = 1;
        while (idx < ctx.IDENTIFIER().size() && ctx.getChild(idx * 2).getText().equals(".")) {
            var.addParts(new FieldAccess(line, ctx.IDENTIFIER(idx).getText()));
            idx++;
        }

        Expr inExpr;
        if (ctx.STRING() != null) {
            inExpr = new Atom(ctx.STRING().getSymbol().getLine(), "string", ctx.STRING().getText());
        } else if (ctx.call_stmt() != null) {
            inExpr = (Expr) visit(ctx.call_stmt());
        } else {
            int baseIndex = idx;
            IdentifierNode inIdentifier = new IdentifierNode(line, ctx.IDENTIFIER(baseIndex).getText());
            for (int i = baseIndex + 1; i < ctx.IDENTIFIER().size(); i++) {
                inIdentifier.addParts(new FieldAccess(line, ctx.IDENTIFIER(i).getText()));
            }
            inExpr = inIdentifier;
        }

        ArrayList<Statement> body = (ArrayList<Statement>) visit(ctx.suite());

        return new ForStmtNode(line, var, inExpr, body);
    }

    @Override
    public ASTNode visitWhile_stmt(pythonParser.While_stmtContext ctx) {
        Expr condition = (Expr) visit(ctx.expr_logic());
        ArrayList<Statement> body = (ArrayList<Statement>) visit(ctx.suite());
        return new WhileStmtNode(ctx.getStart().getLine(), (ExprLogic) condition, body);
    }

    @Override
    public ASTNode visitExpr_logic(pythonParser.Expr_logicContext ctx) {
        return (ASTNode) visit(ctx.expr_or());
    }

    @Override
    public ASTNode visitExpr_or_orAnd(pythonParser.Expr_or_orAndContext ctx) {
        Expr left = (Expr) visit(ctx.expr_or());
        Expr right = (Expr) visit(ctx.expr_and());
        return new ExprLogic(ctx.getStart().getLine(), left, ExprLogic.Operator.OR, right);
    }

    @Override
    public ASTNode visitExpr_or_and(pythonParser.Expr_or_andContext ctx) {
        return (ASTNode) visit(ctx.expr_and());
    }

    @Override
    public ASTNode visitExpr_and_not(pythonParser.Expr_and_notContext ctx) {
        return (ASTNode) visit(ctx.expr_not());
    }

    @Override
    public ASTNode visitExpr_and_andNot(pythonParser.Expr_and_andNotContext ctx) {
        Expr left = (Expr) visit(ctx.expr_and());
        Expr right = (Expr) visit(ctx.expr_not());
        return new ExprLogic(ctx.getStart().getLine(), left, ExprLogic.Operator.AND, right);
    }

    @Override
    public ASTNode visitExpr_not_not(pythonParser.Expr_not_notContext ctx) {
        Expr expr = (Expr) visit(ctx.expr_not());
        return new ExprLogic(ctx.getStart().getLine(), ExprLogic.Operator.NOT, expr);
    }

    @Override
    public ASTNode visitExpr_not_compare(pythonParser.Expr_not_compareContext ctx) {
        return (ASTNode) visit(ctx.expr_compare());
    }

    @Override
    public ASTNode visitExprCom_comOp(pythonParser.ExprCom_comOpContext ctx) {
        Expr left = (Expr) visit(ctx.expr_operand(0));
        Expr right = (Expr) visit(ctx.expr_operand(1));
        ExprLogic.Operator op;
        if (ctx.compare_op().LESS_THAN() != null) op = ExprLogic.Operator.LT;
        else if (ctx.compare_op().GREATER_THAN() != null) op = ExprLogic.Operator.GT;
        else if (ctx.compare_op().EQUALS() != null) op = ExprLogic.Operator.EQ;
        else if (ctx.compare_op().GT_EQ() != null) op = ExprLogic.Operator.GTE;
        else if (ctx.compare_op().LT_EQ() != null) op = ExprLogic.Operator.LTE;
        else if (ctx.compare_op().NOT_EQ_1() != null) op = ExprLogic.Operator.NEQ1;
        else op = ExprLogic.Operator.NEQ2;
        return new ExprLogic(ctx.getStart().getLine(), left, op, right);
    }

    @Override
    public ASTNode visitExprCom_operand(pythonParser.ExprCom_operandContext ctx) {
        return (ASTNode) visit(ctx.expr_operand());
    }

    @Override
    public Object visitCompare_op(pythonParser.Compare_opContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitExprOp_paren(pythonParser.ExprOp_parenContext ctx) {
        return (ASTNode) visit(ctx.expr_logic());
    }

    @Override
    public ASTNode visitExprOp_ide(pythonParser.ExprOp_ideContext ctx) {
        IdentifierNode id = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER(0).getText());
        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            id.addParts(new FieldAccess(ctx.getStart().getLine(), ctx.IDENTIFIER(i).getText()));
        }
        for (pythonParser.Value_indexContext idx : ctx.value_index()) {
            Object index = visit(idx);
            id.addParts((AccessPart) index);
        }
        return new ExprLogic(ctx.getStart().getLine(), id);
    }

    @Override
    public ASTNode visitExprOp_atom(pythonParser.ExprOp_atomContext ctx) {
        return new ExprLogic(ctx.getStart().getLine(), (Expr) visit(ctx.atom()));
    }

    @Override
    public ASTNode visitExprOp_call(pythonParser.ExprOp_callContext ctx) {
        return new ExprLogic(ctx.getStart().getLine(), (Expr) visit(ctx.call_stmt()));
    }

    @Override
    public ASTNode visitExprOp_math(pythonParser.ExprOp_mathContext ctx) {
        return new ExprLogic(ctx.getStart().getLine(), (Expr) visit(ctx.expr_math()));
    }

    @Override
    public ASTNode visitArray(pythonParser.ArrayContext ctx) {
        ArrayList<Expr> elements = new ArrayList<>();
        for (pythonParser.Content_valContext c : ctx.content_val()) {
            elements.add((Expr) visit(c));
        }
        return new Array(ctx.getStart().getLine(), elements);
    }

    @Override
    public ASTNode visitContent_val_identifier(pythonParser.Content_val_identifierContext ctx) {
        return new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER().getText());
    }

    @Override
    public ASTNode visitContent_val_atom(pythonParser.Content_val_atomContext ctx) {
        return (ASTNode) visit(ctx.atom());
    }

    @Override
    public ASTNode visitContent_val_concat(pythonParser.Content_val_concatContext ctx) {
        return (ASTNode) visit(ctx.concat_str());
    }

    @Override
    public ASTNode visitContent_val_dict(pythonParser.Content_val_dictContext ctx) {
        return (ASTNode) visit(ctx.dictionary());
    }

    @Override
    public ASTNode visitContent_val_array(pythonParser.Content_val_arrayContext ctx) {
        return (ASTNode) visit(ctx.array());
    }

    @Override
    public ASTNode visitDecorator(pythonParser.DecoratorContext ctx) {
        IdentifierNode name = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER(0).getText());
        name.addParts(new FieldAccess(ctx.getStart().getLine(), ctx.IDENTIFIER(1).getText()));
        ArrayList<Pair<Expr, Expr>> arg = null;
        if (ctx.arguments() != null)
            arg = (ArrayList<Pair<Expr, Expr>>) visit(ctx.arguments());
        FunDefNode fun = (FunDefNode) visit(ctx.fun_def());
        return new DecoratorNode(ctx.getStart().getLine(), name, arg, fun);
    }


    @Override
    public ASTNode visitKey_value(pythonParser.Key_valueContext ctx) {
        String key = ctx.STRING().getText();
        Expr value = (Expr) visit(ctx.content_val());
        return new KeyValue(ctx.getStart().getLine(), key, value);
    }

    @Override
    public ASTNode visitObject(pythonParser.ObjectContext ctx) {
        ArrayList<KeyValue> keyValues = new ArrayList<>();
        if (ctx.key_value() != null) {
            for (pythonParser.Key_valueContext k : ctx.key_value()) {
                keyValues.add((KeyValue) visit(k));
            }
        }
        return new Dictionary(ctx.getStart().getLine(), keyValues);
    }

    @Override
    public ASTNode visitDictionary(pythonParser.DictionaryContext ctx) {
        return (ASTNode) visit(ctx.object());
    }


    @Override
    public ASTNode visitValue_index(pythonParser.Value_indexContext ctx) {
        Object index = null;
        if (ctx.NUMBER() != null) {
            index = Integer.parseInt(ctx.NUMBER().getText());
        }
        if (ctx.FLOAT_NUMBER() != null) {
            index = Double.parseDouble(ctx.FLOAT_NUMBER().getText());
        }
        if (ctx.STRING() != null) {
            index = ctx.STRING().getText();
        }
        if (ctx.IDENTIFIER() != null && !ctx.IDENTIFIER().isEmpty()) {
            IdentifierNode id = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER(0).getText());
            for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
                id.addParts(new python.ast.Access.FieldAccess(ctx.getStart().getLine(), ctx.IDENTIFIER(i).getText()));
            }
            index = id;
        }
        IndexAccess node = new IndexAccess(ctx.getStart().getLine(), index);
        return node;
    }

    @Override
    public ASTNode visitCall_stmt(pythonParser.Call_stmtContext ctx) {
        IdentifierNode name = new IdentifierNode(ctx.getStart().getLine(), ctx.IDENTIFIER().getText());
        CallStmt node = new CallStmt(ctx.getStart().getLine(), name);
        if (ctx.arguments() != null)
            node.setArguments((ArrayList<Pair<Expr, Expr>>) visit(ctx.arguments()));
        return node;
    }


    @Override
    public ASTNode visitConcat_str(pythonParser.Concat_strContext ctx) {
        ArrayList<Expr> texts = new ArrayList<>();
        int line = ctx.getStart().getLine();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child.getText().equals("+"))
                continue;
            Expr node;
            if (child instanceof TerminalNode && ((TerminalNode) child).getSymbol().getType() == pythonParser.STRING) {
                node = new Atom(line, child.getClass().getSimpleName(), child.toString());
                texts.add(node);
                continue;
            }
            IdentifierNode id = null;
            while (i < ctx.getChildCount()) {
                ParseTree current = ctx.getChild(i);
                if (current.getText().equals("+"))
                    break;
                if (current instanceof TerminalNode &&
                        ((TerminalNode) current).getSymbol().getType() == pythonParser.IDENTIFIER) {
                    if (id == null) {
                        id = new IdentifierNode(line, current.getText());
                    } else {
                        id.addParts(new FieldAccess(line, current.getText()) {
                        });
                    }
                }
                i++;
            }
            texts.add(id);
            i--;
        }
        return new ConcatStr(line, texts);
    }

    @Override
    public ASTNode visitAtom_number(pythonParser.Atom_numberContext ctx) {
        return new Atom(ctx.getStart().getLine(), "number", Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public ASTNode visitAtom_float(pythonParser.Atom_floatContext ctx) {
        return new Atom(ctx.getStart().getLine(), "float", Double.parseDouble(ctx.FLOAT_NUMBER().getText()));
    }

    @Override
    public ASTNode visitAtom_string(pythonParser.Atom_stringContext ctx) {
        return new Atom(ctx.getStart().getLine(), "string", ctx.STRING().getText());
    }

    @Override
    public ASTNode visitAtom_bool(pythonParser.Atom_boolContext ctx) {
        boolean value = ctx.TRUE() != null;
        return new Atom(ctx.getStart().getLine(), "bool", value);
    }

    @Override
    public ASTNode visitAtom_none(pythonParser.Atom_noneContext ctx) {
        return new Atom(ctx.getStart().getLine(), "none", null);
    }
}