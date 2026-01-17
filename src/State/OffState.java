package State;

/**
 * OffState is a concrete State representing the Off state of a LightBulb.
 * When the light is off, toggling transitions it to the On state.
 */
public class OffState implements State {

    private final LightBulb lightBulb;
    private static final String STATE_NAME = "OFF";

    /**
     * Constructs an OffState with a reference to the LightBulb context.
     *
     * @param lightBulb the light bulb context
     */
    public OffState(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    /**
     * Handles the toggle action.
     * Transitions the light bulb from Off state to On state.
     */
    @Override
    public void handleToggle() {
        System.out.println("Toggling light from OFF to ON...");
        lightBulb.setCurrentState(new OnState(lightBulb));
    }

    /**
     * Displays the current state information.
     */
    @Override
    public void displayState() {
        System.out.println("Light Bulb is in OFF state");
    }

    /**
     * Gets the name of this state.
     *
     * @return "OFF"
     */
    @Override
    public String getName() {
        return STATE_NAME;
    }
}
