package com.sansoft.chessproject.chess;

import com.sansoft.chessproject.boardgame.Board;
import com.sansoft.chessproject.boardgame.Piece;
import com.sansoft.chessproject.boardgame.Position;
import lombok.Getter;

public class ChessPiece extends Piece {

    @Getter
    private Color color;


    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
