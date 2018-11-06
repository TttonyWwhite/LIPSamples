package BackTrackingParser;

public class Test {
    public static void main(String[] args) {
        BacktrackLexer lexer = new BacktrackLexer(args[0]);
        BackTrackParser parser = new BackTrackParser(lexer);
        try {
            parser.stat();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
