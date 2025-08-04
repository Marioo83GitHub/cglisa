// Generated from Analyzer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AnalyzerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnalyzerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AnalyzerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AnalyzerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration(AnalyzerParser.Array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#array_index_assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_index_assignation(AnalyzerParser.Array_index_assignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#stop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop_statement(AnalyzerParser.Stop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AnalyzerParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(AnalyzerParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(AnalyzerParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(AnalyzerParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(AnalyzerParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AnalyzerParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(AnalyzerParser.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(AnalyzerParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#write_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_function(AnalyzerParser.Write_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#request_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest_function(AnalyzerParser.Request_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(AnalyzerParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#compact_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompact_operation(AnalyzerParser.Compact_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsOnly}
	 * labeled alternative in {@link AnalyzerParser#is_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOnly(AnalyzerParser.IsOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsElse}
	 * labeled alternative in {@link AnalyzerParser#is_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsElse(AnalyzerParser.IsElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(AnalyzerParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#iterate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterate_statement(AnalyzerParser.Iterate_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(AnalyzerParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(AnalyzerParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(AnalyzerParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#case_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_block(AnalyzerParser.Case_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#default_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_block(AnalyzerParser.Default_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(AnalyzerParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(AnalyzerParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(AnalyzerParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_statement(AnalyzerParser.Class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(AnalyzerParser.Property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(AnalyzerParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#access_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_type(AnalyzerParser.Access_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#class_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_instance(AnalyzerParser.Class_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#property_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_call(AnalyzerParser.Property_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(AnalyzerParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(AnalyzerParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AnalyzerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#array_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_index(AnalyzerParser.Array_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#array_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elements(AnalyzerParser.Array_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnalyzerParser#remainder_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemainder_expression(AnalyzerParser.Remainder_expressionContext ctx);
}