// Generated from C:/Compiler_Project/src/html/HTMLParser.g4 by ANTLR 4.13.2
package html.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(HTMLParser.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDqJINJA(HTMLParser.DqJINJAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqJINJA}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqJINJA(HTMLParser.SqJINJAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attValue}
	 * labeled alternative in {@link HTMLParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttValue(HTMLParser.AttValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(HTMLParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(HTMLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(HTMLParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link HTMLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(HTMLParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(HTMLParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#elifStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStm(HTMLParser.ElifStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#elseStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStm(HTMLParser.ElseStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(HTMLParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identefierEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentefierEXPR(HTMLParser.IdentefierEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberEXPR(HTMLParser.NumberEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEXPR(HTMLParser.StringEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanEXPR(HTMLParser.BooleanEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noneEXPR}
	 * labeled alternative in {@link HTMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneEXPR(HTMLParser.NoneEXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdMath(HTMLParser.IdMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOperation(HTMLParser.MulOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperation(HTMLParser.AddOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketMathOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketMathOperation(HTMLParser.BracketMathOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubOperation(HTMLParser.SubOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberMath}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberMath(HTMLParser.NumberMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOperation(HTMLParser.DivOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modOperation}
	 * labeled alternative in {@link HTMLParser#exprMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOperation(HTMLParser.ModOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(HTMLParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(HTMLParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonAssign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAssign(HTMLParser.NonAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HTMLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HTMLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArg(HTMLParser.BoolArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noneArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneArg(HTMLParser.NoneArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberArg(HTMLParser.NumberArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrArg(HTMLParser.StrArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idArg}
	 * labeled alternative in {@link HTMLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdArg(HTMLParser.IdArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVal(HTMLParser.BoolValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noneVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneVal(HTMLParser.NoneValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberVal(HTMLParser.NumberValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrVal(HTMLParser.StrValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValue(HTMLParser.IdValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMathVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMathVal(HTMLParser.ExpMathValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCallVal}
	 * labeled alternative in {@link HTMLParser#valueFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallVal(HTMLParser.FunCallValContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#exprLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogic(HTMLParser.ExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(HTMLParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(HTMLParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(HTMLParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(HTMLParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdLogic(HTMLParser.IdLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLogic(HTMLParser.StrLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLogic(HTMLParser.BoolLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noneLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLogic(HTMLParser.NoneLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLogic(HTMLParser.NumberLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMathLogic}
	 * labeled alternative in {@link HTMLParser#logicalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMathLogic(HTMLParser.ExprMathLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(HTMLParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(HTMLParser.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(HTMLParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#complexSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexSelector(HTMLParser.ComplexSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSelector(HTMLParser.IdentSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotIdentSelector(HTMLParser.DotIdentSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashIdentSelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashIdentSelector(HTMLParser.HashIdentSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplySelector}
	 * labeled alternative in {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplySelector(HTMLParser.MultiplySelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(HTMLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HTMLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleValComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleValComponent(HTMLParser.SingleValComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code slashComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashComponent(HTMLParser.SlashComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaComponent}
	 * labeled alternative in {@link HTMLParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaComponent(HTMLParser.CommaComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numIdSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumIdSingleVal(HTMLParser.NumIdSingleValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strSingleVla}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrSingleVla(HTMLParser.StrSingleVlaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSingleVal(HTMLParser.IdSingleValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberPerSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberPerSingleVal(HTMLParser.NumberPerSingleValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hexColorSingleVal}
	 * labeled alternative in {@link HTMLParser#singleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexColorSingleVal(HTMLParser.HexColorSingleValContext ctx);
}