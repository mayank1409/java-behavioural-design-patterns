package Visitor;

public class Main {
    public static void main(String[] args) {
        Piece ROOK = new Piece("ROOK", "BLACK");
        BoardBlock boardBlock1 = new BoardBlock("Block", "WHITE", ROOK);
        boardBlock1.accept(new ConsoleVisitor());
    }
}
