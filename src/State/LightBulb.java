package State;

import java.util.HashMap;
import java.util.Map;

public class LightBulb {

    private final Map<State, State> lightBulbStates = new HashMap<>();

    State currentState;

    public LightBulb() {
        State onState = new OnState(this);
        State offState = new OffState(this);

        lightBulbStates.put(onState, offState);
        lightBulbStates.put(offState, onState);

        currentState = offState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void displayState() {
        this.currentState.displayState();
    }

    public void toggle() {
        this.currentState.transitionTo(lightBulbStates.get(currentState));
    }
}
