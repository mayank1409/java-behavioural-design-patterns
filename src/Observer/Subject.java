package Observer;

/**
 * Subject interface for the Observer design pattern.
 * Defines the contract for objects that manage observers and notify them of state changes.
 */
public interface Subject {

    /**
     * Registers an observer to receive notifications.
     *
     * @param observer the observer to register
     */
    void register(Observer observer);

    /**
     * Unregisters an observer from receiving notifications.
     *
     * @param observer the observer to unregister
     */
    void unregister(Observer observer);

    /**
     * Notifies all registered observers of a state change.
     */
    void notifyObservers();
}
