grammar Analyzer;

program: (statement)* EOF;

statement:
    write_function
    | array_index_assignation
    | stop_statement
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
    | property_call ';'
    | method_call ';'
    | function_call ';'
    | class_declaration
    | class_instance
    | array_declaration
;

array_declaration: data_type 'array' ID '[' expression ']' ('=' array_elements)? ';';
array_index_assignation: array_index '=' expression ';';

stop_statement: 'stop' ';';

// Declarations
declaration:
    data_type 'variable' var_list ';'
    | data_type 'constant' CONST_ID '=' expression ';'
;

// integer array numbers[5] = [1,2,3,4,5];
// integer array numbers[5];
// write(numbers[5]);
// numbers[3] = 4;


var_list: var_decl (',' var_decl)*;

var_decl:
    ID
    | ID '=' expression
;

// Functions and I/O
function_declaration:
    function_type 'function' ID '(' parameter_list? ')' '{' statement+ '}'
;

parameter_list: parameter (',' parameter)*;
parameter: data_type ID;
function_type: data_type | 'void';
data_type:
    'integer'
    | 'decimal'
    | 'char'
    | 'boolean'
    | 'string'
;

write_function: 'write' '(' expression (',' expression)* ')' ';' ;
request_function: 'request' '(' ID (',' expression)? ')' ';';

// Assignments and operations
assignation:
    ID '=' expression ';'
    | ID '.' ID '=' expression ';'
    | THIS '.' ID '=' expression ';'
;

compact_operation:
    ID ('+='|'-='|'*='|'/=') expression ';'
    | ID '.' ID ('+='|'-='|'*='|'/=') expression ';'
    | THIS '.' ID ('+='|'-='|'*='|'/=') expression ';'
;

// Control structures
is_statement:
    'is' '(' expression ')' '?' 'yes' '{' yesBlock=statement_list '}'                                      # IsOnly
    | 'is' '(' expression ')' '?' 'yes' '{' yesBlock=statement_list '}' 'nope' '{' nopeBlock=statement_list '}' # IsElse
;

statement_list: statement+;

iterate_statement: 'iterate' ID '(' 'from' expression 'to' expression ',' 'jumps' 'of' expression ')' '{' statement+ '}' ;


while_statement: 'while' '(' expression ')' '{' statement+ '}' ;
do_while_statement: 'do' '{' statement+ '}' 'while' '(' expression ')' ';' ;


switch_statement: 'switch' '(' expression ')' '{' case_block* default_block '}' ;
case_block: 'case' expression ':' statement+ ;
default_block: 'default' ':' statement+ ;

function_call: ID '(' argument_list? ')';
return_statement: 'return' expression ';' ;

// Simple POO
class_declaration:
    'class' ID '{' class_statement+ '}'
;

class_statement: property_declaration | method_declaration ;

property_declaration:
    access_type data_type 'property' ID ('=' expression)? ';'
;

method_declaration:
    access_type function_type 'method' ID '(' parameter_list? ')' '{' statement+ '}'
;

access_type: 'public' | 'private' ;

class_instance: ID 'object' ID ';' ; // ej: Person object p;

property_call: 
    ID '.' ID          // obj.property  
    | THIS '.' ID    // this.property
;

method_call: 
    ID '.' ID '(' argument_list? ')'     // obj.method()
    | THIS '.' ID '(' argument_list? ')'  // this.method()
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
    | 'true'
    | 'false'
    | property_call
    | method_call
    | function_call
    | expression ('and'|'or') expression
    | expression ('=='|'!='|'<'|'>'|'<='|'>=') expression
    | expression ('+'|'-'|'*'|'/') expression
    | remainder_expression
    | '(' expression ')'
    | array_index
;

array_index: ID '[' expression ']'; 
array_elements: '[' expression (',' expression)* ']';

remainder_expression: 'remainder' 'of' '(' expression '/' expression ')' ;

// Tokens
THIS: 'this';
CONST_ID: [A-Z_][A-Z0-9_]*;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '"' (~["\\])* '"';
DECIMAL: [0-9]+ '.' [0-9]+;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;