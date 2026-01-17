package Template;

/**
 * SpicyPepperoniPizzaMaker is a concrete implementation of PizzaMaker.
 * It creates a spicy pepperoni pizza with a different recipe and baking temperature.
 */
public class SpicyPepperoniPizzaMaker extends PizzaMaker {

    private static final String PIZZA_TYPE = "Spicy Pepperoni Pizza";

    /**
     * Selects thin Italian crust for the pizza.
     */
    @Override
    public void selectBread() {
        System.out.println("  Step 1: Selecting thin Italian crust...");
    }

    /**
     * Selects ingredients: pepperoni, jalapeños, and mozzarella.
     */
    @Override
    public void selectIngredients() {
        System.out.println("  Step 2: Selecting ingredients (pepperoni, jalapeños, mozzarella)...");
    }

    /**
     * Adds pepperoni and jalapeño toppings to the pizza.
     */
    @Override
    public void addToppings() {
        System.out.println("  Step 3: Adding sliced pepperoni and jalapeños...");
    }

    /**
     * Adds extra cheese to the pizza.
     */
    @Override
    public void addCheese() {
        System.out.println("  Step 4: Adding extra mozzarella cheese...");
    }

    /**
     * Bakes the pizza at 475°F (hotter than standard).
     */
    @Override
    public void bakeAtTemp() {
        System.out.println("  Step 5: Baking at 475°F for 10 minutes...");
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
        System.out.println("Finished! " + PIZZA_TYPE + " is ready to serve! (Spicy!)\n");
    }
}
