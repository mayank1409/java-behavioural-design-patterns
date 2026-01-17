package Command;

/**
 * Motor is a concrete Receiver that can be turned on or off.
 */
public class Motor extends Receiver {

    /**
     * Constructs a Motor with a given name.
     *
     * @param name the name of the motor
     */
    public Motor(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println(name + " Motor Turned On");
    }

    @Override
    public void off() {
        System.out.println(name + " Motor Turned Off");
    }
}
