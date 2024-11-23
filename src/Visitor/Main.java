package Visitor;

public class Main {

    public static void main(String[] args) {
        Piece rook = new Piece("rook", "BLACK");
        BoardBlock boardBlock1 = new BoardBlock("Block", "WHITE", rook);
        boardBlock1.accept(new ConsoleVisitor());
        rook.accept(new ConsoleVisitor());
    }
}
