package pieces;
public class King extends Pieces{
    public King(int x, int y, String type) {
        super(x, y, type);
    }
    @Override
    public boolean canMove(Pieces[][] board, int finalX, int finalY) {
        if (Math.abs(y - finalY) != 1) {
            return false;
        }

        if (!board[finalY][finalX].toString().equals("X") && board[finalY][finalX].getType().equals(this.type)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "K";
    }
}
