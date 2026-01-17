package Visitor;

/**
 * ChessComponent is an abstract base class representing chess board elements.
 * It implements the accept method needed for the Visitor pattern,
 * allowing different operations to be performed on components.
 */
public abstract class ChessComponent {

    private final String name;

    /**
     * Constructs a ChessComponent with a given name.
     *
     * @param name the name of the chess component
     */
    public ChessComponent(String name) {
        this.name = name;
    }

    /**
     * Gets the name of this chess component.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Accepts a visitor to perform operations on this component.
     *
     * @param visitor the visitor to accept
     */
    public abstract void accept(Visitor visitor);
}
