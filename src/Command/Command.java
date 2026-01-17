package Command;

/**
 * Command interface for the Command design pattern.
 * Encapsulates requests as objects, allowing parameterization of clients with
 * different requests, queue requests, and support for undoable operations.
 */
public interface Command {

    /**
     * Executes the command.
     */
    void execute();

    /**
     * Undoes the command, reverting to the previous state.
     */
    void undo();
}
