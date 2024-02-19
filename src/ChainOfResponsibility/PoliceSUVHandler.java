package ChainOfResponsibility;

public class PoliceSUVHandler extends AbstractHandler {

    @Override
    public void handle(String incomingSuspect) {
        if ("POLICE".equals(incomingSuspect)) {
            System.out.println("Validate ID for " + incomingSuspect);
            System.out.println("Give Access");
            return;
        }
        throw new IllegalArgumentException("Vehicle of type " + incomingSuspect);
    }
}
