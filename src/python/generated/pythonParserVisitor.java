// Generated from C:/Compiler_Project/src/python/pythonParser.g4 by ANTLR 4.13.2
package python.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pythonParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(pythonParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_label}
	 * labeled alternative in {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_label(pythonParser.Simple_stmt_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound_stmt_label}
	 * labeled alternative in {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt_label(pythonParser.Compound_stmt_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_assignment}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_assignment(pythonParser.Simple_stmt_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_call}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_call(pythonParser.Simple_stmt_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_import}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_import(pythonParser.Simple_stmt_importContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_return}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_return(pythonParser.Simple_stmt_returnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_del}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_del(pythonParser.Simple_stmt_delContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_global}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_global(pythonParser.Simple_stmt_globalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_break}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_break(pythonParser.Simple_stmt_breakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_continue}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_continue(pythonParser.Simple_stmt_continueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_stmt_pass}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_pass(pythonParser.Simple_stmt_passContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(pythonParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_multiple}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_multiple(pythonParser.Assignment_multipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_add}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_add(pythonParser.Assignment_addContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_sub}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_sub(pythonParser.Assignment_subContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_mult}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_mult(pythonParser.Assignment_multContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_div}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_div(pythonParser.Assignment_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_mod}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_mod(pythonParser.Assignment_modContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_and}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_and(pythonParser.Assignment_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_or}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_or(pythonParser.Assignment_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_xor}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_xor(pythonParser.Assignment_xorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_lshift}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_lshift(pythonParser.Assignment_lshiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_rshift}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_rshift(pythonParser.Assignment_rshiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_power}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_power(pythonParser.Assignment_powerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(pythonParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffix(pythonParser.SuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_stmt_identifier}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_stmt_identifier(pythonParser.Value_stmt_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_stmt_atom}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_stmt_atom(pythonParser.Value_stmt_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_stmt_call}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_stmt_call(pythonParser.Value_stmt_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_stmt_array}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_stmt_array(pythonParser.Value_stmt_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_stmt_expr}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_stmt_expr(pythonParser.Value_stmt_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_stmt_dict}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_stmt_dict(pythonParser.Value_stmt_dictContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(pythonParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(pythonParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#expr_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_math(pythonParser.Expr_mathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathAdd_sub}
	 * labeled alternative in {@link pythonParser#math_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAdd_sub(pythonParser.MathAdd_subContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathAdd_mul}
	 * labeled alternative in {@link pythonParser#math_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAdd_mul(pythonParser.MathAdd_mulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathAdd_add}
	 * labeled alternative in {@link pythonParser#math_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAdd_add(pythonParser.MathAdd_addContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathMul_mul}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathMul_mul(pythonParser.MathMul_mulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathMul_power}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathMul_power(pythonParser.MathMul_powerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathMul_mod}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathMul_mod(pythonParser.MathMul_modContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathMul_div}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathMul_div(pythonParser.MathMul_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathPow_atom}
	 * labeled alternative in {@link pythonParser#math_power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathPow_atom(pythonParser.MathPow_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathPow_power}
	 * labeled alternative in {@link pythonParser#math_power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathPow_power(pythonParser.MathPow_powerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathAtom_paren}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAtom_paren(pythonParser.MathAtom_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathAtom_id}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAtom_id(pythonParser.MathAtom_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathAtom_num}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAtom_num(pythonParser.MathAtom_numContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathAtom_float}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAtom_float(pythonParser.MathAtom_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathAtom_call}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAtom_call(pythonParser.MathAtom_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound_stmt_fun}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt_fun(pythonParser.Compound_stmt_funContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound_stmt_if}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt_if(pythonParser.Compound_stmt_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound_stmt_for}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt_for(pythonParser.Compound_stmt_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound_stmt_while}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt_while(pythonParser.Compound_stmt_whileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound_stmt_decorator}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt_decorator(pythonParser.Compound_stmt_decoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code import_stm1_label}
	 * labeled alternative in {@link pythonParser#import_stm1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stm1_label(pythonParser.Import_stm1_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code import_stm2_label}
	 * labeled alternative in {@link pythonParser#import_stm2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stm2_label(pythonParser.Import_stm2_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code import_stm3_label}
	 * labeled alternative in {@link pythonParser#import_stm3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stm3_label(pythonParser.Import_stm3_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#fun_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_def(pythonParser.Fun_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(pythonParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argument_identifier}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_identifier(pythonParser.Argument_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argument_atom}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_atom(pythonParser.Argument_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argument_concat}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_concat(pythonParser.Argument_concatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argument_call}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_call(pythonParser.Argument_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argument_expr}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expr(pythonParser.Argument_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argument_dict}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_dict(pythonParser.Argument_dictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argument_array}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_array(pythonParser.Argument_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_fun_identifier}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_fun_identifier(pythonParser.Value_fun_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_fun_atom}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_fun_atom(pythonParser.Value_fun_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_fun_concat}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_fun_concat(pythonParser.Value_fun_concatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_fun_call}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_fun_call(pythonParser.Value_fun_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_fun_expr}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_fun_expr(pythonParser.Value_fun_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_fun_dict}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_fun_dict(pythonParser.Value_fun_dictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value_fun_array}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_fun_array(pythonParser.Value_fun_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#expr_logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_logic(pythonParser.Expr_logicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_or_orAnd}
	 * labeled alternative in {@link pythonParser#expr_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or_orAnd(pythonParser.Expr_or_orAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_or_and}
	 * labeled alternative in {@link pythonParser#expr_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or_and(pythonParser.Expr_or_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_and_not}
	 * labeled alternative in {@link pythonParser#expr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_and_not(pythonParser.Expr_and_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_and_andNot}
	 * labeled alternative in {@link pythonParser#expr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_and_andNot(pythonParser.Expr_and_andNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_not_not}
	 * labeled alternative in {@link pythonParser#expr_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_not_not(pythonParser.Expr_not_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_not_compare}
	 * labeled alternative in {@link pythonParser#expr_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_not_compare(pythonParser.Expr_not_compareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCom_comOp}
	 * labeled alternative in {@link pythonParser#expr_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCom_comOp(pythonParser.ExprCom_comOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCom_operand}
	 * labeled alternative in {@link pythonParser#expr_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCom_operand(pythonParser.ExprCom_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_op(pythonParser.Compare_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOp_paren}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp_paren(pythonParser.ExprOp_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOp_ide}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp_ide(pythonParser.ExprOp_ideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOp_atom}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp_atom(pythonParser.ExprOp_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOp_call}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp_call(pythonParser.ExprOp_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOp_math}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp_math(pythonParser.ExprOp_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(pythonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code content_val_identifier}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_val_identifier(pythonParser.Content_val_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code content_val_atom}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_val_atom(pythonParser.Content_val_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code content_val_concat}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_val_concat(pythonParser.Content_val_concatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code content_val_dict}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_val_dict(pythonParser.Content_val_dictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code content_val_array}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_val_array(pythonParser.Content_val_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(pythonParser.DictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(pythonParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_value(pythonParser.Key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#value_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_index(pythonParser.Value_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(pythonParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#concat_str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat_str(pythonParser.Concat_strContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_number}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_number(pythonParser.Atom_numberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_float}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_float(pythonParser.Atom_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_string}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_string(pythonParser.Atom_stringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_bool}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_bool(pythonParser.Atom_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_none}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_none(pythonParser.Atom_noneContext ctx);
}