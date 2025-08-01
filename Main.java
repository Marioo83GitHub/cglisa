import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("example.lc");
        AnalyzerLexer lexer = new AnalyzerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AnalyzerParser parser = new AnalyzerParser(tokens);
        
        // Add error listener to detect syntax issues
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                   int line, int charPositionInLine,
                                   String msg, RecognitionException e) {
                System.err.println("Syntax error at " + line + ":" + charPositionInLine + " - " + msg);
            }
        });

        ParseTree tree = parser.program();
        CodeGenerator generator = new CodeGenerator();
        String output = generator.visit(tree);  // Now gets actual generated code

        Files.write(Paths.get("output.cpp"), output.getBytes());
        System.out.println("Generated output.cpp");
    }
}