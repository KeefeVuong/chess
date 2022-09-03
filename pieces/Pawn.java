package pieces;

public class Pawn extends Pieces {

    public Pawn(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return "P";
    }
}
