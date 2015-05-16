// Generated from JjQuery.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JjQueryParser}.
 */
public interface JjQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull JjQueryParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull JjQueryParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull JjQueryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull JjQueryParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#endOfFile}.
	 * @param ctx the parse tree
	 */
	void enterEndOfFile(@NotNull JjQueryParser.EndOfFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#endOfFile}.
	 * @param ctx the parse tree
	 */
	void exitEndOfFile(@NotNull JjQueryParser.EndOfFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull JjQueryParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull JjQueryParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JjQueryParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JjQueryParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#in_out}.
	 * @param ctx the parse tree
	 */
	void enterIn_out(@NotNull JjQueryParser.In_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#in_out}.
	 * @param ctx the parse tree
	 */
	void exitIn_out(@NotNull JjQueryParser.In_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull JjQueryParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull JjQueryParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#assign_selection}.
	 * @param ctx the parse tree
	 */
	void enterAssign_selection(@NotNull JjQueryParser.Assign_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#assign_selection}.
	 * @param ctx the parse tree
	 */
	void exitAssign_selection(@NotNull JjQueryParser.Assign_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(@NotNull JjQueryParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(@NotNull JjQueryParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(@NotNull JjQueryParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(@NotNull JjQueryParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull JjQueryParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JjQueryParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull JjQueryParser.MainContext ctx);
}