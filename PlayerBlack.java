import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;

public class PlayerBlack extends Player{

    public PlayerBlack() {
        super();
        for (int i = 0; i < 8; i++) {
            piecesList.add(new Pawn(i, 1));
        }

        piecesList.add(new Bishop(2, 0));
        piecesList.add(new Bishop(5, 0));

        piecesList.add(new Knight(1, 0));
        piecesList.add(new Knight(6, 0));

        piecesList.add(new Rook(0, 0));
        piecesList.add(new Rook(7, 0));

        piecesList.add(new Queen(3, 0));
        piecesList.add(new King(4, 0));
    }
    
}
