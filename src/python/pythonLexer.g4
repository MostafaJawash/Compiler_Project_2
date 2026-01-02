lexer grammar pythonLexer;

@header {
package python.generated;
}


@lexer::members {
    // Queue of pending tokens (INDENT, DEDENT, NEWLINE)
    private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
    // Stack for indentation levels
    private java.util.Stack<Integer> indents = new java.util.Stack<>();
    // Count of open parentheses/brackets/braces
    private int opened = 0;
    // Last emitted token
    private Token lastToken = null;

    @Override
    public void emit(Token t) {
        super.setToken(t);
        tokens.offer(t);
    }

    @Override
    public Token nextToken() {
        // Handle EOF with remaining DEDENTS
        if (_input.LA(1) == EOF && !indents.isEmpty()) {
            // Remove trailing EOF in queue
            for (int i = tokens.size() - 1; i >= 0; i--) {
                if (tokens.get(i).getType() == EOF) tokens.remove(i);
            }
            // Emit final newline
            this.emit(commonToken(pythonParser.NEWLINE, "\n"));
            // Emit remaining DEDENTs
            while (!indents.isEmpty()) {
                this.emit(createDedent());
                indents.pop();
            }
            // Emit EOF token
            this.emit(commonToken(pythonParser.EOF, "<EOF>"));
        }

        Token next = super.nextToken();
        if (next.getChannel() == Token.DEFAULT_CHANNEL) {
            this.lastToken = next;
        }
        return tokens.isEmpty() ? next : tokens.poll();
    }

    private Token createDedent() {
        CommonToken dedent = commonToken(pythonParser.DEDENT, "");
        dedent.setLine(this.lastToken.getLine());
        return dedent;
    }

    private CommonToken commonToken(int type, String text) {
        int stop = this.getCharIndex() - 1;
        int start = text.isEmpty() ? stop : stop - text.length() + 1;
        return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
    }

    // Compute indentation considering tabs (1-8 spaces)
    static int getIndentationCount(String spaces) {
        int count = 0;
        for (char ch : spaces.toCharArray()) {
            switch (ch) {
                case '\t': count += 8 - (count % 8); break;
                default: count++; break;
            }
        }
        return count;
    }

    boolean atStartOfInput() {
        return super.getCharPositionInLine() == 0 && super.getLine() == 1;
    }
}

NEWLINE
    :   ( {atStartOfInput()}? SPACES
        | ('\r'? '\n' | '\r') SPACES? )
        {
            String newLine = getText().replaceAll("[^\r\n]+", "");
            String spaces = getText().replaceAll("[\r\n]+", "");
            int nextChar = _input.LA(1);

            if (opened > 0 ||  nextChar == '\r' || nextChar == '\n' || nextChar == '#') {
                skip(); // inside brackets, ignore newlines
            } else {
                emit(commonToken(NEWLINE, newLine));
                int indent = getIndentationCount(spaces);
                int previous = indents.isEmpty() ? 0 : indents.peek();
                if (indent == previous) {
                    skip();
                } else if (indent > previous) {
                    indents.push(indent);
                    emit(commonToken(pythonParser.INDENT, spaces));
                } else {
                    while (!indents.isEmpty() && indents.peek() > indent) {
                        emit(createDedent());
                        indents.pop();
                    }
                }
            }
        }
    ;

INDENT  : '<INDENT>';
DEDENT  : '<DEDENT>';

LPAREN  : '(' {opened++;};
RPAREN  : ')' {opened--;};
LBRACK  : '[' {opened++;};
RBRACK  : ']' {opened--;};
LBRACE  : '{' {opened++;};
RBRACE  : '}' {opened--;};

COLON : ':' ;
COMMA : ',' ;
DOT : '.' ;
OR_OP: '|';
XOR: '^';
AND_OP: '&';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
AND_ASSIGN: '&=';
OR_ASSIGN: '|=';
XOR_ASSIGN: '^=';
LEFT_SHIFT_ASSIGN: '<<=';
RIGHT_SHIFT_ASSIGN: '>>=';
POWER_ASSIGN: '**=';
MUL: '*';
DIV: '/';
ADD: '+';
MINUS: '-';
MOD: '%';
POWER: '**';
GT_EQ: '>=';
LT_EQ: '<=';
NOT_EQ_1: '<>';
LESS_THAN: '<';
GREATER_THAN: '>';
EQUALS: '==';
NOT_EQ_2: '!=';
ASSIGN : '=' ;

GLOBAL: 'global';
AT : '@' ;
FROM: 'from';
IMPORT: 'import';
RETURN: 'return';
DEF: 'def';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
IN: 'in';
TRUE: 'True';
FALSE: 'False';
NONE: 'None';
DEL: 'del';
PASS: 'pass';
OR: 'or';
AND: 'and';
NOT: 'not';
IS: 'is';
CONTINUE: 'continue';
BREAK: 'break';
AS: 'as';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* ;
STRING: SHORT_STRING | LONG_STRING;
fragment SHORT_STRING:
    '\'' ('\\' (RN | .) | ~[\\\r\n'])* '\''
    | '"' ('\\' (RN | .) | ~[\\\r\n"])* '"';
fragment LONG_STRING: '\'\'\'' LONG_STRING_ITEM*? '\'\'\'' | '"""' LONG_STRING_ITEM*? '"""';
fragment LONG_STRING_ITEM: ~'\\' | '\\' (RN | .);
fragment RN: '\r'? '\n';
NUMBER: [1-9] [0-9]* | '0';
FLOAT_NUMBER: EXPONENT_OR_POINT_FLOAT;
fragment EXPONENT_OR_POINT_FLOAT: ([0-9]+ | POINT_FLOAT) [eE] [+-]? ([0-9]+ | POINT_FLOAT);
fragment POINT_FLOAT: [0-9]* '.' [0-9]+ | [0-9]+ '.';
SPACES : [ \t]+ -> skip ;
COMMENT: '#' ~[\r\n\f]* -> skip;
