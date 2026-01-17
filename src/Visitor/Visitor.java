package Visitor;

/**
 * Visitor interface for the Visitor design pattern.
 * Defines operations that can be performed on different chess components
 * (Pieces and BoardBlocks) without modifying their classes.
 */
public interface Visitor {

    /**
     * Visits a chess piece.
     *
     * @param piece the chess piece to visit
     */
    void visitPiece(Piece piece);

    /**
     * Visits a board block.
     *
     * @param boardBlock the board block to visit
     */
    void visitBlock(BoardBlock boardBlock);
}
