package Visitor;

/**
 * ConsoleVisitor is a concrete Visitor that prints information to the console.
 * It demonstrates how to add display operations to chess components without
 * modifying their classes.
 */
public class ConsoleVisitor implements Visitor {

    /**
     * Visits a chess piece and prints its information.
     *
     * @param piece the chess piece to visit
     */
    @Override
    public void visitPiece(Piece piece) {
        System.out.println("  [Piece] Name: " + piece.getName() + 
                         " | Type: " + piece.getType() + 
                         " | Color: " + piece.getColor());
    }

    /**
     * Visits a board block and prints its information.
     *
     * @param boardBlock the board block to visit
     */
    @Override
    public void visitBlock(BoardBlock boardBlock) {
        System.out.println("  [Block] Position: " + boardBlock.getName() + 
                         " | Color: " + boardBlock.getBlockColor() + 
                         " | Contains: " + 
                         (boardBlock.hasPiece() ? 
                          boardBlock.getPiece().getType() + " (" + boardBlock.getPiece().getColor() + ")" :
                          "Empty"));
    }
}
