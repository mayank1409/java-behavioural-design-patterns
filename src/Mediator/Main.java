package Mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ComponentA componentA = new ComponentA(mediator);
        ComponentB componentB = new ComponentB(mediator);

        mediator.register(componentA);
        mediator.register(componentB);

        componentA.send();
        System.out.println();
        componentB.send();
    }
}
