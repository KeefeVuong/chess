package pieces;
public class Rook extends Pieces{
    public Rook(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(Pieces[][] board, int finalX, int finalY) {
        if (this.x != finalX && this.y != finalY) {
            return false;
        }

        if (this.x == finalX) {
            if (y < finalY) {
                for (int i = y + 1; i < finalY; i++) {
                    if (!board[i][this.x].toString().equals("X")) {
                        return false;
                    }
                }
            }
            else {
                for (int i = y - 1; i > finalY; i--) {
                    if (!board[i][this.x].toString().equals("X")) {
                        return false;
                    }
                }
            }
        }

        if (this.y == finalY) {
            if (x < finalX) {
                for (int i = x + 1; i < finalX; i++) {
                    if (!board[this.y][i].toString().equals("X")) {
                        return false;
                    }
                }
            }
            else {
                for (int i = x - 1; i > finalX; i--) {
                    if (!board[this.y][i].toString().equals("X")) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "R";
    }
}
