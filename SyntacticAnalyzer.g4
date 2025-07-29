grammar SyntacticAnalyzer;

program: class_declaration* statement*;

statement:
    write_function
    | 'stop' ';'
    | request_function
    | declaration
    | assignation
    | compact_operation
    | is_statement
    | iterate_statement
    | while_statement
    | do_while_statement
    | switch_statement
    | function_declaration
    | return_statement
    | class_instance
    | property_call ';'
    | method_call ';'
;

// Declarations
declaration:
    data_type 'variable' var_list ';'
    | data_type 'constant' CONST_ID '=' expression ';'
;

var_list: var_decl (',' var_decl)*;

var_decl:
    variable_reference
    | variable_reference '=' expression
    | variable_reference '=' array_values
;

array_values: '[' array_elements ']';
array_elements: expression (',' expression)*;

data_type:
    'integer'
    | 'decimal'
    | 'char'
    | 'boolean'
    | 'string'
;

// Functions and I/O
function_declaration:
    function_type 'function' ID '(' parameter_list? ')' '{' statement* '}'
;

parameter_list: parameter (',' parameter)*;
parameter: data_type ID;
function_type: data_type | 'void';

write_function: 'write' '(' expression (',' expression)* ')' ';' ;
request_function: 'request' '(' ID (',' expression)? ')' ';';

// Assignments and operations
assignation:
    ID '=' expression ';'
    | ID '[' expression ']' '=' expression ';'
    | ID '.' ID '=' expression ';'
    | ID '.' ID '[' expression ']' '=' expression ';'
    | 'this' '.' ID '=' expression ';'
    | 'this' '.' ID '[' expression ']' '=' expression ';'
;

compact_operation:
    ID ('+='|'-='|'*='|'/=') expression ';'
    | ID '[' expression ']' ('+='|'-='|'*='|'/=') expression ';'
    | ID '.' ID ('+='|'-='|'*='|'/=') expression ';'
    | ID '.' ID '[' expression ']' ('+='|'-='|'*='|'/=') expression ';'
    | 'this' '.' ID ('+='|'-='|'*='|'/=') expression ';'
    | 'this' '.' ID '[' expression ']' ('+='|'-='|'*='|'/=') expression ';'
;

// Control structures
is_statement:
    'is' '(' expression ')' '?' 'yes' '{' statement+ '}'
    | 'is' '(' expression ')' '?' 'yes' '{' statement+ '}' or_is_statements 'nope' '{' statement+ '}'
;

or_is_statements: ('or' 'is' '(' expression ')' '?' 'yes' '{' statement+ '}')*;

iterate_statement: 'iterate' ID '(' 'from' expression 'to' expression ',' 'jumps' 'of' expression ')' '{' statement+ '}' ;
while_statement: 'while' '(' expression ')' '{' statement+ '}' ;
do_while_statement: 'do' '{' statement+ '}' 'while' '(' expression ')' ';' ;
switch_statement: 'switch' '(' expression ')' '{' case_block* default_block '}' ;
case_block: 'case' expression ':' statement+ 'break' ';' ;
default_block: 'default' ':' statement+ 'break' ';' ;
return_statement: 'return' expression ';' ;

// Simple POO
class_declaration:
    'class' ID '{' class_statement* '}'
;

class_statement: property_declaration | method_declaration ;

property_declaration:
    access_type data_type 'property' variable_reference ('=' expression)? ';'
;

variable_reference:
    ID
    | ID '[' expression ']'
;

method_declaration:
    access_type function_type 'method' ID '(' parameter_list? ')' '{' statement* '}'
;

access_type: 'public' | 'private' ;
class_instance: ID 'object' ID ';' ; // ej: Person object p;
property_call: 
    ID '.' ID          // obj.property  
    | 'this' '.' ID    // this.property
;
method_call: 
    ID '.' ID '(' argument_list? ')'     // obj.method()
    | 'this' '.' ID '(' argument_list? ')'  // this.method()
;

argument_list: expression (',' expression)*;

// Expressions
expression:
    NUMBER
    | DECIMAL
    | STRING
    | '-' expression
    | CONST_ID
    | ID
    | ID '[' expression ']'
    | 'true'
    | 'false'
    | expression ('and'|'or') expression
    | expression ('=='|'!='|'<'|'>'|'<='|'>=') expression
    | expression ('+'|'-'|'*'|'/') expression
    | 'this' '.' ID
    | 'this' '.' ID '[' expression ']'
    | ID '.' ID
    | ID '.' ID '[' expression ']'
    | method_call
    | remainder_expression
    | '(' expression ')'
;

remainder_expression: 'remainder' 'of' '(' expression '/' expression ')' ;

// Tokens
CONST_ID: [A-Z_][A-Z0-9_]*;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '"' (~["\\])* '"';
DECIMAL: [0-9]+ '.' [0-9]+;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;