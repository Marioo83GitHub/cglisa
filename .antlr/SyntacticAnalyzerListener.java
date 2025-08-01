// Generated from /home/mario/Desktop/cglisa/SyntacticAnalyzer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntacticAnalyzerParser}.
 */
public interface SyntacticAnalyzerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SyntacticAnalyzerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SyntacticAnalyzerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SyntacticAnalyzerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SyntacticAnalyzerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SyntacticAnalyzerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SyntacticAnalyzerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(SyntacticAnalyzerParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(SyntacticAnalyzerParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(SyntacticAnalyzerParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(SyntacticAnalyzerParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#array_values}.
	 * @param ctx the parse tree
	 */
	void enterArray_values(SyntacticAnalyzerParser.Array_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#array_values}.
	 * @param ctx the parse tree
	 */
	void exitArray_values(SyntacticAnalyzerParser.Array_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_elements(SyntacticAnalyzerParser.Array_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_elements(SyntacticAnalyzerParser.Array_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(SyntacticAnalyzerParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(SyntacticAnalyzerParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(SyntacticAnalyzerParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(SyntacticAnalyzerParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(SyntacticAnalyzerParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(SyntacticAnalyzerParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SyntacticAnalyzerParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SyntacticAnalyzerParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(SyntacticAnalyzerParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(SyntacticAnalyzerParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#write_function}.
	 * @param ctx the parse tree
	 */
	void enterWrite_function(SyntacticAnalyzerParser.Write_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#write_function}.
	 * @param ctx the parse tree
	 */
	void exitWrite_function(SyntacticAnalyzerParser.Write_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#request_function}.
	 * @param ctx the parse tree
	 */
	void enterRequest_function(SyntacticAnalyzerParser.Request_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#request_function}.
	 * @param ctx the parse tree
	 */
	void exitRequest_function(SyntacticAnalyzerParser.Request_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(SyntacticAnalyzerParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(SyntacticAnalyzerParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#compact_operation}.
	 * @param ctx the parse tree
	 */
	void enterCompact_operation(SyntacticAnalyzerParser.Compact_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#compact_operation}.
	 * @param ctx the parse tree
	 */
	void exitCompact_operation(SyntacticAnalyzerParser.Compact_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#is_statement}.
	 * @param ctx the parse tree
	 */
	void enterIs_statement(SyntacticAnalyzerParser.Is_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#is_statement}.
	 * @param ctx the parse tree
	 */
	void exitIs_statement(SyntacticAnalyzerParser.Is_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#or_is_statements}.
	 * @param ctx the parse tree
	 */
	void enterOr_is_statements(SyntacticAnalyzerParser.Or_is_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#or_is_statements}.
	 * @param ctx the parse tree
	 */
	void exitOr_is_statements(SyntacticAnalyzerParser.Or_is_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#iterate_statement}.
	 * @param ctx the parse tree
	 */
	void enterIterate_statement(SyntacticAnalyzerParser.Iterate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#iterate_statement}.
	 * @param ctx the parse tree
	 */
	void exitIterate_statement(SyntacticAnalyzerParser.Iterate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(SyntacticAnalyzerParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(SyntacticAnalyzerParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(SyntacticAnalyzerParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(SyntacticAnalyzerParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(SyntacticAnalyzerParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(SyntacticAnalyzerParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#case_block}.
	 * @param ctx the parse tree
	 */
	void enterCase_block(SyntacticAnalyzerParser.Case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#case_block}.
	 * @param ctx the parse tree
	 */
	void exitCase_block(SyntacticAnalyzerParser.Case_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#default_block}.
	 * @param ctx the parse tree
	 */
	void enterDefault_block(SyntacticAnalyzerParser.Default_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#default_block}.
	 * @param ctx the parse tree
	 */
	void exitDefault_block(SyntacticAnalyzerParser.Default_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(SyntacticAnalyzerParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(SyntacticAnalyzerParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(SyntacticAnalyzerParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(SyntacticAnalyzerParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#class_statement}.
	 * @param ctx the parse tree
	 */
	void enterClass_statement(SyntacticAnalyzerParser.Class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#class_statement}.
	 * @param ctx the parse tree
	 */
	void exitClass_statement(SyntacticAnalyzerParser.Class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(SyntacticAnalyzerParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(SyntacticAnalyzerParser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void enterVariable_reference(SyntacticAnalyzerParser.Variable_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void exitVariable_reference(SyntacticAnalyzerParser.Variable_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(SyntacticAnalyzerParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(SyntacticAnalyzerParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#access_type}.
	 * @param ctx the parse tree
	 */
	void enterAccess_type(SyntacticAnalyzerParser.Access_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#access_type}.
	 * @param ctx the parse tree
	 */
	void exitAccess_type(SyntacticAnalyzerParser.Access_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void enterClass_instance(SyntacticAnalyzerParser.Class_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void exitClass_instance(SyntacticAnalyzerParser.Class_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#property_call}.
	 * @param ctx the parse tree
	 */
	void enterProperty_call(SyntacticAnalyzerParser.Property_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#property_call}.
	 * @param ctx the parse tree
	 */
	void exitProperty_call(SyntacticAnalyzerParser.Property_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(SyntacticAnalyzerParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(SyntacticAnalyzerParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(SyntacticAnalyzerParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(SyntacticAnalyzerParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SyntacticAnalyzerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SyntacticAnalyzerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyzerParser#remainder_expression}.
	 * @param ctx the parse tree
	 */
	void enterRemainder_expression(SyntacticAnalyzerParser.Remainder_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyzerParser#remainder_expression}.
	 * @param ctx the parse tree
	 */
	void exitRemainder_expression(SyntacticAnalyzerParser.Remainder_expressionContext ctx);
}