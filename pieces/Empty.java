package pieces;

public class Empty extends Pieces{
    public Empty(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return "X";
    }
}
