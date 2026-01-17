package Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * ConcreteMediator implements the Mediator interface.
 * It coordinates the communication between components and encapsulates
 * the interaction logic, allowing components to remain loosely coupled.
 */
public class ConcreteMediator implements Mediator {

    private static final String COMPONENT_A = "COMPONENT-A";
    private static final String COMPONENT_B = "COMPONENT-B";

    private final Map<String, Component> components = new HashMap<>();

    /**
     * Notifies the mediator of a message from a component.
     * Routes the message to appropriate components based on the sender.
     *
     * @param component the component sending the message
     * @param message   the message content
     */
    @Override
    public void notify(Component component, String message) {
        String sender = component.getName();
        
        if (COMPONENT_A.equals(sender)) {
            reactOnA(message);
        } else if (COMPONENT_B.equals(sender)) {
            reactOnB(message);
        } else {
            System.out.println("Unknown component: " + sender);
        }
    }

    /**
     * Registers a component with the mediator.
     *
     * @param component the component to register
     */
    @Override
    public void register(Component component) {
        components.put(component.getName(), component);
        System.out.println(component.getName() + " registered with mediator");
    }

    /**
     * Handles reaction when ComponentA sends a message.
     * Routes the message to ComponentB.
     *
     * @param message the message from ComponentA
     */
    private void reactOnA(String message) {
        System.out.println("Mediator is in Action: Routing message from " + COMPONENT_A + " to " + COMPONENT_B);
        Component recipient = components.get(COMPONENT_B);
        if (recipient != null) {
            recipient.receive(message);
        } else {
            System.out.println("Error: " + COMPONENT_B + " not registered");
        }
    }

    /**
     * Handles reaction when ComponentB sends a message.
     * Routes the message to ComponentA.
     *
     * @param message the message from ComponentB
     */
    private void reactOnB(String message) {
        System.out.println("Mediator is in Action: Routing message from " + COMPONENT_B + " to " + COMPONENT_A);
        Component recipient = components.get(COMPONENT_A);
        if (recipient != null) {
            recipient.receive(message);
        } else {
            System.out.println("Error: " + COMPONENT_A + " not registered");
        }
    }
}
