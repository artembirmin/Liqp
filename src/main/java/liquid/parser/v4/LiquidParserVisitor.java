package liquid.parser.v4;// Generated from C:/Users/petra/IdeaProjects/Liqp/src/main/antlr4/liquid/parser/v4\LiquidParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LiquidParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LiquidParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LiquidParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(LiquidParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LiquidParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_tag}
	 * labeled alternative in {@link LiquidParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_tag(LiquidParser.Atom_tagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_output}
	 * labeled alternative in {@link LiquidParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_output(LiquidParser.Atom_outputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_assignment}
	 * labeled alternative in {@link LiquidParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_assignment(LiquidParser.Atom_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_others}
	 * labeled alternative in {@link LiquidParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_others(LiquidParser.Atom_othersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(LiquidParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#other_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_tag(LiquidParser.Other_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#continue_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_tag(LiquidParser.Continue_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#other_tag_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_tag_block(LiquidParser.Other_tag_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#raw_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_tag(LiquidParser.Raw_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#raw_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_body(LiquidParser.Raw_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#comment_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_tag(LiquidParser.Comment_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#other_than_tag_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_than_tag_start(LiquidParser.Other_than_tag_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#if_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tag(LiquidParser.If_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#elsif_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_tag(LiquidParser.Elsif_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#else_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_tag(LiquidParser.Else_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#unless_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless_tag(LiquidParser.Unless_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#case_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_tag(LiquidParser.Case_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#when_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_tag(LiquidParser.When_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#cycle_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_tag(LiquidParser.Cycle_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#cycle_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_group(LiquidParser.Cycle_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#for_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_tag(LiquidParser.For_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#for_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_array(LiquidParser.For_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#for_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range(LiquidParser.For_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_block(LiquidParser.For_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#for_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_attribute(LiquidParser.For_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(LiquidParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#table_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_tag(LiquidParser.Table_tagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code capture_tag_Id}
	 * labeled alternative in {@link LiquidParser#capture_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_tag_Id(LiquidParser.Capture_tag_IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code capture_tag_Str}
	 * labeled alternative in {@link LiquidParser#capture_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_tag_Str(LiquidParser.Capture_tag_StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#include_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_tag(LiquidParser.Include_tagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jekyll_include_output}
	 * labeled alternative in {@link LiquidParser#file_name_or_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJekyll_include_output(LiquidParser.Jekyll_include_outputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jekyll_include_filename}
	 * labeled alternative in {@link LiquidParser#file_name_or_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJekyll_include_filename(LiquidParser.Jekyll_include_filenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#jekyll_include_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJekyll_include_params(LiquidParser.Jekyll_include_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(LiquidParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(LiquidParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LiquidParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param_expr_key_value}
	 * labeled alternative in {@link LiquidParser#param_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_expr_key_value(LiquidParser.Param_expr_key_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param_expr_expr}
	 * labeled alternative in {@link LiquidParser#param_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_expr_expr(LiquidParser.Param_expr_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LiquidParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_contains}
	 * labeled alternative in {@link LiquidParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_contains(LiquidParser.Expr_containsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_term}
	 * labeled alternative in {@link LiquidParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_term(LiquidParser.Expr_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_rel}
	 * labeled alternative in {@link LiquidParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_rel(LiquidParser.Expr_relContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_eq}
	 * labeled alternative in {@link LiquidParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_eq(LiquidParser.Expr_eqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_logic}
	 * labeled alternative in {@link LiquidParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_logic(LiquidParser.Expr_logicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_DoubleNum}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_DoubleNum(LiquidParser.Term_DoubleNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_LongNum}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_LongNum(LiquidParser.Term_LongNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_Str}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_Str(LiquidParser.Term_StrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_True}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_True(LiquidParser.Term_TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_False}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_False(LiquidParser.Term_FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_Nil}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_Nil(LiquidParser.Term_NilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_lookup}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_lookup(LiquidParser.Term_lookupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_Empty}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_Empty(LiquidParser.Term_EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_Blank}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_Blank(LiquidParser.Term_BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_expr}
	 * labeled alternative in {@link LiquidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_expr(LiquidParser.Term_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lookup_empty}
	 * labeled alternative in {@link LiquidParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_empty(LiquidParser.Lookup_emptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lookup_id_indexes}
	 * labeled alternative in {@link LiquidParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_id_indexes(LiquidParser.Lookup_id_indexesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lookup_Str}
	 * labeled alternative in {@link LiquidParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_Str(LiquidParser.Lookup_StrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lookup_Id}
	 * labeled alternative in {@link LiquidParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_Id(LiquidParser.Lookup_IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LiquidParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#id2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId2(LiquidParser.Id2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(LiquidParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#other_tag_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_tag_parameters(LiquidParser.Other_tag_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#other_than_tag_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_than_tag_end(LiquidParser.Other_than_tag_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(LiquidParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#tagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagStart(LiquidParser.TagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#outStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutStart(LiquidParser.OutStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiquidParser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(LiquidParser.OtherContext ctx);
}