package pieces;
public class King extends Pieces{
    public King(int x, int y) {
        super(x, y);
    }
    @Override
    public boolean canMove(Pieces[][] board, int finalX, int finalY) {
        return false;
    }

    @Override
    public String toString() {
        return "K";
    }
}
