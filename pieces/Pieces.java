package pieces;

public abstract class Pieces {
    protected int x;
    protected int y;
    protected String type;

    public Pieces(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public String getType() {
        return type;
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

    public abstract boolean canMove(Pieces[][] board, int dX, int dY);
}
