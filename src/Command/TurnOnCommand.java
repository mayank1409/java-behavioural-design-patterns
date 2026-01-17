package Command;

/**
 * TurnOnCommand is a concrete Command that encapsulates the action of turning on a receiver.
 * It stores the receiver and delegates the actual work to it.
 */
public class TurnOnCommand implements Command {

    private final Receiver receiver;

    /**
     * Constructs a TurnOnCommand with a given receiver.
     *
     * @param receiver the receiver (Light, Motor, etc.) to turn on
     */
    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
