package Memento;

/**
 * Memento class for the Memento design pattern.
 * Captures and stores the internal state of an Originator at a specific point in time.
 * Memento objects are immutable to preserve the captured state.
 */
public class Memento {

    private final String state;
    private final long timestamp;

    /**
     * Constructs a Memento with the given state.
     *
     * @param state the state to capture and store
     */
    public Memento(String state) {
        this.state = state;
        this.timestamp = System.currentTimeMillis();
    }

    /**
     * Gets the captured state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Gets the timestamp when this memento was created.
     *
     * @return the creation timestamp in milliseconds
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Returns a string representation of the memento.
     *
     * @return state and timestamp information
     */
    @Override
    public String toString() {
        return "Memento{" +
                "state='" + state + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
