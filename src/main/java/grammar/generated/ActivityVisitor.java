// Generated from /Users/zcfrank1st/Desktop/git-svn/activity-parser/src/main/java/grammar/Activity.g4 by ANTLR 4.5.1
package grammar.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ActivityParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ActivityVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ActivityParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ActivityParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ActivityParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(ActivityParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ActivityParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ActivityParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(ActivityParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt(ActivityParser.OptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#threshold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreshold(ActivityParser.ThresholdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(ActivityParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(ActivityParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityParser#effect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect(ActivityParser.EffectContext ctx);
}