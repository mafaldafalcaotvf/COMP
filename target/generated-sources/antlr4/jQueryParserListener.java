// Generated from jQueryParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jQueryParserParser}.
 */
public interface jQueryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull jQueryParserParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull jQueryParserParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull jQueryParserParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull jQueryParserParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#jqBlock}.
	 * @param ctx the parse tree
	 */
	void enterJqBlock(@NotNull jQueryParserParser.JqBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#jqBlock}.
	 * @param ctx the parse tree
	 */
	void exitJqBlock(@NotNull jQueryParserParser.JqBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull jQueryParserParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull jQueryParserParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#assign_selection}.
	 * @param ctx the parse tree
	 */
	void enterAssign_selection(@NotNull jQueryParserParser.Assign_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#assign_selection}.
	 * @param ctx the parse tree
	 */
	void exitAssign_selection(@NotNull jQueryParserParser.Assign_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull jQueryParserParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull jQueryParserParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(@NotNull jQueryParserParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(@NotNull jQueryParserParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(@NotNull jQueryParserParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(@NotNull jQueryParserParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jQueryParserParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull jQueryParserParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link jQueryParserParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull jQueryParserParser.MainContext ctx);
}