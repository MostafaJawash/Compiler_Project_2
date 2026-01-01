parser grammar pythonParser;

@header {
package python.generated;
}

options {
    tokenVocab = pythonLexer;
}

file_input
    : stmt* EOF
    ;

stmt
    : simple_stmt (NEWLINE | EOF)                        #simple_stmt_label
    | compound_stmt                                      #compound_stmt_label
    ;

simple_stmt
    : assignment                                        #simple_stmt_assignment
    | (IDENTIFIER (DOT IDENTIFIER)* DOT)? call_stmt     #simple_stmt_call
    | import_stmt                                       #simple_stmt_import
    | return_stmt                                       #simple_stmt_return
    | del_stmt                                          #simple_stmt_del
    | global_stmt                                       #simple_stmt_global
    | BREAK                                             #simple_stmt_break
    | CONTINUE                                          #simple_stmt_continue
    | PASS                                              #simple_stmt_pass
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
    : IDENTIFIER suffix?
    ;
suffix
   : (DOT IDENTIFIER | value_index)+
   ;

value_stmt
    : IDENTIFIER (DOT IDENTIFIER)* value_index*       #value_stmt_identifier
    | atom                                            #value_stmt_atom
    | (IDENTIFIER (DOT IDENTIFIER)* DOT)? call_stmt   #value_stmt_call
    | array                                           #value_stmt_array
    | expr_math                                       #value_stmt_expr
    | dictionary                                      #value_stmt_dict
    ;

return_stmt
    : RETURN (value_stmt (COMMA value_stmt)*)?
    ;

del_stmt
  : DEL IDENTIFIER (DOT IDENTIFIER | value_index)* (COMMA IDENTIFIER (DOT IDENTIFIER | value_index)*)*
  ;

expr_math
    : math_add
    ;
math_add
    : math_mul                     #mathAdd_mul
    | math_add ADD math_mul        #mathAdd_add
    | math_add MINUS math_mul      #mathAdd_sub
    ;
math_mul
    : math_power                   #mathMul_power
    | math_mul MUL math_power      #mathMul_mul
    | math_mul DIV math_power      #mathMul_div
    | math_mul MOD math_power      #mathMul_mod
    ;
math_power
    : math_atom                    #mathPow_atom
    | math_atom POWER math_power   #mathPow_power
    ;
math_atom
    : LPAREN expr_math RPAREN      #mathAtom_paren
    | IDENTIFIER                   #mathAtom_id
    | NUMBER                       #mathAtom_num
    | FLOAT_NUMBER                 #mathAtom_float
    | call_stmt                    #mathAtom_call
    ;

compound_stmt
    : fun_def                                      #compound_stmt_fun
    | if_stmt                                      #compound_stmt_if
    | for_stmt                                     #compound_stmt_for
    | while_stmt                                   #compound_stmt_while
    | decorator                                    #compound_stmt_decorator
    ;

import_stmt
    : import_stm1 | import_stm2 | import_stm3
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
    : FOR IDENTIFIER (DOT IDENTIFIER)* (COMMA IDENTIFIER (DOT IDENTIFIER)*)* IN (IDENTIFIER (DOT IDENTIFIER)* | STRING | call_stmt | array) COLON suite
    ;
while_stmt
    : WHILE expr_logic COLON suite
    ;

expr_logic
    : expr_or
    ;
expr_or
   : expr_and                 #expr_or_and
   | expr_or OR expr_and      #expr_or_orAnd
   ;
expr_and
    : expr_not                #expr_and_not
    | expr_and AND expr_not   #expr_and_andNot
    ;
expr_not
    : NOT expr_not            #expr_not_not
    | expr_compare            #expr_not_compare
    ;
expr_compare
    : expr_operand compare_op expr_operand  #exprCom_comOp
    | expr_operand                          #exprCom_operand
    ;
compare_op
    : LESS_THAN
    | GREATER_THAN
    | EQUALS
    | GT_EQ
    | LT_EQ
    | NOT_EQ_1
    | NOT_EQ_2
    ;
expr_operand
    : LPAREN expr_logic RPAREN                     #exprOp_paren
    | IDENTIFIER (DOT IDENTIFIER)* value_index*    #exprOp_ide
    | atom                                         #exprOp_atom
    | call_stmt                                    #exprOp_call
    | expr_math                                    #exprOp_math
    ;

array
   : LBRACK (content_val (COMMA content_val)*)? RBRACK
   ;
content_val
    : IDENTIFIER                                                    #content_val_identifier
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