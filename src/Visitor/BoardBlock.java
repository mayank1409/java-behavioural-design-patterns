package Visitor;

/**
 * BoardBlock is a concrete ChessComponent representing a square on a chess board.
 * It has a block color and may contain a chess piece.
 */
public class BoardBlock extends ChessComponent {

    private final String blockColor;
    private final Piece piece;

    /**
     * Constructs a BoardBlock with a name, color, and optional piece.
     *
     * @param name       the name of the block (e.g., "A1", "E4")
     * @param blockColor the color of the block (e.g., "WHITE", "BLACK")
     * @param piece      the piece on this block (can be null if empty)
     */
    public BoardBlock(String name, String blockColor, Piece piece) {
        super(name);
        this.blockColor = blockColor;
        this.piece = piece;
    }

    /**
     * Gets the color of this board block.
     *
     * @return the block color
     */
    public String getBlockColor() {
        return blockColor;
    }

    /**
     * Gets the piece on this board block.
     *
     * @return the piece, or null if the block is empty
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Checks if this board block contains a piece.
     *
     * @return true if the block has a piece, false if empty
     */
    public boolean hasPiece() {
        return piece != null;
    }

    /**
     * Accepts a visitor to perform operations on this block.
     *
     * @param visitor the visitor to accept
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBlock(this);
    }

    /**
     * Returns a string representation of the board block.
     *
     * @return block information
     */
    @Override
    public String toString() {
        return getName() + " (" + blockColor + ")" + 
               (hasPiece() ? " - " + piece : " - Empty");
    }
}
