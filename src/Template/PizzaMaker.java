package Template;

/**
 * PizzaMaker is an abstract class that defines the Template Method pattern.
 * It defines the skeleton of pizza making algorithm in the make() method,
 * deferring the specific steps to concrete subclasses.
 * This ensures all pizzas are made following the same process.
 */
public abstract class PizzaMaker {

    /**
     * Selects the type of bread for the pizza.
     */
    public abstract void selectBread();

    /**
     * Selects the ingredients for the pizza.
     */
    public abstract void selectIngredients();

    /**
     * Sets the baking temperature and bakes the pizza.
     */
    public abstract void bakeAtTemp();

    /**
     * Adds toppings to the pizza.
     */
    public abstract void addToppings();

    /**
     * Adds cheese to the pizza.
     */
    public abstract void addCheese();

    /**
     * Optional hook method called before making starts.
     * Subclasses can override to perform pre-processing.
     */
    protected void beforeMake() {
        // Default implementation does nothing - subclasses can override
    }

    /**
     * Optional hook method called after making is complete.
     * Subclasses can override to perform post-processing.
     */
    protected void afterMake() {
        // Default implementation does nothing - subclasses can override
    }

    /**
     * Template method that defines the algorithm for making pizza.
     * The order of steps is fixed, but the implementation varies in subclasses.
     */
    public final void make() {
        beforeMake();
        selectBread();
        selectIngredients();
        addToppings();
        addCheese();
        bakeAtTemp();
        afterMake();
    }
}
