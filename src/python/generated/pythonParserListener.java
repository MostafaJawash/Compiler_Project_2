// Generated from C:/Users/Lenovo/Compiler_Project/src/python/pythonParser.g4 by ANTLR 4.13.2

package python.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(pythonParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(pythonParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_label}
	 * labeled alternative in {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_label(pythonParser.Simple_stmt_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_label}
	 * labeled alternative in {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_label(pythonParser.Simple_stmt_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound_stmt_label}
	 * labeled alternative in {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt_label(pythonParser.Compound_stmt_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound_stmt_label}
	 * labeled alternative in {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt_label(pythonParser.Compound_stmt_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_assignment}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_assignment(pythonParser.Simple_stmt_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_assignment}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_assignment(pythonParser.Simple_stmt_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_call}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_call(pythonParser.Simple_stmt_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_call}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_call(pythonParser.Simple_stmt_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_import}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_import(pythonParser.Simple_stmt_importContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_import}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_import(pythonParser.Simple_stmt_importContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_return}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_return(pythonParser.Simple_stmt_returnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_return}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_return(pythonParser.Simple_stmt_returnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_del}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_del(pythonParser.Simple_stmt_delContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_del}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_del(pythonParser.Simple_stmt_delContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_global}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_global(pythonParser.Simple_stmt_globalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_global}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_global(pythonParser.Simple_stmt_globalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_break}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_break(pythonParser.Simple_stmt_breakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_break}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_break(pythonParser.Simple_stmt_breakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_continue}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_continue(pythonParser.Simple_stmt_continueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_continue}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_continue(pythonParser.Simple_stmt_continueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_stmt_pass}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt_pass(pythonParser.Simple_stmt_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_stmt_pass}
	 * labeled alternative in {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt_pass(pythonParser.Simple_stmt_passContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(pythonParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(pythonParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_multiple}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_multiple(pythonParser.Assignment_multipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_multiple}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_multiple(pythonParser.Assignment_multipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_add}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_add(pythonParser.Assignment_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_add}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_add(pythonParser.Assignment_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_sub}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_sub(pythonParser.Assignment_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_sub}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_sub(pythonParser.Assignment_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_mult}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_mult(pythonParser.Assignment_multContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_mult}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_mult(pythonParser.Assignment_multContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_div}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_div(pythonParser.Assignment_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_div}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_div(pythonParser.Assignment_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_mod}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_mod(pythonParser.Assignment_modContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_mod}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_mod(pythonParser.Assignment_modContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_and}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_and(pythonParser.Assignment_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_and}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_and(pythonParser.Assignment_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_or}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_or(pythonParser.Assignment_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_or}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_or(pythonParser.Assignment_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_xor}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_xor(pythonParser.Assignment_xorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_xor}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_xor(pythonParser.Assignment_xorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_lshift}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_lshift(pythonParser.Assignment_lshiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_lshift}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_lshift(pythonParser.Assignment_lshiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_rshift}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_rshift(pythonParser.Assignment_rshiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_rshift}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_rshift(pythonParser.Assignment_rshiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment_power}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_power(pythonParser.Assignment_powerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment_power}
	 * labeled alternative in {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_power(pythonParser.Assignment_powerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(pythonParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(pythonParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffix(pythonParser.SuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffix(pythonParser.SuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_stmt_identifier}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValue_stmt_identifier(pythonParser.Value_stmt_identifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_stmt_identifier}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValue_stmt_identifier(pythonParser.Value_stmt_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_stmt_atom}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValue_stmt_atom(pythonParser.Value_stmt_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_stmt_atom}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValue_stmt_atom(pythonParser.Value_stmt_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_stmt_call}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValue_stmt_call(pythonParser.Value_stmt_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_stmt_call}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValue_stmt_call(pythonParser.Value_stmt_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_stmt_array}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValue_stmt_array(pythonParser.Value_stmt_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_stmt_array}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValue_stmt_array(pythonParser.Value_stmt_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_stmt_expr}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValue_stmt_expr(pythonParser.Value_stmt_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_stmt_expr}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValue_stmt_expr(pythonParser.Value_stmt_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_stmt_dict}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValue_stmt_dict(pythonParser.Value_stmt_dictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_stmt_dict}
	 * labeled alternative in {@link pythonParser#value_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValue_stmt_dict(pythonParser.Value_stmt_dictContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(pythonParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(pythonParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(pythonParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(pythonParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expr_math}.
	 * @param ctx the parse tree
	 */
	void enterExpr_math(pythonParser.Expr_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expr_math}.
	 * @param ctx the parse tree
	 */
	void exitExpr_math(pythonParser.Expr_mathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathAdd_sub}
	 * labeled alternative in {@link pythonParser#math_add}.
	 * @param ctx the parse tree
	 */
	void enterMathAdd_sub(pythonParser.MathAdd_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathAdd_sub}
	 * labeled alternative in {@link pythonParser#math_add}.
	 * @param ctx the parse tree
	 */
	void exitMathAdd_sub(pythonParser.MathAdd_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathAdd_mul}
	 * labeled alternative in {@link pythonParser#math_add}.
	 * @param ctx the parse tree
	 */
	void enterMathAdd_mul(pythonParser.MathAdd_mulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathAdd_mul}
	 * labeled alternative in {@link pythonParser#math_add}.
	 * @param ctx the parse tree
	 */
	void exitMathAdd_mul(pythonParser.MathAdd_mulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathAdd_add}
	 * labeled alternative in {@link pythonParser#math_add}.
	 * @param ctx the parse tree
	 */
	void enterMathAdd_add(pythonParser.MathAdd_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathAdd_add}
	 * labeled alternative in {@link pythonParser#math_add}.
	 * @param ctx the parse tree
	 */
	void exitMathAdd_add(pythonParser.MathAdd_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathMul_mul}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 */
	void enterMathMul_mul(pythonParser.MathMul_mulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathMul_mul}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 */
	void exitMathMul_mul(pythonParser.MathMul_mulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathMul_power}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 */
	void enterMathMul_power(pythonParser.MathMul_powerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathMul_power}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 */
	void exitMathMul_power(pythonParser.MathMul_powerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathMul_mod}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 */
	void enterMathMul_mod(pythonParser.MathMul_modContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathMul_mod}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 */
	void exitMathMul_mod(pythonParser.MathMul_modContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathMul_div}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 */
	void enterMathMul_div(pythonParser.MathMul_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathMul_div}
	 * labeled alternative in {@link pythonParser#math_mul}.
	 * @param ctx the parse tree
	 */
	void exitMathMul_div(pythonParser.MathMul_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathPow_atom}
	 * labeled alternative in {@link pythonParser#math_power}.
	 * @param ctx the parse tree
	 */
	void enterMathPow_atom(pythonParser.MathPow_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathPow_atom}
	 * labeled alternative in {@link pythonParser#math_power}.
	 * @param ctx the parse tree
	 */
	void exitMathPow_atom(pythonParser.MathPow_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathPow_power}
	 * labeled alternative in {@link pythonParser#math_power}.
	 * @param ctx the parse tree
	 */
	void enterMathPow_power(pythonParser.MathPow_powerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathPow_power}
	 * labeled alternative in {@link pythonParser#math_power}.
	 * @param ctx the parse tree
	 */
	void exitMathPow_power(pythonParser.MathPow_powerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathAtom_paren}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void enterMathAtom_paren(pythonParser.MathAtom_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathAtom_paren}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void exitMathAtom_paren(pythonParser.MathAtom_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathAtom_id}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void enterMathAtom_id(pythonParser.MathAtom_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathAtom_id}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void exitMathAtom_id(pythonParser.MathAtom_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathAtom_num}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void enterMathAtom_num(pythonParser.MathAtom_numContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathAtom_num}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void exitMathAtom_num(pythonParser.MathAtom_numContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathAtom_float}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void enterMathAtom_float(pythonParser.MathAtom_floatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathAtom_float}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void exitMathAtom_float(pythonParser.MathAtom_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathAtom_call}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void enterMathAtom_call(pythonParser.MathAtom_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathAtom_call}
	 * labeled alternative in {@link pythonParser#math_atom}.
	 * @param ctx the parse tree
	 */
	void exitMathAtom_call(pythonParser.MathAtom_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound_stmt_fun}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt_fun(pythonParser.Compound_stmt_funContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound_stmt_fun}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt_fun(pythonParser.Compound_stmt_funContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound_stmt_if}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt_if(pythonParser.Compound_stmt_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound_stmt_if}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt_if(pythonParser.Compound_stmt_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound_stmt_for}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt_for(pythonParser.Compound_stmt_forContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound_stmt_for}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt_for(pythonParser.Compound_stmt_forContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound_stmt_while}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt_while(pythonParser.Compound_stmt_whileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound_stmt_while}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt_while(pythonParser.Compound_stmt_whileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound_stmt_decorator}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt_decorator(pythonParser.Compound_stmt_decoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound_stmt_decorator}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt_decorator(pythonParser.Compound_stmt_decoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code import_stm1_label}
	 * labeled alternative in {@link pythonParser#import_stm1}.
	 * @param ctx the parse tree
	 */
	void enterImport_stm1_label(pythonParser.Import_stm1_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code import_stm1_label}
	 * labeled alternative in {@link pythonParser#import_stm1}.
	 * @param ctx the parse tree
	 */
	void exitImport_stm1_label(pythonParser.Import_stm1_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code import_stm2_label}
	 * labeled alternative in {@link pythonParser#import_stm2}.
	 * @param ctx the parse tree
	 */
	void enterImport_stm2_label(pythonParser.Import_stm2_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code import_stm2_label}
	 * labeled alternative in {@link pythonParser#import_stm2}.
	 * @param ctx the parse tree
	 */
	void exitImport_stm2_label(pythonParser.Import_stm2_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code import_stm3_label}
	 * labeled alternative in {@link pythonParser#import_stm3}.
	 * @param ctx the parse tree
	 */
	void enterImport_stm3_label(pythonParser.Import_stm3_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code import_stm3_label}
	 * labeled alternative in {@link pythonParser#import_stm3}.
	 * @param ctx the parse tree
	 */
	void exitImport_stm3_label(pythonParser.Import_stm3_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void enterFun_def(pythonParser.Fun_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void exitFun_def(pythonParser.Fun_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(pythonParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(pythonParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument_identifier}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument_identifier(pythonParser.Argument_identifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument_identifier}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument_identifier(pythonParser.Argument_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument_atom}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument_atom(pythonParser.Argument_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument_atom}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument_atom(pythonParser.Argument_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument_concat}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument_concat(pythonParser.Argument_concatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument_concat}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument_concat(pythonParser.Argument_concatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument_call}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument_call(pythonParser.Argument_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument_call}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument_call(pythonParser.Argument_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument_expr}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expr(pythonParser.Argument_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument_expr}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expr(pythonParser.Argument_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument_dict}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument_dict(pythonParser.Argument_dictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument_dict}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument_dict(pythonParser.Argument_dictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument_array}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument_array(pythonParser.Argument_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument_array}
	 * labeled alternative in {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument_array(pythonParser.Argument_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_fun_identifier}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void enterValue_fun_identifier(pythonParser.Value_fun_identifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_fun_identifier}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void exitValue_fun_identifier(pythonParser.Value_fun_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_fun_atom}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void enterValue_fun_atom(pythonParser.Value_fun_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_fun_atom}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void exitValue_fun_atom(pythonParser.Value_fun_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_fun_concat}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void enterValue_fun_concat(pythonParser.Value_fun_concatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_fun_concat}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void exitValue_fun_concat(pythonParser.Value_fun_concatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_fun_call}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void enterValue_fun_call(pythonParser.Value_fun_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_fun_call}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void exitValue_fun_call(pythonParser.Value_fun_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_fun_expr}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void enterValue_fun_expr(pythonParser.Value_fun_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_fun_expr}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void exitValue_fun_expr(pythonParser.Value_fun_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_fun_dict}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void enterValue_fun_dict(pythonParser.Value_fun_dictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_fun_dict}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void exitValue_fun_dict(pythonParser.Value_fun_dictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_fun_array}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void enterValue_fun_array(pythonParser.Value_fun_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_fun_array}
	 * labeled alternative in {@link pythonParser#value_fun}.
	 * @param ctx the parse tree
	 */
	void exitValue_fun_array(pythonParser.Value_fun_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(pythonParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void enterExpr_logic(pythonParser.Expr_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void exitExpr_logic(pythonParser.Expr_logicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_or_orAnd}
	 * labeled alternative in {@link pythonParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_orAnd(pythonParser.Expr_or_orAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_or_orAnd}
	 * labeled alternative in {@link pythonParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_orAnd(pythonParser.Expr_or_orAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_or_and}
	 * labeled alternative in {@link pythonParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_and(pythonParser.Expr_or_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_or_and}
	 * labeled alternative in {@link pythonParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_and(pythonParser.Expr_or_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_and_not}
	 * labeled alternative in {@link pythonParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_not(pythonParser.Expr_and_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_and_not}
	 * labeled alternative in {@link pythonParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_not(pythonParser.Expr_and_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_and_andNot}
	 * labeled alternative in {@link pythonParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_andNot(pythonParser.Expr_and_andNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_and_andNot}
	 * labeled alternative in {@link pythonParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_andNot(pythonParser.Expr_and_andNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_not_not}
	 * labeled alternative in {@link pythonParser#expr_not}.
	 * @param ctx the parse tree
	 */
	void enterExpr_not_not(pythonParser.Expr_not_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_not_not}
	 * labeled alternative in {@link pythonParser#expr_not}.
	 * @param ctx the parse tree
	 */
	void exitExpr_not_not(pythonParser.Expr_not_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_not_compare}
	 * labeled alternative in {@link pythonParser#expr_not}.
	 * @param ctx the parse tree
	 */
	void enterExpr_not_compare(pythonParser.Expr_not_compareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_not_compare}
	 * labeled alternative in {@link pythonParser#expr_not}.
	 * @param ctx the parse tree
	 */
	void exitExpr_not_compare(pythonParser.Expr_not_compareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCom_comOp}
	 * labeled alternative in {@link pythonParser#expr_compare}.
	 * @param ctx the parse tree
	 */
	void enterExprCom_comOp(pythonParser.ExprCom_comOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCom_comOp}
	 * labeled alternative in {@link pythonParser#expr_compare}.
	 * @param ctx the parse tree
	 */
	void exitExprCom_comOp(pythonParser.ExprCom_comOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCom_operand}
	 * labeled alternative in {@link pythonParser#expr_compare}.
	 * @param ctx the parse tree
	 */
	void enterExprCom_operand(pythonParser.ExprCom_operandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCom_operand}
	 * labeled alternative in {@link pythonParser#expr_compare}.
	 * @param ctx the parse tree
	 */
	void exitExprCom_operand(pythonParser.ExprCom_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(pythonParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(pythonParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOp_paren}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void enterExprOp_paren(pythonParser.ExprOp_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOp_paren}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void exitExprOp_paren(pythonParser.ExprOp_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOp_ide}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void enterExprOp_ide(pythonParser.ExprOp_ideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOp_ide}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void exitExprOp_ide(pythonParser.ExprOp_ideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOp_atom}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void enterExprOp_atom(pythonParser.ExprOp_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOp_atom}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void exitExprOp_atom(pythonParser.ExprOp_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOp_call}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void enterExprOp_call(pythonParser.ExprOp_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOp_call}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void exitExprOp_call(pythonParser.ExprOp_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOp_math}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void enterExprOp_math(pythonParser.ExprOp_mathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOp_math}
	 * labeled alternative in {@link pythonParser#expr_operand}.
	 * @param ctx the parse tree
	 */
	void exitExprOp_math(pythonParser.ExprOp_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(pythonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(pythonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code content_val_identifier}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void enterContent_val_identifier(pythonParser.Content_val_identifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code content_val_identifier}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void exitContent_val_identifier(pythonParser.Content_val_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code content_val_atom}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void enterContent_val_atom(pythonParser.Content_val_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code content_val_atom}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void exitContent_val_atom(pythonParser.Content_val_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code content_val_concat}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void enterContent_val_concat(pythonParser.Content_val_concatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code content_val_concat}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void exitContent_val_concat(pythonParser.Content_val_concatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code content_val_dict}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void enterContent_val_dict(pythonParser.Content_val_dictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code content_val_dict}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void exitContent_val_dict(pythonParser.Content_val_dictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code content_val_array}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void enterContent_val_array(pythonParser.Content_val_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code content_val_array}
	 * labeled alternative in {@link pythonParser#content_val}.
	 * @param ctx the parse tree
	 */
	void exitContent_val_array(pythonParser.Content_val_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void enterDictionary(pythonParser.DictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void exitDictionary(pythonParser.DictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(pythonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(pythonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#key_value}.
	 * @param ctx the parse tree
	 */
	void enterKey_value(pythonParser.Key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#key_value}.
	 * @param ctx the parse tree
	 */
	void exitKey_value(pythonParser.Key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#value_index}.
	 * @param ctx the parse tree
	 */
	void enterValue_index(pythonParser.Value_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#value_index}.
	 * @param ctx the parse tree
	 */
	void exitValue_index(pythonParser.Value_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(pythonParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(pythonParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#concat_str}.
	 * @param ctx the parse tree
	 */
	void enterConcat_str(pythonParser.Concat_strContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#concat_str}.
	 * @param ctx the parse tree
	 */
	void exitConcat_str(pythonParser.Concat_strContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_number}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_number(pythonParser.Atom_numberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_number}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_number(pythonParser.Atom_numberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_float}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_float(pythonParser.Atom_floatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_float}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_float(pythonParser.Atom_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_string}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_string(pythonParser.Atom_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_string}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_string(pythonParser.Atom_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_bool}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_bool(pythonParser.Atom_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_bool}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_bool(pythonParser.Atom_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_none}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_none(pythonParser.Atom_noneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_none}
	 * labeled alternative in {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_none(pythonParser.Atom_noneContext ctx);
}