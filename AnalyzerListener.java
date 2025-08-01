// Generated from Analyzer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnalyzerParser}.
 */
public interface AnalyzerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AnalyzerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AnalyzerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AnalyzerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AnalyzerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#stop_statement}.
	 * @param ctx the parse tree
	 */
	void enterStop_statement(AnalyzerParser.Stop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#stop_statement}.
	 * @param ctx the parse tree
	 */
	void exitStop_statement(AnalyzerParser.Stop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AnalyzerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AnalyzerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(AnalyzerParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(AnalyzerParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(AnalyzerParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(AnalyzerParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(AnalyzerParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(AnalyzerParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(AnalyzerParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(AnalyzerParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AnalyzerParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AnalyzerParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(AnalyzerParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(AnalyzerParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(AnalyzerParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(AnalyzerParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#write_function}.
	 * @param ctx the parse tree
	 */
	void enterWrite_function(AnalyzerParser.Write_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#write_function}.
	 * @param ctx the parse tree
	 */
	void exitWrite_function(AnalyzerParser.Write_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#request_function}.
	 * @param ctx the parse tree
	 */
	void enterRequest_function(AnalyzerParser.Request_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#request_function}.
	 * @param ctx the parse tree
	 */
	void exitRequest_function(AnalyzerParser.Request_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(AnalyzerParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(AnalyzerParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#compact_operation}.
	 * @param ctx the parse tree
	 */
	void enterCompact_operation(AnalyzerParser.Compact_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#compact_operation}.
	 * @param ctx the parse tree
	 */
	void exitCompact_operation(AnalyzerParser.Compact_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsOnly}
	 * labeled alternative in {@link AnalyzerParser#is_statement}.
	 * @param ctx the parse tree
	 */
	void enterIsOnly(AnalyzerParser.IsOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsOnly}
	 * labeled alternative in {@link AnalyzerParser#is_statement}.
	 * @param ctx the parse tree
	 */
	void exitIsOnly(AnalyzerParser.IsOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsElse}
	 * labeled alternative in {@link AnalyzerParser#is_statement}.
	 * @param ctx the parse tree
	 */
	void enterIsElse(AnalyzerParser.IsElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsElse}
	 * labeled alternative in {@link AnalyzerParser#is_statement}.
	 * @param ctx the parse tree
	 */
	void exitIsElse(AnalyzerParser.IsElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(AnalyzerParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(AnalyzerParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#iterate_statement}.
	 * @param ctx the parse tree
	 */
	void enterIterate_statement(AnalyzerParser.Iterate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#iterate_statement}.
	 * @param ctx the parse tree
	 */
	void exitIterate_statement(AnalyzerParser.Iterate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(AnalyzerParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(AnalyzerParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(AnalyzerParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(AnalyzerParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(AnalyzerParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(AnalyzerParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#case_block}.
	 * @param ctx the parse tree
	 */
	void enterCase_block(AnalyzerParser.Case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#case_block}.
	 * @param ctx the parse tree
	 */
	void exitCase_block(AnalyzerParser.Case_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#default_block}.
	 * @param ctx the parse tree
	 */
	void enterDefault_block(AnalyzerParser.Default_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#default_block}.
	 * @param ctx the parse tree
	 */
	void exitDefault_block(AnalyzerParser.Default_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(AnalyzerParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(AnalyzerParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(AnalyzerParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(AnalyzerParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#class_statement}.
	 * @param ctx the parse tree
	 */
	void enterClass_statement(AnalyzerParser.Class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#class_statement}.
	 * @param ctx the parse tree
	 */
	void exitClass_statement(AnalyzerParser.Class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(AnalyzerParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(AnalyzerParser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(AnalyzerParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(AnalyzerParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#access_type}.
	 * @param ctx the parse tree
	 */
	void enterAccess_type(AnalyzerParser.Access_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#access_type}.
	 * @param ctx the parse tree
	 */
	void exitAccess_type(AnalyzerParser.Access_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void enterClass_instance(AnalyzerParser.Class_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void exitClass_instance(AnalyzerParser.Class_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#property_call}.
	 * @param ctx the parse tree
	 */
	void enterProperty_call(AnalyzerParser.Property_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#property_call}.
	 * @param ctx the parse tree
	 */
	void exitProperty_call(AnalyzerParser.Property_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(AnalyzerParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(AnalyzerParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(AnalyzerParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(AnalyzerParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AnalyzerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AnalyzerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalyzerParser#remainder_expression}.
	 * @param ctx the parse tree
	 */
	void enterRemainder_expression(AnalyzerParser.Remainder_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalyzerParser#remainder_expression}.
	 * @param ctx the parse tree
	 */
	void exitRemainder_expression(AnalyzerParser.Remainder_expressionContext ctx);
}