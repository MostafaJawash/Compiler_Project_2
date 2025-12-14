parser grammar pythonParser;

options {
    tokenVocab = pythonLexer;
}

file_input
    : stmt* EOF
    ;

stmt
    : simple_stmt  #simple_stmt_label
    | compound_stmt #compound_stmt_label
    //| NEWLINE #newline
    ;

simple_stmt
    : small_stmt (NEWLINE | EOF)
    ;

small_stmt
    : assignment #small_stmt_assignment
    | (IDENTIFIER (DOT IDENTIFIER)* DOT)? call_stmt #small_stmt_call
    | expr_math  #small_stmt_expr_math
    | return_stmt #small_stmt_return
    | del_stmt  #small_stmt_del
    | global_stmt  #small_stmt_global
    | BREAK  #small_stmt_break
    | CONTINUE  #small_stmt_continue
    | PASS #small_stmt_pass
    ;

global_stmt
    : GLOBAL IDENTIFIER (COMMA IDENTIFIER)*
    ;

assignment
    : target (ASSIGN target)* ASSIGN value_stmt    #assignment_multiple
    | target ADD_ASSIGN value_stmt                 #assignment_add
    | target SUB_ASSIGN value_stmt                 #assignment_sub
    | target MULT_ASSIGN value_stmt                #assignment_mult
    | target DIV_ASSIGN value_stmt                 #assignment_div
    | target MOD_ASSIGN value_stmt                 #assignment_mod
    | target AND_ASSIGN value_stmt                 #assignment_and
    | target OR_ASSIGN value_stmt                  #assignment_or
    | target XOR_ASSIGN value_stmt                 #assignment_xor
    | target LEFT_SHIFT_ASSIGN value_stmt          #assignment_lshift
    | target RIGHT_SHIFT_ASSIGN value_stmt         #assignment_rshift
    | target POWER_ASSIGN value_stmt               #assignment_power
    ;
target
    : IDENTIFIER (DOT IDENTIFIER)*
    ;
value_stmt
    : IDENTIFIER (DOT IDENTIFIER)* (value_index* | DOT call_stmt)   #value_stmt_identifier
    | atom                                         #value_stmt_atom
    | call_stmt                                    #value_stmt_call
    | array                                        #value_stmt_array
    | expr_math                                    #value_stmt_expr
    | dictionary                                   #value_stmt_dict
    ;

return_stmt
    : RETURN (value_stmt (COMMA value_stmt)*)?
    ;

del_stmt
  : DEL IDENTIFIER (DOT IDENTIFIER | value_index)* (COMMA IDENTIFIER (DOT IDENTIFIER | value_index)*)*
  ;

expr_math
    : LPAREN expr_math RPAREN                      #expr_math_paren
    | expr_math MUL expr_math                      #expr_math_mul
    | expr_math DIV expr_math                      #expr_math_div
    | expr_math ADD expr_math                      #expr_math_add
    | expr_math MINUS expr_math                    #expr_math_sub
    | expr_math MOD expr_math                      #expr_math_mod
    | expr_math POWER expr_math                    #expr_math_power
    | IDENTIFIER                                   #expr_math_identifier
    | NUMBER                                       #expr_math_number
    | FLOAT_NUMBER                                 #expr_math_float
    | call_stmt                                    #expr_math_call
    ;

compound_stmt
    : fun_def                                      #compound_stmt_fun
    | import_stmt                                  #compound_stmt_import
    | if_stmt                                      #compound_stmt_if
    | for_stmt                                     #compound_stmt_for
    | while_stmt                                   #compound_stmt_while
    | decorator                                    #compound_stmt_decorator
    ;

import_stmt
    : (import_stm1 | import_stm2 | import_stm3) (NEWLINE | EOF)
    ;
import_stm1
    : IMPORT IDENTIFIER (DOT IDENTIFIER )* (COMMA IDENTIFIER (DOT IDENTIFIER )*)* (AS IDENTIFIER)?  #import_stm1_label
    ;
import_stm2
    : FROM IDENTIFIER (DOT IDENTIFIER )* IMPORT
      IDENTIFIER (DOT IDENTIFIER )* (COMMA IDENTIFIER (DOT IDENTIFIER )*)* (AS IDENTIFIER)?  #import_stm2_label
    ;
import_stm3
     : FROM IDENTIFIER (DOT IDENTIFIER )* IMPORT
       LPAREN
       IDENTIFIER (DOT IDENTIFIER )* (AS IDENTIFIER)?
       (COMMA IDENTIFIER (DOT IDENTIFIER )* (AS IDENTIFIER)?)*
       RPAREN  #import_stm3_label
     ;

fun_def
   : DEF IDENTIFIER LPAREN arguments? RPAREN COLON suite
   ;
arguments
   : argument (COMMA argument)*
   ;
argument
    : IDENTIFIER (DOT IDENTIFIER)* (ASSIGN value_fun)?           #argument_identifier
    | atom                                                       #argument_atom
    | concat_str                                                 #argument_concat
    | call_stmt                                                  #argument_call
    | expr_math                                                  #argument_expr
    | dictionary                                                 #argument_dict
    | array                                                      #argument_array
    ;
value_fun
    : IDENTIFIER (DOT IDENTIFIER)*                                #value_fun_identifier
    | atom                                                        #value_fun_atom
    | concat_str                                                  #value_fun_concat
    | call_stmt                                                   #value_fun_call
    | expr_math                                                   #value_fun_expr
    | dictionary                                                  #value_fun_dict
    | array                                                       #value_fun_array
    ;

suite
     : NEWLINE INDENT stmt+ DEDENT
     ;

if_stmt
    :  IF expr_logic COLON suite (ELIF expr_logic COLON suite)* (ELSE COLON suite)?
    ;
for_stmt
    : FOR IDENTIFIER (DOT IDENTIFIER)* IN (IDENTIFIER (DOT IDENTIFIER)* | STRING | call_stmt) COLON suite
    ;
while_stmt
    : WHILE expr_logic COLON suite
    ;

expr_logic
    : LPAREN expr_logic RPAREN                                      #expr_logic_paren
    | NOT logical_arg                                               #expr_logic_not
    | logical_arg AND logical_arg                                   #expr_logic_and
    | logical_arg OR logical_arg                                    #expr_logic_or
    | logical_arg LESS_THAN logical_arg                             #expr_logic_lt
    | logical_arg GREATER_THAN logical_arg                          #expr_logic_gt
    | logical_arg EQUALS logical_arg                                #expr_logic_eq
    | logical_arg GT_EQ logical_arg                                  #expr_logic_gte
    | logical_arg LT_EQ logical_arg                                  #expr_logic_lte
    | logical_arg NOT_EQ_1 logical_arg                               #expr_logic_neq1
    | logical_arg NOT_EQ_2 logical_arg                               #expr_logic_neq2
    | logical_arg                                                    #expr_logic_single
    ;
logical_arg
    : IDENTIFIER (DOT IDENTIFIER)* value_index*                     #logical_arg_identifier
    | atom                                                          #logical_arg_atom
    | call_stmt                                                     #logical_arg_call
    | expr_math                                                     #logical_arg_expr
    ;


array
   : LBRACK (content_val (COMMA content_val)*)? RBRACK
   ;
content_val
    : IDENTIFIER                                                   #content_val_identifier
    | atom                                                          #content_val_atom
    | concat_str                                                    #content_val_concat
    | dictionary                                                    #content_val_dict
    | array                                                         #content_val_array
    ;

decorator
   : AT IDENTIFIER DOT IDENTIFIER LPAREN arguments? RPAREN NEWLINE fun_def
   ;

dictionary
    : object
    ;
object
     : LBRACE (key_value (COMMA key_value)*)? RBRACE
     ;
key_value
     : STRING COLON content_val
     ;

value_index
    : LBRACK
      (
      IDENTIFIER (DOT IDENTIFIER)*
      | NUMBER
      | FLOAT_NUMBER
      | STRING
      )
      RBRACK
    ;

call_stmt
   : IDENTIFIER LPAREN arguments? RPAREN
   ;

concat_str
   : (IDENTIFIER(DOT IDENTIFIER)* | STRING) (ADD (IDENTIFIER(DOT IDENTIFIER)* | STRING))+
   ;

atom
    : NUMBER                                                        #atom_number
    | FLOAT_NUMBER                                                  #atom_float
    | STRING                                                        #atom_string
    | (TRUE | FALSE)                                                #atom_bool
    | NONE                                                          #atom_none
    ;