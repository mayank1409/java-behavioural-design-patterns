package Mediator;

public interface Mediator {
    void notify(Component component, String message);

    void register(Component component);
}
