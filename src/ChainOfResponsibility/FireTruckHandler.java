package ChainOfResponsibility;

/**
 * Handler for FIRE_TRUCK vehicle validation in the Chain of Responsibility pattern.
 * Performs validation and specific checks required for fire trucks.
 */
public class FireTruckHandler extends AbstractHandler {

    @Override
    public void handle(String incomingSuspect) {
        if ("FIRE_TRUCK".equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            return;
        }
        passToNextHandler(incomingSuspect);
    }
}
