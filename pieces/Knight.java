package pieces;
public class Knight extends Pieces{
    
    public Knight(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(Pieces[][] board, int finalX, int finalY) {
        return false;
    }

    @Override
    public String toString() {
        return "H";
    }
}
