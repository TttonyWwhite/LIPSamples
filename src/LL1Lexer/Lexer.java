package LL1Lexer;

public abstract class Lexer {
    public static final char EOF = (char) -1; // end of file char
    public static final int EOF_TYPE = 1; // EOF token type
    protected String input; // input String
    protected int p = 0; // index into input of current character
    protected char c; // current character

    public Lexer(String input) {
        this.input = input;
        c = input.charAt(p);
    }

    public void consume() {
        advance();
    }

    public void advance() {
        p++;
        if ( p>= input.length() ) c = EOF;
        else c = input.charAt(p);
    }

    public void match(char x) {
        if (c == x) consume();
        else throw new Error("expecting " + x + "; found " + c);
    }

    public abstract Token nextToken();
    public abstract String getTokenName(int tokenType);
}
