package com.sansoft.chessproject.application;

import com.sansoft.chessproject.chess.ChessMatch;
import com.sansoft.chessproject.chess.ChessPiece;
import com.sansoft.chessproject.chess.ChessPosition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ChessProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChessProjectApplication.class, args);

        Scanner input = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(input);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(input);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }


    }

}
