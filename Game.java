import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pieces.Bishop;
import pieces.Empty;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Pieces;
import pieces.Queen;
import pieces.Rook;

public class Game {
    
    private PlayerWhite playerWhite;
    private PlayerBlack playerBlack;

    private Pieces[][] board = new Pieces[8][8];

    public void newGame() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Empty(i, j);
            }
        }
        playerWhite = new PlayerWhite(generatePieces(7, "white"));
        playerBlack = new PlayerBlack(generatePieces(0, "black"));

    }

    public void placePiece(Pieces p) {
        board[p.getY()][p.getX()] = p;
    }

    public List<Pieces> generatePieces(int position, String type) {
        List<Pieces> piecesList = new ArrayList<>();

        for (int i =  0; i < 8; i++) {
            if (type.equals("white")) {
                piecesList.add(new Pawn(i, position - 1));
                placePiece(new Pawn(i, position - 1));
            }
            else {
                piecesList.add(new Pawn(i, position + 1));
                placePiece(new Pawn(i, position + 1));
            }
        }

        piecesList.add(new Bishop(2,  position));
        piecesList.add(new Bishop(5,  position));

        placePiece(new Bishop(2,  position));
        placePiece(new Bishop(5,  position));

        piecesList.add(new Knight(1,  position));
        piecesList.add(new Knight(6,  position));

        placePiece(new Knight(1,  position));
        placePiece(new Knight(6,  position));

        piecesList.add(new Rook(0, position));
        piecesList.add(new Rook(7,  position));

        placePiece(new Rook(0, position));
        placePiece(new Rook(7,  position));

        piecesList.add(new Queen(3,  position));
        piecesList.add(new King(4,  position));

        placePiece(new Queen(3,  position));
        placePiece(new King(4,  position));

        return piecesList;
    }

    public void printPieces() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j].toString() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.newGame();
        newGame.printPieces();
    }
}
