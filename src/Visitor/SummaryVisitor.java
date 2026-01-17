package Visitor;

/**
 * SummaryVisitor is a concrete Visitor that collects statistics about chess components.
 * It demonstrates how to add analytical operations to components without modifying them.
 */
public class SummaryVisitor implements Visitor {

    private int pieceCount = 0;
    private int blockCount = 0;
    private int whiteBlockCount = 0;
    private int blackBlockCount = 0;
    private int occupiedBlockCount = 0;

    /**
     * Visits a chess piece and updates piece statistics.
     *
     * @param piece the chess piece to visit
     */
    @Override
    public void visitPiece(Piece piece) {
        pieceCount++;
    }

    /**
     * Visits a board block and updates block statistics.
     *
     * @param boardBlock the board block to visit
     */
    @Override
    public void visitBlock(BoardBlock boardBlock) {
        blockCount++;

        if ("WHITE".equals(boardBlock.getBlockColor())) {
            whiteBlockCount++;
        } else if ("BLACK".equals(boardBlock.getBlockColor())) {
            blackBlockCount++;
        }

        if (boardBlock.hasPiece()) {
            occupiedBlockCount++;
        }
    }

    /**
     * Gets the total number of pieces visited.
     *
     * @return the piece count
     */
    public int getPieceCount() {
        return pieceCount;
    }

    /**
     * Gets the total number of blocks visited.
     *
     * @return the block count
     */
    public int getBlockCount() {
        return blockCount;
    }

    /**
     * Gets the number of white blocks visited.
     *
     * @return the white block count
     */
    public int getWhiteBlockCount() {
        return whiteBlockCount;
    }

    /**
     * Gets the number of black blocks visited.
     *
     * @return the black block count
     */
    public int getBlackBlockCount() {
        return blackBlockCount;
    }

    /**
     * Gets the number of occupied blocks visited.
     *
     * @return the occupied block count
     */
    public int getOccupiedBlockCount() {
        return occupiedBlockCount;
    }

    /**
     * Prints a summary of the visited components.
     */
    public void printSummary() {
        System.out.println("\n=== Summary Statistics ===");
        System.out.println("Total Pieces: " + pieceCount);
        System.out.println("Total Blocks: " + blockCount);
        System.out.println("White Blocks: " + whiteBlockCount);
        System.out.println("Black Blocks: " + blackBlockCount);
        System.out.println("Occupied Blocks: " + occupiedBlockCount);
        System.out.println("Empty Blocks: " + (blockCount - occupiedBlockCount));
    }
}
