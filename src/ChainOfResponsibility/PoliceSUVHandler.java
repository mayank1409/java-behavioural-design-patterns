package ChainOfResponsibility;

/**
 * Handler for POLICE vehicle validation in the Chain of Responsibility pattern.
 * This is the final handler in the chain and performs validation for police vehicles.
 * If the vehicle type is not recognized, it throws an exception.
 */
public class PoliceSUVHandler extends AbstractHandler {

    private static final String VEHICLE_TYPE = "POLICE";

    @Override
    public void handle(String incomingSuspect) {
        if (VEHICLE_TYPE.equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            System.out.println("Give Access");
            return;
        }
        passToNextHandler(incomingSuspect);
    }
}
