package ChainOfResponsibility;

public class FireTruckHandler extends AbstractHandler {

    @Override
    public void handle(String incomingSuspect) {
        if ("FIRE_TRUCK".equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            return;
        }
        this.nextHandler.handle(incomingSuspect);
    }
}
