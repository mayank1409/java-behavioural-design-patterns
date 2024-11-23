package Memento;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setArticle("STATE-1");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("STATE-2");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("STATE-3");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("STATE-4");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("STATE-5");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.restore(careTaker.undoState());
        printState(originator);

        originator.restore(careTaker.undoState());
        printState(originator);

        originator.restore(careTaker.undoState());
        printState(originator);

        originator.restore(careTaker.redoState());
        printState(originator);
    }

    public static void printState(Originator o) {
        System.out.println("Current State " + o.getArticle());
    }
}
