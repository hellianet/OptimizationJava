package grammer;// Generated from secretSobaki.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link secretSobakiParser}.
 */
public interface secretSobakiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#gotoOperation}.
	 * @param ctx the parse tree
	 */
	void enterGotoOperation(@NotNull secretSobakiParser.GotoOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#gotoOperation}.
	 * @param ctx the parse tree
	 */
	void exitGotoOperation(@NotNull secretSobakiParser.GotoOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#strRightValue}.
	 * @param ctx the parse tree
	 */
	void enterStrRightValue(@NotNull secretSobakiParser.StrRightValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#strRightValue}.
	 * @param ctx the parse tree
	 */
	void exitStrRightValue(@NotNull secretSobakiParser.StrRightValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#compareInt}.
	 * @param ctx the parse tree
	 */
	void enterCompareInt(@NotNull secretSobakiParser.CompareIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#compareInt}.
	 * @param ctx the parse tree
	 */
	void exitCompareInt(@NotNull secretSobakiParser.CompareIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#strVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStrVarDeclaration(@NotNull secretSobakiParser.StrVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#strVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStrVarDeclaration(@NotNull secretSobakiParser.StrVarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#compareStr}.
	 * @param ctx the parse tree
	 */
	void enterCompareStr(@NotNull secretSobakiParser.CompareStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#compareStr}.
	 * @param ctx the parse tree
	 */
	void exitCompareStr(@NotNull secretSobakiParser.CompareStrContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#strVarAssign}.
	 * @param ctx the parse tree
	 */
	void enterStrVarAssign(@NotNull secretSobakiParser.StrVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#strVarAssign}.
	 * @param ctx the parse tree
	 */
	void exitStrVarAssign(@NotNull secretSobakiParser.StrVarAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(@NotNull secretSobakiParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(@NotNull secretSobakiParser.IncrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#intVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntVarDeclaration(@NotNull secretSobakiParser.IntVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#intVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntVarDeclaration(@NotNull secretSobakiParser.IntVarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull secretSobakiParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull secretSobakiParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull secretSobakiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull secretSobakiParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull secretSobakiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull secretSobakiParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#intRightValue}.
	 * @param ctx the parse tree
	 */
	void enterIntRightValue(@NotNull secretSobakiParser.IntRightValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#intRightValue}.
	 * @param ctx the parse tree
	 */
	void exitIntRightValue(@NotNull secretSobakiParser.IntRightValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull secretSobakiParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull secretSobakiParser.VarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull secretSobakiParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull secretSobakiParser.NotContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull secretSobakiParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull secretSobakiParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull secretSobakiParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull secretSobakiParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#intVarAssign}.
	 * @param ctx the parse tree
	 */
	void enterIntVarAssign(@NotNull secretSobakiParser.IntVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#intVarAssign}.
	 * @param ctx the parse tree
	 */
	void exitIntVarAssign(@NotNull secretSobakiParser.IntVarAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#gotoLabel}.
	 * @param ctx the parse tree
	 */
	void enterGotoLabel(@NotNull secretSobakiParser.GotoLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#gotoLabel}.
	 * @param ctx the parse tree
	 */
	void exitGotoLabel(@NotNull secretSobakiParser.GotoLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull secretSobakiParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull secretSobakiParser.LoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(@NotNull secretSobakiParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(@NotNull secretSobakiParser.CodeBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#compareOperation}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperation(@NotNull secretSobakiParser.CompareOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#compareOperation}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperation(@NotNull secretSobakiParser.CompareOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link secretSobakiParser#sobaki}.
	 * @param ctx the parse tree
	 */
	void enterSobaki(@NotNull secretSobakiParser.SobakiContext ctx);
	/**
	 * Exit a parse tree produced by {@link secretSobakiParser#sobaki}.
	 * @param ctx the parse tree
	 */
	void exitSobaki(@NotNull secretSobakiParser.SobakiContext ctx);
}