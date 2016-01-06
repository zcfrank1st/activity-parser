// Generated from /Users/zcfrank1st/Desktop/git-svn/activity-parser/src/main/java/grammar/Activity.g4 by ANTLR 4.5.1
package grammar.generated;
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
	void enterMain(ActivityParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ActivityParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ActivityParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ActivityParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(ActivityParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(ActivityParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ActivityParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ActivityParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ActivityParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ActivityParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(ActivityParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(ActivityParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#opt}.
	 * @param ctx the parse tree
	 */
	void enterOpt(ActivityParser.OptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#opt}.
	 * @param ctx the parse tree
	 */
	void exitOpt(ActivityParser.OptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#threshold}.
	 * @param ctx the parse tree
	 */
	void enterThreshold(ActivityParser.ThresholdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#threshold}.
	 * @param ctx the parse tree
	 */
	void exitThreshold(ActivityParser.ThresholdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(ActivityParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(ActivityParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#side}.
	 * @param ctx the parse tree
	 */
	void enterSide(ActivityParser.SideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#side}.
	 * @param ctx the parse tree
	 */
	void exitSide(ActivityParser.SideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityParser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(ActivityParser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityParser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(ActivityParser.EffectContext ctx);
}