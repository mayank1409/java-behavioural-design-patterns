package Command;

/**
 * Abstract Receiver class representing devices/objects that can execute actions.
 * Receivers know how to perform the actual work (on/off operations).
 */
public abstract class Receiver {

    protected String name;

    /**
     * Constructs a Receiver with a given name.
     *
     * @param name the name of the receiver (e.g., "Light", "Motor")
     */
    public Receiver(String name) {
        this.name = name;
    }

    /**
     * Turns the receiver on.
     */
    public abstract void on();

    /**
     * Turns the receiver off.
     */
    public abstract void off();

    /**
     * Gets the name of the receiver.
     *
     * @return the name of the receiver
     */
    public String getName() {
        return name;
    }
}
