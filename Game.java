import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
    private Map<String, Integer> convertLetter = new HashMap<>();

    public void newGame() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Empty(i, j, "none");
            }
        }
        convertLetter.put("a", 0);
        convertLetter.put("b", 1);
        convertLetter.put("c", 2);
        convertLetter.put("d", 3);
        convertLetter.put("e", 4);
        convertLetter.put("f", 5);
        convertLetter.put("g", 6);
        convertLetter.put("h", 7);
        playerWhite = new PlayerWhite(generatePieces(7, "white"));
        playerBlack = new PlayerBlack(generatePieces(0, "black"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=======================");
            printPieces();
            System.out.println("=======================");
            
            System.out.print("Enter start position: ");
            String pos1 = scanner.nextLine();
            
            if (pos1.equals("-")) {
                break;
            }
            
            System.out.print("Enter end position: ");
            String pos2 = scanner.nextLine();
            
            int pos1X = convertLetter.get(pos1.substring(0, 1));
            int pos1Y = 8 - Character.getNumericValue(pos1.charAt(1));
            
            int pos2X = convertLetter.get(pos2.substring(0, 1));
            int pos2Y = 8 - Character.getNumericValue(pos2.charAt(1));

            move(pos1X, pos1Y, pos2X, pos2Y);
        }
        scanner.close();

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
                if (j == 0) {
                    System.out.print(8 - i + " ");
                    System.out.print("| ");
                }
                System.out.print(board[i][j].toString() + " ");
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < 17; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.print("    ");
        Set<String> letters = convertLetter.keySet();
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();
    
    }
    
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.newGame();
        
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
