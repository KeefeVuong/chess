package pieces;
public class Queen extends Pieces{
    public Queen(int x, int y, String type) {
        super(x, y, type);
    }

    @Override
    public boolean canMove(Pieces[][] board, int finalX, int finalY) {
        return false;
    }

    @Override
    public String toString() {
        if (this.type.equals("white")) {
            return "♕";
        }
        return "♛";
    }
}
