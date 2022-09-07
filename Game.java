import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
                board[i][j] = new Empty(i, j, "none");
            }
        }
        playerWhite = new PlayerWhite(generatePieces(7, "white"));
        playerBlack = new PlayerBlack(generatePieces(0, "black"));

    }

    public void move(int currX, int currY, int finalX, int finalY) {
        Pieces piece = board[currY][currX];
        if (piece.canMove(board, currX - finalX, currY - finalY)) {
            piece.move(board, finalX, finalY);
            board[finalY][finalX] = board[currY][currX];
            board[currY][currX] = new Empty(currX, currY, "none");
        }
    }

    public void placePiece(Pieces p) {
        board[p.getY()][p.getX()] = p;
    }

    public List<Pieces> generatePieces(int position, String type) {
        List<Pieces> piecesList = new ArrayList<>();

        for (int i =  0; i < 8; i++) {
            if (type.equals("white")) {
                piecesList.add(new Pawn(i, position - 1, type));
                placePiece(new Pawn(i, position - 1, type));
            }
            else {
                piecesList.add(new Pawn(i, position + 1, type));
                placePiece(new Pawn(i, position + 1, type));
            }
        }

        piecesList.add(new Bishop(2,  position, type));
        piecesList.add(new Bishop(5,  position, type));

        placePiece(new Bishop(2,  position, type));
        placePiece(new Bishop(5,  position, type));

        piecesList.add(new Knight(1,  position, type));
        piecesList.add(new Knight(6,  position, type));

        placePiece(new Knight(1,  position, type));
        placePiece(new Knight(6,  position, type));

        piecesList.add(new Rook(0, position, type));
        piecesList.add(new Rook(7,  position, type));

        placePiece(new Rook(0, position, type));
        placePiece(new Rook(7,  position, type));

        piecesList.add(new Queen(3,  position, type));
        piecesList.add(new King(4,  position, type));

        placePiece(new Queen(3,  position, type));
        placePiece(new King(4,  position, type));

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

        Scanner scanner = new Scanner(System.in);
        while (true) {
            newGame.printPieces();

            System.out.print("Enter start position: ");
            String pos1 = scanner.nextLine();
            
            if (pos1.equals("-")) {
                break;
            }
            
            System.out.print("Enter end position: ");
            String pos2 = scanner.nextLine();

            newGame.move(Character.getNumericValue(pos1.charAt(0)), Character.getNumericValue(pos1.charAt(1)), Character.getNumericValue(pos2.charAt(0)), Character.getNumericValue(pos2.charAt(1)));
        }
        scanner.close();
        
        // newGame.printPieces();
        // System.out.println();
        // newGame.move(4, 1, 4, 3);
        // newGame.printPieces();

        // System.out.println();
        // newGame.move(3, 6, 3, 4);
        // newGame.printPieces();

        // System.out.println();
        // newGame.move(3, 4, 4, 3);
        // newGame.printPieces();
    }
}
