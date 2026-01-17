package Mediator;

/**
 * Main demonstrates the Mediator design pattern.
 * Shows how components communicate through a centralized mediator
 * instead of directly with each other.
 */
public class Main {

    /**
     * Main entry point for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Mediator Pattern Demo ===\n");

        // Create the mediator
        Mediator mediator = new ConcreteMediator();

        // Create components (they auto-register with the mediator)
        System.out.println("--- Creating Components ---");
        ComponentA componentA = new ComponentA(mediator);
        ComponentB componentB = new ComponentB(mediator);

        // Demonstrate communication through mediator
        System.out.println("\n--- Component Communication ---");
        System.out.println("\n1. ComponentA sends a default message:");
        componentA.send("Hello from A! How are you?");

        System.out.println("\n2. ComponentB sends a custom message:");
        componentB.send("I am good! Thanks for asking!");

        System.out.println("\n3. ComponentA sends a custom message:");
        componentA.send("Nice to hear that!");

        System.out.println("\n4. ComponentB sends a default message:");
        componentB.send("Goodbye from B!");

        System.out.println("\n=== Demo Complete ===");
    }
}
