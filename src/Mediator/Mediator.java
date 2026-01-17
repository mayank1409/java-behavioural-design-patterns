package Mediator;

/**
 * Mediator interface for the Mediator design pattern.
 * Defines the contract for mediators that facilitate communication between components
 * without the components being directly aware of each other.
 */
public interface Mediator {

    /**
     * Notifies the mediator of a message from a component.
     * The mediator decides how to route the message to other components.
     *
     * @param component the component sending the message
     * @param message   the message content
     */
    void notify(Component component, String message);

    /**
     * Registers a component with the mediator.
     *
     * @param component the component to register
     */
    void register(Component component);
}
