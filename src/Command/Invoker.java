package Command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Invoker is responsible for executing commands and managing command history.
 * It maintains a history of executed commands for undo/redo functionality.
 */
public class Invoker {

    private Command command;
    private final Deque<Command> commandHistory;

    /**
     * Constructs an Invoker without an initial command.
     */
    public Invoker() {
        this.commandHistory = new ArrayDeque<>();
    }

    /**
     * Constructs an Invoker with an initial command.
     *
     * @param command the initial command to set
     */
    public Invoker(Command command) {
        this.command = command;
        this.commandHistory = new ArrayDeque<>();
    }

    /**
     * Sets the current command.
     *
     * @param command the command to set
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Executes the current command and adds it to the history.
     */
    public void executeCommand() {
        if (command != null) {
            command.execute();
            commandHistory.push(command);
        } else {
            System.out.println("No command set to execute");
        }
    }

    /**
     * Undoes the last executed command if available.
     */
    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No command history to undo");
        }
    }

    /**
     * Returns the size of the command history.
     *
     * @return the number of commands in history
     */
    public int getHistorySize() {
        return commandHistory.size();
    }
}
