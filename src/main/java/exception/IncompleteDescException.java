package exception;

/**
 * Exception raised for when commands are not completed in the correct format
 * This exception is typically raised when a user attempts to execute a command but
 * did not provide all the necessary details required for the command.
 * e.g. of incomplete commands: todo, deadline submit homework
 */
public class IncompleteDescException extends Exception {
    public IncompleteDescException(String message) {
        super(message);
    }
}
