package ChainOfResponsibility;

public class AmbulanceHandler extends AbstractHandler{

    @Override
    public void handle(String incomingSuspect) {
        if ("AMBULANCE".equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            System.out.println("Do exhaustive search");
            System.out.println("Do Minor Interrogation");
            System.out.println("Check Patient");
            return;
        }
        this.nextHandler.handle(incomingSuspect);
    }
}
