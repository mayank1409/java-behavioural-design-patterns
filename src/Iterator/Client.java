package Iterator;

/**
 * Client demonstrates the Iterator design pattern.
 * It creates collections of different types and iterates through them
 * using the custom Iterator implementation.
 */
public class Client {

    /**
     * Main entry point for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Iterator Pattern Demo ===\n");

        // Demo 1: String collection
        demonstrateStringCollection();

        System.out.println();

        // Demo 2: Integer collection
        demonstrateIntegerCollection();

        System.out.println();

        // Demo 3: Reset and re-iterate
        demonstrateResetFunctionality();
    }

    /**
     * Demonstrates iteration over a String collection.
     */
    private static void demonstrateStringCollection() {
        System.out.println("--- String Collection ---");
        IterableCollection<String> collection = new CustomIterableCollection<>();
        collection.addToCollection("Hello");
        collection.addToCollection("Behavioural");
        collection.addToCollection("World");

        System.out.println("Collection size: " + collection.size());
        System.out.print("Elements: ");

        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasMore()) {
            System.out.print(iterator.getNext() + " ");
        }
        System.out.println();
    }

    /**
     * Demonstrates iteration over an Integer collection.
     */
    private static void demonstrateIntegerCollection() {
        System.out.println("--- Integer Collection ---");
        IterableCollection<Integer> collection = new CustomIterableCollection<>();
        collection.addToCollection(1);
        collection.addToCollection(11);
        collection.addToCollection(111);

        System.out.println("Collection size: " + collection.size());
        System.out.print("Elements: ");

        Iterator<Integer> iterator = collection.createIterator();
        while (iterator.hasMore()) {
            System.out.print(iterator.getNext() + " ");
        }
        System.out.println();
    }

    /**
     * Demonstrates the reset functionality of the iterator.
     */
    private static void demonstrateResetFunctionality() {
        System.out.println("--- Reset Functionality ---");
        IterableCollection<String> collection = new CustomIterableCollection<>();
        collection.addToCollection("First");
        collection.addToCollection("Second");
        collection.addToCollection("Third");

        Iterator<String> iterator = collection.createIterator();

        System.out.print("First iteration: ");
        while (iterator.hasMore()) {
            System.out.print(iterator.getNext() + " ");
        }
        System.out.println();

        // Reset and iterate again
        iterator.reset();
        System.out.print("After reset: ");
        while (iterator.hasMore()) {
            System.out.print(iterator.getNext() + " ");
        }
        System.out.println();
    }
}
