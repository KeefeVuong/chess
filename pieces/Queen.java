package pieces;
public class Queen extends Pieces{
    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
