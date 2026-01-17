package Template;

/**
 * SimpleCheeseCornPizzaMaker is a concrete implementation of PizzaMaker.
 * It creates a simple cheese and corn pizza by implementing all abstract methods.
 */
public class SimpleCheeseCornPizzaMaker extends PizzaMaker {

    private static final String PIZZA_TYPE = "Simple Cheese & Corn Pizza";

    /**
     * Selects wheat bread for the pizza.
     */
    @Override
    public void selectBread() {
        System.out.println("  Step 1: Selecting thick wheat bread...");
    }

    /**
     * Selects ingredients: corn and mozzarella.
     */
    @Override
    public void selectIngredients() {
        System.out.println("  Step 2: Selecting ingredients (corn, mozzarella)...");
    }

    /**
     * Adds corn toppings to the pizza.
     */
    @Override
    public void addToppings() {
        System.out.println("  Step 3: Adding fresh corn toppings...");
    }

    /**
     * Adds cheese to the pizza.
     */
    @Override
    public void addCheese() {
        System.out.println("  Step 4: Adding mozzarella cheese...");
    }

    /**
     * Bakes the pizza at 450°F.
     */
    @Override
    public void bakeAtTemp() {
        System.out.println("  Step 5: Baking at 450°F for 12 minutes...");
    }

    /**
     * Hook method called before making starts.
     */
    @Override
    protected void beforeMake() {
        System.out.println("Starting preparation for " + PIZZA_TYPE);
    }

    /**
     * Hook method called after making is complete.
     */
    @Override
    protected void afterMake() {
        System.out.println("Finished! " + PIZZA_TYPE + " is ready to serve!\n");
    }
}
