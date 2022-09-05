package pieces;

public class Pawn extends Pieces {

    private String type;
    private boolean status;

    public Pawn(int x, int y, String type) {
        super(x, y);
        this.type = type;
        this.status = true;
    }

    @Override
    public boolean canMove(Pieces[][] board, int finalX, int finalY) {
        if (type.equals("white")) {
            if (y - finalY == 2 && status) {
                return true;
            }
            if (y - finalY != 1) {
                return false;
            }

            if (x + 1 == finalX && y - 1 == finalY && !board[finalY][finalX].toString().equals("X")) {
                return true;
            }

            if (x - 1 == finalX && y - 1 == finalY && !board[finalY][finalX].toString().equals("X")) {
                return true;
            }
        }
        else {
            if (finalY - y == 2 && status) {
                return true;
            }
            if (finalY - y != 1) {
                return false;
            }

            if (x + 1 == finalX && y + 1 == finalY && !board[finalY][finalX].toString().equals("X")) {
                return true;
            }

            if (x - 1 == finalX && y + 1 == finalY && !board[finalY][finalX].toString().equals("X")) {
                return true;
            }
        }

        if (this.x != finalX) {
            return false;
        }

        return true;
    }

    @Override
    public void move(Pieces[][] board, int finalX, int finalY) {
        this.x = finalX;
        this.y = finalY;
        this.status = false;
    }

    @Override
    public String toString() {
        return "P";
    }
}
