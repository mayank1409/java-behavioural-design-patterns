package Visitor;

public class ConsoleVisitor implements Visitor {
    @Override
    public void visitPiece(Piece p) {
        System.out.println("Visiting: " + p.getName() + ". Piece color: " + p.getColor());
    }

    @Override
    public void visitBlock(BoardBlock b) {
        System.out.println("Visiting: " + b.getName() + ". Block Color - " + b.getBlockColor()
                + ". Piece Name - " + b.getPiece().getName() + ", Piece Color - " + b.getPiece().getColor());
    }
}
