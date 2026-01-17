package ChainOfResponsibility;

/**
 * Handler for FIRE_TRUCK vehicle validation in the Chain of Responsibility pattern.
 * Performs validation and specific checks required for fire trucks.
 */
public class FireTruckHandler extends AbstractHandler {

    private static final String VEHICLE_TYPE = "FIRE_TRUCK";

    @Override
    public void handle(String incomingSuspect) {
        if (VEHICLE_TYPE.equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            return;
        }
        passToNextHandler(incomingSuspect);
    }
}
