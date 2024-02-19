package Mediator;

public class ComponentB extends Component {

    public ComponentB(Mediator mediator) {
        super("COMPONENT-B", mediator);
    }

    @Override
    public void send() {
        String message = "I am good";
        System.out.println("Component B Sending - " + message);
        this.mediator.notify(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("Received by component B - "+ message);
    }
}
