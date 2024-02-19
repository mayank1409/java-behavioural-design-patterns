package Mediator;

public class ComponentA extends Component {

    public ComponentA(Mediator mediator) {
        super("COMPONENT-A", mediator);
    }

    @Override
    public void send() {
        String message = "How Are You?";
        System.out.println("Component A Sending - " + message);
        this.mediator.notify(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("Received by component A - "+ message);
    }
}
