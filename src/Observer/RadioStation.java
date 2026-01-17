package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * RadioStation is a concrete Subject in the Observer pattern.
 * It maintains a list of observers and notifies them when its state (golden number) changes.
 */
public class RadioStation implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int goldenNumber;

    /**
     * Constructs a RadioStation with an initial golden number.
     *
     * @param initialGoldenNumber the initial golden number
     */
    public RadioStation(int initialGoldenNumber) {
        this.goldenNumber = initialGoldenNumber;
    }

    /**
     * Registers an observer to receive notifications.
     *
     * @param observer the observer to register
     */
    @Override
    public void register(Observer observer) {
        if (observer == null) {
            System.out.println("Error: Cannot register null observer");
            return;
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println("Observer '" + observer.getId() + "' registered. Total observers: " + observers.size());
        } else {
            System.out.println("Observer '" + observer.getId() + "' already registered");
        }
    }

    /**
     * Unregisters an observer from receiving notifications.
     *
     * @param observer the observer to unregister
     */
    @Override
    public void unregister(Observer observer) {
        if (observers.remove(observer)) {
            System.out.println("Observer '" + observer.getId() + "' unregistered. Total observers: " + observers.size());
        } else {
            System.out.println("Observer not found or already unregistered");
        }
    }

    /**
     * Notifies all registered observers of the current state.
     */
    @Override
    public void notifyObservers() {
        if (observers.isEmpty()) {
            System.out.println("No observers to notify");
            return;
        }
        System.out.println("Notifying " + observers.size() + " observer(s)...");
        observers.forEach(observer -> observer.notifyMe(goldenNumber));
    }

    /**
     * Updates the golden number and notifies all observers.
     *
     * @param updatedGoldenNumber the new golden number value
     */
    public void updateGoldenNumber(int updatedGoldenNumber) {
        if (this.goldenNumber != updatedGoldenNumber) {
            System.out.println("\nGolden Number updated: " + this.goldenNumber + " -> " + updatedGoldenNumber);
            this.goldenNumber = updatedGoldenNumber;
            notifyObservers();
        } else {
            System.out.println("Golden Number is already " + updatedGoldenNumber);
        }
    }

    /**
     * Gets the current golden number.
     *
     * @return the golden number
     */
    public int getGoldenNumber() {
        return goldenNumber;
    }

    /**
     * Gets the number of registered observers.
     *
     * @return the count of observers
     */
    public int getObserverCount() {
        return observers.size();
    }
}
