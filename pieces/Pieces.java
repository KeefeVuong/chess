package pieces;

public abstract class Pieces {
    protected int x;
    protected int y;

    public Pieces(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void move(Pieces[][] board, int finalX, int finalY) {
        this.x = finalX;
        this.y = finalY;
    }

    public abstract String toString();

    public abstract boolean canMove(Pieces[][] board, int finalX, int finalY);
}
