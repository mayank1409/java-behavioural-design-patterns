package State;

public class Main {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        lightBulb.displayState();
        lightBulb.toggle();
        lightBulb.displayState();
    }
}
