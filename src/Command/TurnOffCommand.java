package Command;

/**
 * TurnOffCommand is a concrete Command that encapsulates the action of turning off a receiver.
 * It stores the receiver and delegates the actual work to it.
 */
public class TurnOffCommand implements Command {

    private final Receiver receiver;

    /**
     * Constructs a TurnOffCommand with a given receiver.
     *
     * @param receiver the receiver (Light, Motor, etc.) to turn off
     */
    public TurnOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
