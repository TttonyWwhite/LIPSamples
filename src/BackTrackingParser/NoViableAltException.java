package BackTrackingParser;

public class NoViableAltException extends RecognitionException {
    public NoViableAltException() {
        super();
    }

    public NoViableAltException(String message) {
        super(message);
        System.out.println(message);
    }

    public NoViableAltException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoViableAltException(Throwable cause) {
        super(cause);
    }
}
