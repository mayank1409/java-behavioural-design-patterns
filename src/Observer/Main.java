package Observer;

public class Main {

    public static void main(String[] args) {
        RadioStation radioSubject = new RadioStation();

        Observer vlad = new Person("vlad");
        Observer john = new Person("john");
        Observer bharath = new Person("bharath");
        Observer ranga = new Person("ranga");

        radioSubject.register(vlad);
        radioSubject.register(john);
        radioSubject.register(bharath);
        radioSubject.register(ranga);

        radioSubject.notifyObservers();

        radioSubject.unregister(bharath);
        radioSubject.unregister(john);

        radioSubject.updateGoldenNumber(10);
    }
}
