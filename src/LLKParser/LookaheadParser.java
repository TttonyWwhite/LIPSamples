package LLKParser;

import LL1Lexer.Lexer;
import com.sun.jmx.snmp.EnumRowStatus;

public class LookaheadParser extends Parser {
    public LookaheadParser(Lexer input, int k) {
        super(input, k);
    }

    public void list() {
        match(LookaheadLexer.LBRACK);
        elements();
        match(LookaheadLexer.RBRACK);
    }

    void elements() {
        element();

        //往前看一位，如果是逗号
        while (LA(1) == LookaheadLexer.COMMA) {
            match(LookaheadLexer.COMMA);
            element();
        }
    }

    void element() {
        if (LA(1) == LookaheadLexer.NAME && LA(2) == LookaheadLexer.EQUALS) {
            //赋值语句
            match(LookaheadLexer.NAME);
            match(LookaheadLexer.EQUALS);
            match(LookaheadLexer.NAME);
        } else if (LA(1) == LookaheadLexer.NAME) match(LookaheadLexer.NAME);
        else if (LA(1) == LookaheadLexer.LBRACK) list();
        else throw new Error("expecting name or list; found " + LT(1));
    }
}
