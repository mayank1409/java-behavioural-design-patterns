package ChainOfResponsibility;

/**
 * Handler for CIVILIAN_SUV vehicle validation in the Chain of Responsibility pattern.
 * Performs validation and specific checks required for civilian vehicles.
 */
public class CivilianSUVHandler extends AbstractHandler {

    private static final String VEHICLE_TYPE = "CIVILIAN_SUV";

    @Override
    public void handle(String incomingSuspect) {
        if (VEHICLE_TYPE.equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            System.out.println("Do exhaustive search");
            System.out.println("Do Minor Interrogation");
            return;
        }
        passToNextHandler(incomingSuspect);
    }
}
