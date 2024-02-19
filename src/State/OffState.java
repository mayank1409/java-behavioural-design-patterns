package State;

public class OffState implements State {
    LightBulb lightBulb;

    public OffState(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void transitionTo(State state) {
        this.lightBulb.setCurrentState(state);
    }

    @Override
    public void displayState() {
        System.out.println("Light Bulb is in Off STATE");
    }
}
