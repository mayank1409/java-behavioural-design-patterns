package Visitor;

public class BoardBlock extends ChessComponent {

    private final String blockColor;
    private final Piece piece;

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
