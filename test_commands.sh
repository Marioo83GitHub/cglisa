antlr4 LexicalAnalyzer.g4 SyntacticAnalyzer.g4

antlr4 -listener -visitor SyntacticAnalyzer.g4

javac LexicalAnalyzer*.java SyntacticAnalyzer*.java

# Ver arbol en terminal
grun SyntacticAnalyzer program -tree < example.lc

# Ver arbol en gui
grun SyntacticAnalyzer program -gui < example.lc

# Ver tokens
grun SyntacticAnalyzer program -tokens < example.lc