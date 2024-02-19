package State;

public class OnState implements State {

    LightBulb lightBulb;

    public OnState(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void transitionTo(State state) {
        this.lightBulb.setCurrentState(state);
    }

    @Override
    public void displayState() {
        System.out.println("Light Bulb is in On STATE");
    }
}
