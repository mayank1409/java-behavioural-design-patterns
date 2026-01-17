package ChainOfResponsibility;

/**
 * Handler for AMBULANCE vehicle validation in the Chain of Responsibility pattern.
 * Performs validation and specific checks required for ambulances.
 */
public class AmbulanceHandler extends AbstractHandler {

    @Override
    public void handle(String incomingSuspect) {
        if ("AMBULANCE".equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            System.out.println("Do exhaustive search");
            System.out.println("Do Minor Interrogation");
            System.out.println("Check Patient");
            return;
        }
        passToNextHandler(incomingSuspect);
    }
}
