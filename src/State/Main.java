package State;

/**
 * Main demonstrates the State design pattern.
 * Shows how an object's behavior changes based on its internal state,
 * allowing the object to alter its behavior without changing its class.
 */
public class Main {

    /**
     * Main entry point for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== State Pattern Demo ===\n");

        // Create a light bulb (starts in OFF state)
        LightBulb lightBulb = new LightBulb();

        // Display initial state
        System.out.println("\n--- Initial State ---");
        lightBulb.displayState();
        System.out.println("Current state: " + lightBulb.getCurrentStateName());

        // Toggle the light (OFF -> ON)
        System.out.println("\n--- First Toggle (OFF -> ON) ---");
        lightBulb.toggle();
        lightBulb.displayState();
        System.out.println("Current state: " + lightBulb.getCurrentStateName());

        // Toggle the light again (ON -> OFF)
        System.out.println("\n--- Second Toggle (ON -> OFF) ---");
        lightBulb.toggle();
        lightBulb.displayState();
        System.out.println("Current state: " + lightBulb.getCurrentStateName());

        // Toggle multiple times
        System.out.println("\n--- Multiple Toggles ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nToggle #" + i + ":");
            lightBulb.toggle();
            lightBulb.displayState();
            System.out.println("State: " + lightBulb.getCurrentStateName());
        }

        // Final state
        System.out.println("\n--- Final State ---");
        System.out.println(lightBulb);

        System.out.println("\n=== Demo Complete ===");
    }
}
