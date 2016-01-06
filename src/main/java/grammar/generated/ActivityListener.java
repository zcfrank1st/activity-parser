// Generated from /Users/zcfrank1st/Desktop/git-svn/activity-parser/src/main/java/grammar/Activity.g4 by ANTLR 4.5
package grammar.generated;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ActivityParser}.
 */
public interface ActivityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ActivityParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull ActivityParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull ActivityParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ActivityParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ActivityParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(@NotNull ActivityParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(@NotNull ActivityParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ActivityParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ActivityParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull ActivityParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull ActivityParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#opt}.
	 * @param ctx the parse tree
	 */
	void enterOpt(@NotNull ActivityParser.OptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#opt}.
	 * @param ctx the parse tree
	 */
	void exitOpt(@NotNull ActivityParser.OptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#threshold}.
	 * @param ctx the parse tree
	 */
	void enterThreshold(@NotNull ActivityParser.ThresholdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#threshold}.
	 * @param ctx the parse tree
	 */
	void exitThreshold(@NotNull ActivityParser.ThresholdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull ActivityParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull ActivityParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#side}.
	 * @param ctx the parse tree
	 */
	void enterSide(@NotNull ActivityParser.SideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#side}.
	 * @param ctx the parse tree
	 */
	void exitSide(@NotNull ActivityParser.SideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(@NotNull ActivityParser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(@NotNull ActivityParser.EffectContext ctx);
}