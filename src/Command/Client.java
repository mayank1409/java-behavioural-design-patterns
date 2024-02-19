package Command;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private Invoker invoker;

    private List<Command> commands;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    private void run() {
        // Using Command Pattern
        Receiver receiver1 = new Light("Flash Light");
        Command command1 = new TurnOnCommand(receiver1);

        commands = new ArrayList<>();
        commands.add(command1);

        invoker = new Invoker(command1);
        invoker.executeCommand();

        Receiver receiver2 = new Motor("Motor");
        Command command2 = new TurnOnCommand(receiver2);

        commands.add(command2);

        invoker = new Invoker(command2);
        invoker.executeCommand();

        // Lets UNDO
        commands.forEach(command -> {
            invoker.setCommand(command);
            command.undo();
        });
    }
}
