package chapter9.lesson4point2;

public class AskForNewFilenameException extends Exception {
    public AskForNewFilenameException() {
        super();
    }

    public AskForNewFilenameException(String message) {
        super(message);
    }

    public AskForNewFilenameException(String message, Throwable cause) {
        super(message, cause);
    }

    public AskForNewFilenameException(Throwable cause) {
        super(cause);
    }

    protected AskForNewFilenameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
