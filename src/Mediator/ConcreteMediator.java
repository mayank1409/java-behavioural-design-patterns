package Mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements Mediator {

    private final String COMPONENT_A = "COMPONENT-A";
    private final String COMPONENT_B = "COMPONENT-B";

    private Map<String, Component> components = new HashMap<>();

    @Override
    public void notify(Component component, String message) {
        String sender = component.getName();
        if (COMPONENT_A.equals(sender)) {
            reactOnA(message);
        } else if (COMPONENT_B.equals(sender)) {
            reactOnB(message);
        }
    }

    @Override
    public void register(Component component) {
        components.put(component.getName(), component);
    }

    public void reactOnA(String message) {
        System.out.println("Mediator is in Action: ");
        components.get(COMPONENT_B).receive(message);
    }

    public void reactOnB(String message) {
        System.out.println("Mediator is in Action: ");
        components.get(COMPONENT_A).receive(message);
    }
}
