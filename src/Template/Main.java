package Template;

/**
 * Main demonstrates the Template Method design pattern.
 * Shows how the same algorithm (making pizza) can be implemented differently
 * by different concrete classes, while maintaining a consistent structure.
 */
public class Main {

    /**
     * Main entry point for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Template Method Pattern Demo ===\n");

        // Demo 1: Make Simple Cheese & Corn Pizza
        System.out.println("--- Pizza Recipe 1 ---");
        makePizza(new SimpleCheeseCornPizzaMaker());

        // Demo 2: Make Spicy Pepperoni Pizza
        System.out.println("--- Pizza Recipe 2 ---");
        makePizza(new SpicyPepperoniPizzaMaker());

        System.out.println("=== Demo Complete ===");
    }

    /**
     * Makes a pizza using the given pizza maker.
     * Demonstrates that the same template method is used for different pizzas.
     *
     * @param pizzaMaker the pizza maker to use
     */
    private static void makePizza(PizzaMaker pizzaMaker) {
        System.out.println("Making pizza using: " + pizzaMaker.getClass().getSimpleName());
        pizzaMaker.make();
    }
}
