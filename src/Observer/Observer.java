package Observer;

/**
 * Observer interface for the Observer design pattern.
 * Defines the contract for objects that want to be notified of state changes
 * in a Subject.
 */
public interface Observer {

    /**
     * Called by the Subject when its state changes.
     *
     * @param goldenNumber the updated golden number
     */
    void notifyMe(int goldenNumber);

    /**
     * Gets a unique identifier for this observer.
     *
     * @return the observer's identifier
     */
    String getId();
}
