package Observer;

/**
 * Main demonstrates the Observer design pattern.
 * Shows how observers are notified automatically when a Subject's state changes,
 * implementing a one-to-many dependency with loose coupling.
 */
public class Main {

    /**
     * Main entry point for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Observer Pattern Demo ===\n");

        // Create the subject (RadioStation)
        RadioStation radioStation = new RadioStation(2);
        System.out.println("RadioStation created with initial golden number: 2\n");

        // Create observers (Persons)
        System.out.println("--- Registering Observers ---");
        Person vlad = new Person("Vlad");
        Person john = new Person("John");
        Person bharath = new Person("Bharath");
        Person ranga = new Person("Ranga");

        radioStation.register(vlad);
        radioStation.register(john);
        radioStation.register(bharath);
        radioStation.register(ranga);

        // Notify all observers with initial state
        System.out.println("\n--- Initial Notification ---");
        radioStation.notifyObservers();

        // Update golden number - all observers will be notified
        System.out.println("\n--- First Update ---");
        radioStation.updateGoldenNumber(5);

        // Unregister some observers
        System.out.println("\n--- Unregistering Observers ---");
        radioStation.unregister(bharath);
        radioStation.unregister(john);

        // Update again - only remaining observers are notified
        System.out.println("\n--- Second Update ---");
        radioStation.updateGoldenNumber(10);

        // Re-register an observer
        System.out.println("\n--- Re-registering Observer ---");
        radioStation.register(john);

        // Update once more
        System.out.println("\n--- Third Update ---");
        radioStation.updateGoldenNumber(15);

        // Try to update with same value (should not notify)
        System.out.println("\n--- Attempt to Update with Same Value ---");
        radioStation.updateGoldenNumber(15);

        System.out.println("\n=== Demo Complete ===");
        System.out.println("Final observer count: " + radioStation.getObserverCount());
        System.out.println("Final golden number: " + radioStation.getGoldenNumber());
    }
}
