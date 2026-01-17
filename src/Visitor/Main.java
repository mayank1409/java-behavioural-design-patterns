package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Main demonstrates the Visitor design pattern.
 * Shows how to add new operations to chess components without modifying their classes.
 * Different visitors can perform different operations on the same component structure.
 */
public class Main {

    /**
     * Main entry point for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Visitor Pattern Demo ===\n");

        // Create a small chess board with pieces
        List<ChessComponent> chessBoard = createChessBoard();

        // Demo 1: Console Visitor - Display information
        System.out.println("--- Console Visitor (Display Information) ---");
        ConsoleVisitor consoleVisitor = new ConsoleVisitor();
        for (ChessComponent component : chessBoard) {
            component.accept(consoleVisitor);
        }

        // Demo 2: Summary Visitor - Collect statistics
        System.out.println("\n--- Summary Visitor (Statistics) ---");
        SummaryVisitor summaryVisitor = new SummaryVisitor();
        for (ChessComponent component : chessBoard) {
            component.accept(summaryVisitor);
        }
        summaryVisitor.printSummary();

        System.out.println("\n=== Demo Complete ===");
    }

    /**
     * Creates a mini chess board with pieces for demonstration.
     *
     * @return a list of chess components (pieces and board blocks)
     */
    private static List<ChessComponent> createChessBoard() {
        List<ChessComponent> board = new ArrayList<>();

        // Create some pieces
        Piece whitePawn = new Piece("WP1", "Pawn", "WHITE");
        Piece blackPawn = new Piece("BP1", "Pawn", "BLACK");
        Piece whiteRook = new Piece("WR1", "Rook", "WHITE");
        Piece blackKing = new Piece("BK1", "King", "BLACK");

        // Create board blocks with and without pieces
        board.add(new BoardBlock("A1", "WHITE", whiteRook));
        board.add(new BoardBlock("A2", "BLACK", null));
        board.add(new BoardBlock("B1", "BLACK", blackPawn));
        board.add(new BoardBlock("B2", "WHITE", whitePawn));
        board.add(new BoardBlock("C1", "WHITE", null));
        board.add(new BoardBlock("C2", "BLACK", blackKing));

        // Add standalone pieces
        board.add(whitePawn);
        board.add(blackPawn);

        return board;
    }
}
