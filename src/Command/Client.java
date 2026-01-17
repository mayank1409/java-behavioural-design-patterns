package Command;

/**
 * Client demonstrates the Command design pattern.
 * It creates receivers, encapsulates their actions as commands,
 * and uses an invoker to execute and undo these commands.
 */
public class Client {

    private final Invoker invoker;

    /**
     * Constructs a Client with a new Invoker.
     */
    public Client() {
        this.invoker = new Invoker();
    }

    /**
     * Main entry point for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    /**
     * Demonstrates the Command pattern with multiple commands.
     */
    private void run() {
        System.out.println("=== Command Pattern Demo ===\n");

        // Create receivers
        Receiver light = new Light("Living Room");
        Receiver motor = new Motor("Pump");

        // Create commands
        Command turnOnLight = new TurnOnCommand(light);
        Command turnOffLight = new TurnOffCommand(light);
        Command turnOnMotor = new TurnOnCommand(motor);
        Command turnOffMotor = new TurnOffCommand(motor);

        // Execute commands using the invoker
        System.out.println("--- Executing Commands ---");
        invoker.setCommand(turnOnLight);
        invoker.executeCommand();

        invoker.setCommand(turnOnMotor);
        invoker.executeCommand();

        invoker.setCommand(turnOffLight);
        invoker.executeCommand();

        invoker.setCommand(turnOffMotor);
        invoker.executeCommand();

        // Demonstrate undo functionality
        System.out.println("\n--- Undoing Last 2 Commands ---");
        invoker.undoCommand();
        invoker.undoCommand();

        System.out.println("\nHistory size: " + invoker.getHistorySize());
    }
}
