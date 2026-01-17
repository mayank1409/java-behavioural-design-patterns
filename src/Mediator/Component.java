package Mediator;

/**
 * Abstract Component class for the Mediator design pattern.
 * Components communicate through a mediator instead of directly with each other,
 * promoting loose coupling and centralized control of communication logic.
 */
public abstract class Component {

    private final String name;
    protected Mediator mediator;

    /**
     * Constructs a Component with a name and mediator.
     *
     * @param name     the name of the component
     * @param mediator the mediator for coordinating communication
     */
    public Component(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        // Automatically register with the mediator
        mediator.register(this);
    }

    /**
     * Sends a message through the mediator.
     */
    public abstract void send(String message);

    /**
     * Receives a message from another component (via mediator).
     *
     * @param message the message to receive
     */
    public abstract void receive(String message);

    /**
     * Gets the name of this component.
     *
     * @return the component name
     */
    public String getName() {
        return name;
    }
}
