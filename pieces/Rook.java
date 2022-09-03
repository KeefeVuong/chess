package pieces;
public class Rook extends Pieces{
    public Rook(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return "R";
    }
}
