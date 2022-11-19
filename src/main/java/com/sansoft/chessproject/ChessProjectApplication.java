package com.sansoft.chessproject;

import com.sansoft.chessproject.boardgame.Board;
import com.sansoft.chessproject.boardgame.Position;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChessProjectApplication.class, args);

        Board board = new Board(8, 8);

    }

}
