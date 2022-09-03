import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;

public class PlayerWhite extends Player{

    public PlayerWhite() {
        super();
        for (int i = 0; i < 8; i++) {
            piecesList.add(new Pawn(i, 6));
        }

        piecesList.add(new Bishop(2, 7));
        piecesList.add(new Bishop(5, 7));

        piecesList.add(new Knight(1, 7));
        piecesList.add(new Knight(6, 7));

        piecesList.add(new Rook(0, 7));
        piecesList.add(new Rook(7, 7));

        piecesList.add(new Queen(3, 7));
        piecesList.add(new King(4, 7));
    }
    
}
