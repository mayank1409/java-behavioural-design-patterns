package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * CareTaker class for the Memento design pattern.
 * Manages the history of mementos and provides undo/redo functionality.
 * The CareTaker maintains state history without needing to know the internal structure of mementos.
 */
public class CareTaker {

    private final List<Memento> history;
    private int currentIndex;

    /**
     * Constructs a CareTaker with an empty history.
     */
    public CareTaker() {
        this.history = new ArrayList<>();
        this.currentIndex = -1;
    }

    /**
     * Adds a memento to the history and advances the current index.
     * If the current index is not at the end, removes all forward history (after current position).
     *
     * @param memento the memento to add
     */
    public void addMemento(Memento memento) {
        if (memento == null) {
            System.out.println("Error: Cannot add null memento");
            return;
        }

        // Remove any forward history if we're not at the end
        if (currentIndex < history.size() - 1) {
            history.subList(currentIndex + 1, history.size()).clear();
        }

        history.add(memento);
        currentIndex = history.size() - 1;
        System.out.println("Memento saved. History size: " + history.size());
    }

    /**
     * Retrieves a memento at the specified index.
     *
     * @param index the index of the memento
     * @return the memento at the specified index
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public Memento getMemento(int index) {
        return history.get(index);
    }

    /**
     * Undoes to the previous state.
     *
     * @return the memento to restore, or null if already at the beginning
     */
    public Memento undoState() {
        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("Undo: Moving to state " + (currentIndex + 1));
            return getMemento(currentIndex);
        } else {
            System.out.println("Cannot undo: Already at the beginning of history");
            return currentIndex >= 0 ? getMemento(currentIndex) : null;
        }
    }

    /**
     * Redoes to the next state.
     *
     * @return the memento to restore, or null if already at the end
     */
    public Memento redoState() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            System.out.println("Redo: Moving to state " + (currentIndex + 1));
            return getMemento(currentIndex);
        } else {
            System.out.println("Cannot redo: Already at the end of history");
            return currentIndex < history.size() ? getMemento(currentIndex) : null;
        }
    }

    /**
     * Gets the current index in the history.
     *
     * @return the current index
     */
    public int getCurrentIndex() {
        return currentIndex;
    }

    /**
     * Gets the size of the history.
     *
     * @return the number of mementos in history
     */
    public int getHistorySize() {
        return history.size();
    }

    /**
     * Clears all history.
     */
    public void clearHistory() {
        history.clear();
        currentIndex = -1;
        System.out.println("History cleared");
    }
}
