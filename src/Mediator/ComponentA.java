package Mediator;

/**
 * ComponentA is a concrete Component in the Mediator pattern.
 * It communicates with other components through the mediator.
 */
public class ComponentA extends Component {

    private static final String NAME = "COMPONENT-A";

    /**
     * Constructs ComponentA with a mediator.
     *
     * @param mediator the mediator for handling communication
     */
    public ComponentA(Mediator mediator) {
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
