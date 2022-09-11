package pieces;
public class Rook extends Pieces{
    public Rook(int x, int y, String type) {
        super(x, y, type);
    }

    @Override
    public boolean canMove(Pieces[][] board, int dX, int dY) {
        dX = Math.abs(dX);
        dY = Math.abs(dY);
        if (dX == 0 && dY != 0) {
            System.out.println(y);
            System.out.println(dY);
            if (y > dY) { 
                for (int i = y; i > y - dY; i--) {
                    if (!board[Math.abs(i)][this.x].toString().equals("✕") && i != y) {
                        return false;
                    }
                }
            }
            else {
                for (int i = y; i < y + dY; i++) {
                    if (!board[Math.abs(i)][this.x].toString().equals("✕") && i != y) {
                        return false;
                    }
                }
            }
            return true;
        }
        else if (dY == 0 && dX != 0) {
            System.out.println(x);
            System.out.println(dX);
            if (x > dX) {
                for (int i = x; i > x - dX; i--) {
                    System.out.println(board[y][Math.abs(i)].toString());
                    if (!board[y][Math.abs(i)].toString().equals("✕") && i != x) {
                        return false;
                    }
                }  
            }
            else {
                for (int i = x; i < x + dX; i++) {
                    System.out.println(board[y][Math.abs(i)].toString());
                    if (!board[y][Math.abs(i)].toString().equals("✕") && i != x) {
                        return false;
                    }
                }
            }
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        if (this.type.equals("white")) {
            return "♖";
        }
        return "♜";
    }
}
