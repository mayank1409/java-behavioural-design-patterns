package Command;

/**
 * Light is a concrete Receiver that can be turned on or off.
 */
public class Light extends Receiver {

    /**
     * Constructs a Light with a given name.
     *
     * @param name the name of the light
     */
    public Light(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println(name + " Light Turned On");
    }

    @Override
    public void off() {
        System.out.println(name + " Light Turned Off");
    }
}
