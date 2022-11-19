package com.sansoft.chessproject.application;

import com.sansoft.chessproject.chess.ChessMatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChessProjectApplication.class, args);

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());

    }

}
