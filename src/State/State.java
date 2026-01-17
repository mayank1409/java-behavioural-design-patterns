package State;

/**
 * State interface for the State design pattern.
 * Defines the contract for different states that a context object can have.
 * Each state encapsulates behavior associated with a particular state of the context.
 */
public interface State {

    /**
     * Handles the toggle action when this state is active.
     */
    void handleToggle();

    /**
     * Displays information about the current state.
     */
    void displayState();

    /**
     * Gets the name of this state.
     *
     * @return the state name
     */
    String getName();
}
