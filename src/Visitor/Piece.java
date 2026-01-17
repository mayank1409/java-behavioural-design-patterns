package Visitor;

/**
 * Piece is a concrete ChessComponent representing a chess piece.
 * It has a name and a color (white or black).
 */
public class Piece extends ChessComponent {

    private final String color;
    private final String type;

    /**
     * Constructs a Piece with a name, type, and color.
     *
     * @param name  the name of the piece (e.g., "Piece 1")
     * @param type  the type of piece (e.g., "Rook", "King", "Pawn")
     * @param color the color of the piece (e.g., "BLACK", "WHITE")
     */
    public Piece(String name, String type, String color) {
        super(name);
        this.type = type;
        this.color = color;
    }

    /**
     * Gets the color of this piece.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the type of this piece.
     *
     * @return the piece type
     */
    public String getType() {
        return type;
    }

    /**
     * Accepts a visitor to perform operations on this piece.
     *
     * @param visitor the visitor to accept
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPiece(this);
    }

    /**
     * Returns a string representation of the piece.
     *
     * @return piece information
     */
    @Override
    public String toString() {
        return type + " (" + color + ")";
    }
}
