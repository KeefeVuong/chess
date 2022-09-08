package pieces;

public class Pawn extends Pieces {

    private boolean status;

    public Pawn(int x, int y, String type) {
        super(x, y, type);
        this.status = true;
    }

    @Override
    public boolean canMove(Pieces[][] board, int dX, int dY) {
        if (Math.abs(dX) == Math.abs(dY) && !board[y - dY][x - dX].toString().equals("✕") && !board[y - dY][x - dX].getType().equals(this.type)) {
            return true;
        }
 
        int nextY = y - dY;
        int nextX = x - dX;

        dX = Math.abs(dX);
        dY = Math.abs(dY);
        
        return (dY == 2 && status) || (dY == 1 && board[nextY][nextX].toString().equals("✕")) && (dX == 0);
        
        // if (type.equals("white")) {
        //     if (x + 1 == dX && y - 1 == dY && !board[dY][dX].toString().equals("X")) {
        //         return true;
        //     }

        //     if (x - 1 == dX && y - 1 == dY && !board[dY][dX].toString().equals("X")) {
        //         return true;
        //     }
        // }
        // else {
        //     if (x + 1 == dX && y + 1 == dY && !board[dY][dX].toString().equals("X")) {
        //         return true;
        //     }

        //     if (x - 1 == dX && y + 1 == dY && !board[dY][dX].toString().equals("X")) {
        //         return true;
        //     }
        // }

        // if (this.x != dX) {
        //     return false;
        // }

        // return true;
    }

    @Override
    public void move(Pieces[][] board, int finalX, int finalY) {
        this.x = finalX;
        this.y = finalY;
        this.status = false;
    }

    @Override
    public String toString() {
        if (this.type.equals("white")) {
            return "♙";
        }
        return "♟";
    }
}
