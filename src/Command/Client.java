package Command;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private Invoker invoker;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    private void run() {
        List<Command> commands = new ArrayList<>();

        // Using Command Pattern
        Receiver receiver1 = new Light("Flash Light");
        Command command1 = new TurnOnCommand(receiver1);
        commands.add(command1);

        invoker = new Invoker(command1);
        invoker.executeCommand();
        invoker.undoCommand();

        Receiver receiver2 = new Motor("Motor");
        Command command2 = new TurnOnCommand(receiver2);
        commands.add(command2);

        invoker = new Invoker(command2);
        invoker.executeCommand();
        invoker.undoCommand();
    }
}
