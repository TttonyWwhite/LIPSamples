package LL1Parser;

import LL1Lexer.ListLexer;

public class Main {
    public static void main(String[] args) {
        ListLexer lexer = new ListLexer(args[0]);
        ListParser parser = new ListParser(lexer);
        parser.list();
    }
}
