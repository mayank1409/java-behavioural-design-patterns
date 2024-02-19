package ChainOfResponsibility;

public class CivilianSUVHandler extends AbstractHandler {

    @Override
    public void handle(String incomingSuspect) {
        if ("CIVILIAN_SUV".equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            System.out.println("Do exhaustive search");
            System.out.println("Do Minor Interrogation");
            return;
        }
        this.nextHandler.handle(incomingSuspect);
    }
}
