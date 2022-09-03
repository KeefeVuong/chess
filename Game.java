import java.util.ArrayList;
import java.util.List;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Pieces;
import pieces.Queen;
import pieces.Rook;

public class Game {
    
    private PlayerWhite playerWhite;
    private PlayerBlack playerBlack;

    private static Pieces[][] board = new Pieces[8][8];

    public void newGame() {
        playerWhite = new PlayerWhite();
        playerBlack = new PlayerBlack();
    }

    public static void placePiece(Pieces p) {
        board[p.getX()][p.getY()] = p;
    }
}
