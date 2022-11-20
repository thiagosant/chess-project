package com.sansoft.chessproject.application;

import com.sansoft.chessproject.chess.ChessException;
import com.sansoft.chessproject.chess.ChessMatch;
import com.sansoft.chessproject.chess.ChessPiece;
import com.sansoft.chessproject.chess.ChessPosition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class ChessProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChessProjectApplication.class, args);

        Scanner input = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true){
            try{
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(input);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(input);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }


    }

}
