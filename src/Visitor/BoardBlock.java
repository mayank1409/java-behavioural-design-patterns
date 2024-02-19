package Visitor;

public class BoardBlock extends ChessComponent{

    private String blockColor;
    private Piece piece;

    public BoardBlock(String name, String blockColor, Piece piece) {
        super(name);
        this.blockColor = blockColor;
        this.piece = piece;
    }

    public String getBlockColor() {
        return blockColor;
    }

    public Piece getPiece() {
        return piece;
    }

    @Override
    public void accept(Visitor v) {
        v.visitBlock(this);
    }
}
