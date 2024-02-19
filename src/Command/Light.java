package Command;

public class Light extends Receiver {

    public Light(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Light Turned On");
    }

    @Override
    public void off() {
        System.out.println("Light Turned Off");
    }
}
