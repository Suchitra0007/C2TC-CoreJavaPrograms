package customexception;

// Exception for invalid deposit amount
public class InvalidAmountException extends Exception {
    private static final long serialVersionUID = 1L;  // <-- add this

    public InvalidAmountException(String message) {
        super(message);
    }
}
