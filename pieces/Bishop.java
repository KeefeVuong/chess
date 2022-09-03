package pieces;

public class Bishop extends Pieces{
    public Bishop(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove() {
        return false;
    }

    @Override
    public String toString() {
        return "B";
    }
}
