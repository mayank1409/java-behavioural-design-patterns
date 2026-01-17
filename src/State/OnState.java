package State;

/**
 * OnState is a concrete State representing the On state of a LightBulb.
 * When the light is on, toggling transitions it to the Off state.
 */
public class OnState implements State {

    private final LightBulb lightBulb;
    private static final String STATE_NAME = "ON";

    /**
     * Constructs an OnState with a reference to the LightBulb context.
     *
     * @param lightBulb the light bulb context
     */
    public OnState(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    /**
     * Handles the toggle action.
     * Transitions the light bulb from On state to Off state.
     */
    @Override
    public void handleToggle() {
        System.out.println("Toggling light from ON to OFF...");
        lightBulb.setCurrentState(new OffState(lightBulb));
    }

    /**
     * Displays the current state information.
     */
    @Override
    public void displayState() {
        System.out.println("Light Bulb is in ON state");
    }

    /**
     * Gets the name of this state.
     *
     * @return "ON"
     */
    @Override
    public String getName() {
        return STATE_NAME;
    }
}
