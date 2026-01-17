package Memento;

/**
 * Main demonstrates the Memento design pattern.
 * Shows how to capture snapshots of an object's state and restore to previous states,
 * implementing undo/redo functionality without exposing internal details.
 */
public class Main {

    /**
     * Main entry point for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Memento Pattern Demo ===\n");

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        // Create initial states and save them
        System.out.println("--- Saving States ---");
        originator.setArticle("STATE-1");
        careTaker.addMemento(originator.save());

        originator.setArticle("STATE-2");
        careTaker.addMemento(originator.save());

        originator.setArticle("STATE-3");
        careTaker.addMemento(originator.save());

        originator.setArticle("STATE-4");
        careTaker.addMemento(originator.save());

        originator.setArticle("STATE-5");
        careTaker.addMemento(originator.save());

        // Display current state
        System.out.println("\n--- Current State ---");
        printState(originator, careTaker);

        // Demonstrate undo operations
        System.out.println("\n--- Undoing States (3 times) ---");
        originator.restore(careTaker.undoState());
        printState(originator, careTaker);

        originator.restore(careTaker.undoState());
        printState(originator, careTaker);

        originator.restore(careTaker.undoState());
        printState(originator, careTaker);

        // Demonstrate redo operations
        System.out.println("\n--- Redoing States (2 times) ---");
        originator.restore(careTaker.redoState());
        printState(originator, careTaker);

        originator.restore(careTaker.redoState());
        printState(originator, careTaker);

        // Try to go beyond history limits
        System.out.println("\n--- Trying to Undo from Beginning ---");
        originator.restore(careTaker.undoState());
        originator.restore(careTaker.undoState());
        originator.restore(careTaker.undoState());
        printState(originator, careTaker);

        System.out.println("\n=== Demo Complete ===");
    }

    /**
     * Prints the current state of the originator and history information.
     *
     * @param originator the originator object
     * @param careTaker  the careTaker managing the history
     */
    private static void printState(Originator originator, CareTaker careTaker) {
        System.out.println("  Article: " + originator.getArticle() +
                " | Position: " + (careTaker.getCurrentIndex() + 1) +
                " / " + careTaker.getHistorySize());
    }
}
