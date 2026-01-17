package ChainOfResponsibility;

/**
 * Handler for CIVILIAN_SUV vehicle validation in the Chain of Responsibility pattern.
 * Performs validation and specific checks required for civilian vehicles.
 */
public class CivilianSUVHandler extends AbstractHandler {

    @Override
    public void handle(String incomingSuspect) {
        if ("CIVILIAN_SUV".equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            System.out.println("Do exhaustive search");
            System.out.println("Do Minor Interrogation");
            return;
        }
        passToNextHandler(incomingSuspect);
    }
}
