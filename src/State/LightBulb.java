package State;

/**
 * LightBulb is the context class in the State design pattern.
 * It delegates state-specific behavior to concrete state objects.
 * The light bulb's behavior changes based on its current state (On or Off).
 */
public class LightBulb {

    private State currentState;

    /**
     * Constructs a LightBulb with an initial Off state.
     */
    public LightBulb() {
        this.currentState = new OffState(this);
        System.out.println("LightBulb created in OFF state");
    }

    /**
     * Sets the current state of the light bulb.
     * This method is called by state objects when transitioning to a new state.
     *
     * @param newState the new state to set
     */
    void setCurrentState(State newState) {
        if (newState != null) {
            this.currentState = newState;
        }
    }

    /**
     * Toggles the light bulb between On and Off states.
     * Delegates the toggle behavior to the current state.
     */
    public void toggle() {
        currentState.handleToggle();
    }

    /**
     * Displays the current state of the light bulb.
     */
    public void displayState() {
        currentState.displayState();
    }

    /**
     * Gets the name of the current state.
     *
     * @return the current state name
     */
    public String getCurrentStateName() {
        return currentState.getName();
    }

    /**
     * Returns a string representation of the light bulb.
     *
     * @return state information
     */
    @Override
    public String toString() {
        return "LightBulb{" +
                "currentState=" + currentState.getName() +
                '}';
    }
}
