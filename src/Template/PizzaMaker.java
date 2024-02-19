package Template;

public abstract class PizzaMaker {

    public abstract void selectBread();

    public abstract void selectIngredients();

    public abstract void bakeAtTemp();

    public abstract void addToppings();

    public abstract void addCheese();

    public void make() {
        selectBread();
        selectIngredients();
        addToppings();
        addCheese();
        bakeAtTemp();
    }
}
