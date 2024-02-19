package ChainOfResponsibility;

public class MainWithChainOfResponsibility {
    public static void main(String[] args) {
        MainWithChainOfResponsibility demo = new MainWithChainOfResponsibility();
        Handler vehicleHandler = demo.getValidationHandlers();
        String vehicleType = "FIRE_TRUCK";
        vehicleHandler.handle(vehicleType);
    }

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
