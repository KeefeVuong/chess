package pieces;
public class Queen extends Pieces{
    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(Pieces[][] board, int finalX, int finalY) {
        return false;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
