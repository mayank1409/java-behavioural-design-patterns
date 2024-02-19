package Visitor;

public interface Visitor {
    void visitPiece(Piece p);

    void visitBlock(BoardBlock b);
}
