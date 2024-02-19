package Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> history;
    private int currState = -1;

    public CareTaker() {
        this.history = new ArrayList<>();
    }

    public void addMemento(Memento m) {
        history.add(m);
        currState = history.size() - 1;
    }

    public Memento getMemento(int index) {
        return history.get(index);
    }

    public Memento undoState() {
        System.out.println("Undoing state...");
        if (currState <= 0) {
            currState = 0;
            return getMemento(currState);
        }
        currState--;
        return getMemento(currState);
    }

    public Memento redoState() {
        System.out.println("Redoing state...");
        if (currState >= history.size() - 1) {
            currState = history.size() - 1;
            return getMemento(currState);
        }
        currState++;
        return getMemento(currState);
    }
}
