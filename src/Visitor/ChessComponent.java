package Visitor;

public abstract class ChessComponent {
    private final String name;

    public ChessComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void accept(Visitor v);
}
