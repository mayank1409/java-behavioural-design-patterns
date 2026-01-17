package ChainOfResponsibility;

/**
 * Demonstration of the Chain of Responsibility design pattern.
 * This class demonstrates how requests are passed through a chain of handlers,
 * each deciding whether to handle the request or pass it to the next handler.
 */
public class MainWithChainOfResponsibility {

    public static void main(String[] args) {
        MainWithChainOfResponsibility demo = new MainWithChainOfResponsibility();
        Handler vehicleHandler = demo.getValidationHandlers();

        // Test different vehicle types
        String[] vehicleTypes = {"CIVILIAN_SUV", "FIRE_TRUCK", "AMBULANCE", "POLICE"};

        for (String vehicleType : vehicleTypes) {
            System.out.println("\n--- Processing: " + vehicleType + " ---");
            try {
                vehicleHandler.handle(vehicleType);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    /**
     * Constructs the chain of handlers for vehicle validation.
     * Chain order: CIVILIAN_SUV -> FIRE_TRUCK -> AMBULANCE -> POLICE
     *
     * @return the first handler in the chain
     */
    public Handler getValidationHandlers() {
        Handler civilianHandler = new CivilianSUVHandler();
        Handler fireTruckHandler = new FireTruckHandler();
        Handler ambulanceHandler = new AmbulanceHandler();
        Handler policeSuvHandler = new PoliceSUVHandler();

        civilianHandler.setNextHandler(fireTruckHandler);
        fireTruckHandler.setNextHandler(ambulanceHandler);
        ambulanceHandler.setNextHandler(policeSuvHandler);
        return civilianHandler;
    }
}
