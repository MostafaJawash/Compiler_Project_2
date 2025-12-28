// Generated from C:/Users/Lenovo/Compiler_Project/src/html/HTMLParser.g4 by ANTLR 4.13.2

package html.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(HTMLParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(HTMLParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterDqJINJA(HTMLParser.DqJINJAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitDqJINJA(HTMLParser.DqJINJAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterSqJINJA(HTMLParser.SqJINJAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitSqJINJA(HTMLParser.SqJINJAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attValue}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttValue(HTMLParser.AttValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attValue}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttValue(HTMLParser.AttValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(HTMLParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(HTMLParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(HTMLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(HTMLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(HTMLParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(HTMLParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(HTMLParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(HTMLParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(HTMLParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(HTMLParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#elifStm}.
	 * @param ctx the parse tree
	 */
	void enterElifStm(HTMLParser.ElifStmContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#elifStm}.
	 * @param ctx the parse tree
	 */
	void exitElifStm(HTMLParser.ElifStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#elseStm}.
	 * @param ctx the parse tree
	 */
	void enterElseStm(HTMLParser.ElseStmContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#elseStm}.
	 * @param ctx the parse tree
	 */
	void exitElseStm(HTMLParser.ElseStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(HTMLParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(HTMLParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identefierEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentefierEXPR(HTMLParser.IdentefierEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identefierEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentefierEXPR(HTMLParser.IdentefierEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberEXPR(HTMLParser.NumberEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberEXPR(HTMLParser.NumberEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringEXPR(HTMLParser.StringEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringEXPR(HTMLParser.StringEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanEXPR(HTMLParser.BooleanEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanEXPR(HTMLParser.BooleanEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noneEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNoneEXPR(HTMLParser.NoneEXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noneEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNoneEXPR(HTMLParser.NoneEXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterIdMath(HTMLParser.IdMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitIdMath(HTMLParser.IdMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterMulOperation(HTMLParser.MulOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitMulOperation(HTMLParser.MulOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterAddOperation(HTMLParser.AddOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitAddOperation(HTMLParser.AddOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketMathOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterBracketMathOperation(HTMLParser.BracketMathOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketMathOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitBracketMathOperation(HTMLParser.BracketMathOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterSubOperation(HTMLParser.SubOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitSubOperation(HTMLParser.SubOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterNumberMath(HTMLParser.NumberMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitNumberMath(HTMLParser.NumberMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterDivOperation(HTMLParser.DivOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitDivOperation(HTMLParser.DivOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void enterModOperation(HTMLParser.ModOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 */
	void exitModOperation(HTMLParser.ModOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(HTMLParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(HTMLParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(HTMLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(HTMLParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonAssign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterNonAssign(HTMLParser.NonAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonAssign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitNonAssign(HTMLParser.NonAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HTMLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HTMLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterBoolArg(HTMLParser.BoolArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitBoolArg(HTMLParser.BoolArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noneArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterNoneArg(HTMLParser.NoneArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noneArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitNoneArg(HTMLParser.NoneArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterNumberArg(HTMLParser.NumberArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitNumberArg(HTMLParser.NumberArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterStrArg(HTMLParser.StrArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitStrArg(HTMLParser.StrArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterIdArg(HTMLParser.IdArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitIdArg(HTMLParser.IdArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterBoolVal(HTMLParser.BoolValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitBoolVal(HTMLParser.BoolValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noneVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterNoneVal(HTMLParser.NoneValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noneVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitNoneVal(HTMLParser.NoneValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterNumberVal(HTMLParser.NumberValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitNumberVal(HTMLParser.NumberValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterStrVal(HTMLParser.StrValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitStrVal(HTMLParser.StrValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterIdValue(HTMLParser.IdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitIdValue(HTMLParser.IdValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMathVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterExpMathVal(HTMLParser.ExpMathValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMathVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitExpMathVal(HTMLParser.ExpMathValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funCallVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void enterFunCallVal(HTMLParser.FunCallValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funCallVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 */
	void exitFunCallVal(HTMLParser.FunCallValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketLogicOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void enterBracketLogicOperation(HTMLParser.BracketLogicOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketLogicOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void exitBracketLogicOperation(HTMLParser.BracketLogicOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void enterNotOperation(HTMLParser.NotOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void exitNotOperation(HTMLParser.NotOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void enterAndOperation(HTMLParser.AndOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void exitAndOperation(HTMLParser.AndOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void enterOrOperation(HTMLParser.OrOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void exitOrOperation(HTMLParser.OrOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperation(HTMLParser.CompareOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareOperation}
	 * labeled alternative in {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperation(HTMLParser.CompareOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterIdLogic(HTMLParser.IdLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitIdLogic(HTMLParser.IdLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterStrLogic(HTMLParser.StrLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitStrLogic(HTMLParser.StrLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterBoolLogic(HTMLParser.BoolLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitBoolLogic(HTMLParser.BoolLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noneLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterNoneLogic(HTMLParser.NoneLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noneLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitNoneLogic(HTMLParser.NoneLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterNumberLogic(HTMLParser.NumberLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitNumberLogic(HTMLParser.NumberLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMathLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void enterExprMathLogic(HTMLParser.ExprMathLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMathLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 */
	void exitExprMathLogic(HTMLParser.ExprMathLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(HTMLParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(HTMLParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(HTMLParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(HTMLParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(HTMLParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(HTMLParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#complexSelector}.
	 * @param ctx the parse tree
	 */
	void enterComplexSelector(HTMLParser.ComplexSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#complexSelector}.
	 * @param ctx the parse tree
	 */
	void exitComplexSelector(HTMLParser.ComplexSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdentSelector(HTMLParser.IdentSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdentSelector(HTMLParser.IdentSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterDotIdentSelector(HTMLParser.DotIdentSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitDotIdentSelector(HTMLParser.DotIdentSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterHashIdentSelector(HTMLParser.HashIdentSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitHashIdentSelector(HTMLParser.HashIdentSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplySelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterMultiplySelector(HTMLParser.MultiplySelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplySelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitMultiplySelector(HTMLParser.MultiplySelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HTMLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HTMLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HTMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HTMLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleValComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void enterSingleValComponent(HTMLParser.SingleValComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleValComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void exitSingleValComponent(HTMLParser.SingleValComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slashComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void enterSlashComponent(HTMLParser.SlashComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slashComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void exitSlashComponent(HTMLParser.SlashComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void enterCommaComponent(HTMLParser.CommaComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 */
	void exitCommaComponent(HTMLParser.CommaComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numIdSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterNumIdSingleVal(HTMLParser.NumIdSingleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numIdSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitNumIdSingleVal(HTMLParser.NumIdSingleValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strSingleVla}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterStrSingleVla(HTMLParser.StrSingleVlaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strSingleVla}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitStrSingleVla(HTMLParser.StrSingleVlaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterIdSingleVal(HTMLParser.IdSingleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitIdSingleVal(HTMLParser.IdSingleValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberPerSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberPerSingleVal(HTMLParser.NumberPerSingleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberPerSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberPerSingleVal(HTMLParser.NumberPerSingleValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hexColorSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void enterHexColorSingleVal(HTMLParser.HexColorSingleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hexColorSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 */
	void exitHexColorSingleVal(HTMLParser.HexColorSingleValContext ctx);
}