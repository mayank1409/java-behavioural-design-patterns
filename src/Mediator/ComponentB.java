package Mediator;

/**
 * ComponentB is a concrete Component in the Mediator pattern.
 * It communicates with other components through the mediator.
 */
public class ComponentB extends Component {

    private static final String NAME = "COMPONENT-B";

    /**
     * Constructs ComponentB with a mediator.
     *
     * @param mediator the mediator for handling communication
     */
    public ComponentB(Mediator mediator) {
        super(NAME, mediator);
    }

    /**
     * Sends a custom message to other components through the mediator.
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println(this.getName() + " Sending - " + message);
        this.mediator.notify(this, message);
    }

    /**
     * Receives a message from another component via the mediator.
     *
     * @param message the message to receive
     */
    @Override
    public void receive(String message) {
        System.out.println(this.getName() + " Received - " + message);
    }
}
