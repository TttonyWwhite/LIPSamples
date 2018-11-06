package BackTrackingParser;

public class RecognitionException extends Exception {
    public RecognitionException() {
        super();
    }

    public RecognitionException(String message) {
        super(message);
    }

    public RecognitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecognitionException(Throwable cause) {
        super(cause);
    }
}
