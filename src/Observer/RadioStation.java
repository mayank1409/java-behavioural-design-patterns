package Observer;

import java.util.ArrayList;
import java.util.List;

public class RadioStation implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private int goldenNumber = 2;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> {
            o.notifyMe(goldenNumber);
        });
    }

    public void updateGoldenNumber(int updatedGoldenNumber) {
        this.goldenNumber = updatedGoldenNumber;
        notifyObservers();
    }
}
