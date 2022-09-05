package pieces;

public class Empty extends Pieces{
    public Empty(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(Pieces[][] board, int finalX, int finalY) {
        return false;
    }

    @Override
    public String toString() {
        return "X";
    }
}
