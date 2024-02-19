package Template;

public class SimpleCheeseCornPizzaMaker extends PizzaMaker {

    @Override
    public void selectBread() {
        System.out.println("STEP 1 - Selecting Bread...");
    }

    @Override
    public void selectIngredients() {
        System.out.println("STEP 2 - Selecting Ingredients...");
    }

    @Override
    public void bakeAtTemp() {
        System.out.println("STEP 5 - Bake At Temp...");
    }

    @Override
    public void addToppings() {
        System.out.println("STEP 3 - Add toppings...");
    }

    @Override
    public void addCheese() {
        System.out.println("STEP 4 - Add cheese...");
    }
}
