package Observer;

/**
 * Person is a concrete Observer in the Observer pattern.
 * It receives notifications when the Subject's state changes.
 */
public class Person implements Observer {

    private final String name;

    /**
     * Constructs a Person with a given name.
     *
     * @param name the person's name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Gets the person's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets a unique identifier for this observer (the person's name).
     *
     * @return the person's name as identifier
     */
    @Override
    public String getId() {
        return name;
    }

    /**
     * Called when the Subject notifies this observer of a state change.
     *
     * @param goldenNumber the updated golden number
     */
    @Override
    public void notifyMe(int goldenNumber) {
        System.out.println(name + " received notification. Golden Number: " + goldenNumber);
    }
}
