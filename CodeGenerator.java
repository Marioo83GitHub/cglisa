import java.io.PrintWriter;
import java.util.List;

public class CodeGenerator extends AnalyzerBaseVisitor<String> {
    private final StringBuilder output = new StringBuilder();

    private String convertType(String lisaType) {
        return switch (lisaType) {
            case "integer" -> "int";
            case "decimal" -> "float";
            case "string" -> "string";
            case "char" -> "char";
            case "boolean" -> "bool";
            default -> lisaType;
        };
    }

    @Override
    public String visitProgram(AnalyzerParser.ProgramContext ctx) {
        
        output.append("#include <iostream>\n#include <string>\nusing namespace std;\n\n");

        // Then process class declarations
        for (var stmt : ctx.statement()) {
            if (stmt.class_declaration() != null) {
                output.append(visit(stmt.class_declaration()));
            }
        }

        // First process all function declarations
        for (var stmt : ctx.statement()) {
            if (stmt.function_declaration() != null) {
                output.append(visit(stmt.function_declaration()));
            }
        }

        // Finally generate main() with the remaining statements
        output.append("int main() {\n");
        for (var stmt : ctx.statement()) {
            if (stmt.function_declaration() == null && stmt.class_declaration() == null) {  // Skip function declarations
                output.append("    ");
                output.append(visit(stmt));
            }
        }
        output.append("    return 0;\n}\n");

        return output.toString();
    }

    @Override
    public String visitExpression(AnalyzerParser.ExpressionContext ctx) {
        if (ctx.NUMBER() != null) {
            return ctx.NUMBER().getText();
        }
        if (ctx.DECIMAL() != null) {
            return ctx.DECIMAL().getText();
        }
        if (ctx.STRING() != null) {
            return ctx.STRING().getText();
        }
        if (ctx.CONST_ID() != null) {
            return ctx.CONST_ID().getText();
        }
        if (ctx.ID() != null && ctx.ID().size() > 0 && ctx.getChildCount() == 1) {
            return ctx.ID(0).getText();  // Get first ID token
        }
        if (ctx.getChild(0).getText().equals("-")) {
            return "-" + visit(ctx.expression(0));
        }
        if (ctx.getChild(0).getText().equals("(")) {
            return "(" + visit(ctx.expression(0)) + ")";
        }

        if (ctx.method_call() != null) {
            return visit(ctx.method_call());
        }
        if (ctx.property_call() != null) {
            return visit(ctx.property_call());
        }
        if (ctx.remainder_expression() != null) {
            return visit(ctx.remainder_expression());
        }
        if (ctx.method_call() != null) {
            return visit(ctx.method_call());
        }

        if (ctx.THIS() != null && ctx.ID() != null) {
            return "this->" + ctx.ID(0).getText();
        }

        if (ctx.getChildCount() == 3) {
            String left = visit(ctx.expression(0));
            String op = ctx.getChild(1).getText();
            String right = visit(ctx.expression(1));
            return left + " " + op + " " + right;
        }

        return ctx.getText();
    }

    @Override
    public String visitMethod_call(AnalyzerParser.Method_callContext ctx) {
        String object = ctx.THIS() != null ? "this" : ctx.ID(0).getText();
        String method = ctx.ID(ctx.THIS() != null ? 0 : 1).getText(); // El nombre del método
        String args = ctx.argument_list() != null ? visit(ctx.argument_list()) : "";
        return object + "->" + method + "(" + args + ")";
    }

    @Override
    public String visitWrite_function(AnalyzerParser.Write_functionContext ctx) {
        StringBuilder line = new StringBuilder("cout");
        for (var e : ctx.expression()) {
            line.append(" << ").append(visit(e));
        }
        return line.append(" << endl;\n").toString();
    }

    @Override
    public String visitAssignation(AnalyzerParser.AssignationContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        
        // Handle property assignment (cases with .)
        if (ctx.getChildCount() > 3 && ctx.getChild(1).getText().equals(".")) {
            if (ctx.getChild(0).getText().equals("this")) {
                // this.property = value;
                cppCode.append("this->")
                    .append(ctx.ID(0).getText())
                    .append(" = ")
                    .append(visit(ctx.expression()))
                    .append(";");
            } else {
                // obj.property = value;
                cppCode.append(ctx.ID(0).getText())
                    .append(".")
                    .append(ctx.ID(1).getText())
                    .append(" = ")
                    .append(visit(ctx.expression()))
                    .append(";");
            }
        }
        // Simple variable assignment
        else {
            // var = value;
            cppCode.append(ctx.ID(0).getText())
                .append(" = ")
                .append(visit(ctx.expression()))
                .append(";");
        }
        
        return cppCode.append("\n").toString();
    }

    @Override
    public String visitDeclaration(AnalyzerParser.DeclarationContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        String type = convertType(ctx.data_type().getText());
        
        if (ctx.var_list() != null) {
            List<AnalyzerParser.Var_declContext> varDecls = ctx.var_list().var_decl();
            for (int i = 0; i < varDecls.size(); i++) {
                AnalyzerParser.Var_declContext varDecl = varDecls.get(i);
                
                String varName = varDecl.getChild(0).getText();
                
                cppCode.append(type).append(" ").append(varName);
                
                // Verificar si tiene asignación (var_decl: ID '=' expression)
                if (varDecl.expression() != null) {
                    cppCode.append(" = ").append(visit(varDecl.expression()));
                }
                
                if (i < varDecls.size() - 1) {
                    cppCode.append(";\n");
                } else {
                    cppCode.append(";\n");
                }
            }
        } else {
            // Constantes
            cppCode.append("const ").append(type).append(" ")
                .append(ctx.CONST_ID().getText())
                .append(" = ")
                .append(visit(ctx.expression()))
                .append(";\n");
        }
        
        return cppCode.toString();
    }

    @Override
    public String visitRequest_function(AnalyzerParser.Request_functionContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        
        // Get the variable name to store input
        String varName = ctx.ID().getText();
        
        // Check if there's a prompt message
        if (ctx.expression() != null) {
            cppCode.append("cout << ").append(visit(ctx.expression())).append(";\n    ");
        }
        
        // Generate the appropriate input statement based on variable type
        // Note: You'll need to track variable types in your symbol table for this to work perfectly
        // This is a simplified version that assumes the variable exists
        cppCode.append("cin >> ").append(varName).append(";\n");
        
        return cppCode.toString();
    }

    @Override
    public String visitCompact_operation(AnalyzerParser.Compact_operationContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        
        // Get the operator (+=, -=, *=, /=)
        String op = ctx.getChild(1).getText();
        
        // Handle property access cases (with .)
        if (ctx.getChildCount() > 4 && ctx.getChild(1).getText().equals(".")) {
            if (ctx.getChild(0).getText().equals("this")) {
                // this.property OP value
                cppCode.append("this->")
                    .append(ctx.ID(0).getText())
                    .append(" ")
                    .append(op)
                    .append(" ")
                    .append(visit(ctx.expression()))
                    .append(";");
            } else {
                // obj.property OP value
                cppCode.append(ctx.ID(0).getText())
                    .append(".")
                    .append(ctx.ID(1).getText())
                    .append(" ")
                    .append(op)
                    .append(" ")
                    .append(visit(ctx.expression()))
                    .append(";");
            }
        }
        // Simple variable case
        else {
            // var OP value
            cppCode.append(ctx.ID(0).getText())
                .append(" ")
                .append(op)
                .append(" ")
                .append(visit(ctx.expression()))
                .append(";");
        }
        
        return cppCode.append("\n").toString();
    }

    @Override
    public String visitIsOnly(AnalyzerParser.IsOnlyContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        
        String condition = visit(ctx.expression());
        cppCode.append("if (").append(condition).append(") {\n");
        
        // ctx.yesBlock ahora es un statement_list, que tiene statement()
        for (AnalyzerParser.StatementContext stmt : ctx.yesBlock.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null && !stmtCode.trim().isEmpty()) {
                cppCode.append("        ").append(stmtCode);
            }
        }
        
        cppCode.append("    }\n");
        return cppCode.toString();
    }

    @Override
    public String visitIsElse(AnalyzerParser.IsElseContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        
        String condition = visit(ctx.expression());
        cppCode.append("    if (").append(condition).append(") {\n");
        
        // Bloque "yes"
        for (AnalyzerParser.StatementContext stmt : ctx.yesBlock.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null && !stmtCode.trim().isEmpty()) {
                cppCode.append("        ").append(stmtCode);
            }
        }
        
        cppCode.append("    } else {\n");
        
        // Bloque "nope"
        for (AnalyzerParser.StatementContext stmt : ctx.nopeBlock.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null && !stmtCode.trim().isEmpty()) {
                cppCode.append("        ").append(stmtCode);
            }
        }
        
        cppCode.append("    }\n");
        return cppCode.toString();
    }

    @Override
    public String visitIterate_statement(AnalyzerParser.Iterate_statementContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        
        // Obtener los componentes del iterate
        String variable = ctx.ID().getText();              // Variable del loop
        String fromValue = visit(ctx.expression(0));       // Valor inicial (from)
        String toValue = visit(ctx.expression(1));         // Valor final (to)
        String jumpValue = visit(ctx.expression(2));       // Incremento (jumps of)
        
        // Generar el for loop en C++
        // Formato: for (variable = from; variable <= to; variable += jumps)
        cppCode.append("    for (")
            .append(variable).append(" = ").append(fromValue).append("; ")
            .append(variable).append(" <= ").append(toValue).append("; ")
            .append(variable).append(" += ").append(jumpValue).append(") {\n");
        
        // Agregar todos los statements del cuerpo del loop
        for (AnalyzerParser.StatementContext stmt : ctx.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null && !stmtCode.trim().isEmpty()) {
                cppCode.append("        ").append(stmtCode);
            }
        }
        
        cppCode.append("    }\n");
        return cppCode.toString();
    }

    @Override
    public String visitWhile_statement(AnalyzerParser.While_statementContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        
        // Obtener la condición del while
        String condition = visit(ctx.expression());
        
        // Generar el while loop en C++
        cppCode.append("    while (").append(condition).append(") {\n");
        
        // Agregar todos los statements del cuerpo del while
        for (AnalyzerParser.StatementContext stmt : ctx.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null && !stmtCode.trim().isEmpty()) {
                cppCode.append("        ").append(stmtCode);
            }
        }
        
        cppCode.append("    }\n");
        return cppCode.toString();
    }

    @Override
    public String visitDo_while_statement(AnalyzerParser.Do_while_statementContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        
        // Obtener la condición del do-while
        String condition = visit(ctx.expression());
        
        // Generar el do-while loop en C++
        cppCode.append("    do {\n");
        
        // Agregar todos los statements del cuerpo del do-while
        for (AnalyzerParser.StatementContext stmt : ctx.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null && !stmtCode.trim().isEmpty()) {
                cppCode.append("        ").append(stmtCode);
            }
        }
        
        cppCode.append("    } while (").append(condition).append(");\n");
        return cppCode.toString();
    }
    
    @Override
    public String visitSwitch_statement(AnalyzerParser.Switch_statementContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        String condition = visit(ctx.expression());

        cppCode.append("    switch (").append(condition).append(") {\n");

        for (AnalyzerParser.Case_blockContext caseBlock : ctx.case_block()) {
            cppCode.append(visit(caseBlock));
        }

        if (ctx.default_block() != null) {
            cppCode.append(visit(ctx.default_block()));
        }

        cppCode.append("    }\n");
        return cppCode.toString();
    }

    @Override
    public String visitCase_block(AnalyzerParser.Case_blockContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        String caseValue = visit(ctx.expression());

        cppCode.append("        case ").append(caseValue).append(":\n");
        for (AnalyzerParser.StatementContext stmt : ctx.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null && !stmtCode.trim().isEmpty()) {
                cppCode.append("            ").append(stmtCode);
            }
        }
        cppCode.append("            break;\n");
        return cppCode.toString();
    }

    @Override
    public String visitDefault_block(AnalyzerParser.Default_blockContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        cppCode.append("        default:\n");

        for (AnalyzerParser.StatementContext stmt : ctx.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null && !stmtCode.trim().isEmpty()) {
                cppCode.append("            ").append(stmtCode);
            }
        }
        cppCode.append("            break;\n");
        return cppCode.toString();
    }

    @Override
    public String visitFunction_declaration(AnalyzerParser.Function_declarationContext ctx) {
        StringBuilder cppCode = new StringBuilder();
        
        // Convert function type (return type)
        String returnType = convertReturnType(ctx.function_type().getText());
        String functionName = ctx.ID().getText();
        
        cppCode.append(returnType).append(" ").append(functionName).append("(");
        
        // Handle parameters
        if (ctx.parameter_list() != null) {
            List<AnalyzerParser.ParameterContext> params = ctx.parameter_list().parameter();
            for (int i = 0; i < params.size(); i++) {
                AnalyzerParser.ParameterContext param = params.get(i);
                String paramType = convertType(param.data_type().getText());
                String paramName = param.ID().getText();
                cppCode.append(paramType).append(" ").append(paramName);
                if (i < params.size() - 1) {
                    cppCode.append(", ");
                }
            }
        }
        
        cppCode.append(") {\n");
        
        // Handle function body statements
        for (var stmt : ctx.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null) {
                cppCode.append("    ").append(stmtCode);
            }
        }
        
        cppCode.append("}\n\n");
        return cppCode.toString();
    }

    private String convertReturnType(String returnType) {
        return switch (returnType) {
            case "integer" -> "int";
            case "decimal" -> "float";
            case "string" -> "string";
            case "char" -> "char";
            case "boolean" -> "bool";
            case "void" -> "void";
            default -> returnType;
        };
    }

    @Override
    public String visitRemainder_expression(AnalyzerParser.Remainder_expressionContext ctx) {
        // Get the two expressions (numerator and denominator)
        String numerator = visit(ctx.expression(0));
        String denominator = visit(ctx.expression(1));
        
        // Generate C++ modulus operation
        return "(" + numerator + " % " + denominator + ")";
    }

    @Override
    public String visitReturn_statement(AnalyzerParser.Return_statementContext ctx) {        
        // Generate C++ return statement
        return "return " + visit(ctx.expression()) + ";\n";
    }

    @Override
    public String visitStop_statement(AnalyzerParser.Stop_statementContext ctx) {        
        // Generate C++ break statement
        return "break;\n";
    }

    @Override
    public String visitClass_declaration(AnalyzerParser.Class_declarationContext ctx) {
        StringBuilder publicStuff = new StringBuilder();
        StringBuilder privateStuff = new StringBuilder();

        List<AnalyzerParser.Class_statementContext> classStatements = ctx.class_statement();

        for (AnalyzerParser.Class_statementContext stmt : classStatements) {

            if (stmt.property_declaration() != null) {
                StringBuilder target = stmt.property_declaration().access_type().getText().equals("private") ? privateStuff : publicStuff;
                target.append("        ").append(convertType(stmt.property_declaration().data_type().getText())).append(" ");
                
                // Obtener el nombre de la propiedad directamente
                target.append(stmt.property_declaration().ID().getText());

                if (stmt.property_declaration().expression() != null) {
                    target.append(" = ").append(visit(stmt.property_declaration().expression()));
                }

                target.append(";\n");
            } 
            else if (stmt.method_declaration() != null) {
                StringBuilder target = stmt.method_declaration().access_type().getText().equals("private") ? privateStuff : publicStuff;
                target.append("        ").append(convertReturnType(stmt.method_declaration().function_type().getText())).append(" ")
                    .append(stmt.method_declaration().ID().getText())
                    .append("(");
                
                AnalyzerParser.Parameter_listContext params = stmt.method_declaration().parameter_list();

                if (params != null) {
                    List<AnalyzerParser.ParameterContext> paramList = params.parameter();
                    for (int i = 0; i < paramList.size(); i++) {
                        AnalyzerParser.ParameterContext p = paramList.get(i);
                        target.append(convertType(p.data_type().getText()))
                            .append(" ")
                            .append(p.ID().getText());
                        if (i < paramList.size() - 1) target.append(", ");
                    }
                }

                target.append(")\n        {\n");

                // Agregar todos los statements del cuerpo del método
                for (AnalyzerParser.StatementContext mstmt : stmt.method_declaration().statement()) {
                    String stmtCode = visit(mstmt);
                    if (stmtCode != null && !stmtCode.trim().isEmpty()) {
                        target.append("            ").append(stmtCode);
                    }
                }
                target.append("        }\n");
            }
        }

        StringBuilder cppCode = new StringBuilder();
        cppCode.append("class ").append(ctx.ID()).append("{\n");
        cppCode.append("    public:\n").append(publicStuff);
        cppCode.append("    private:\n").append(privateStuff);
        cppCode.append("};\n\n"); 
        return cppCode.toString();
    }
}