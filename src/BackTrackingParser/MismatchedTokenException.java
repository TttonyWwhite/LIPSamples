package BackTrackingParser;

public class MismatchedTokenException extends RecognitionException {
    public MismatchedTokenException() {
        super();
    }

    public MismatchedTokenException(String message) {
        super(message);
        System.out.println(message);
    }

    public MismatchedTokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public MismatchedTokenException(Throwable cause) {
        super(cause);
    }
}
