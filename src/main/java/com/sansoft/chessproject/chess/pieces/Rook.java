package com.sansoft.chessproject.chess.pieces;

import com.sansoft.chessproject.boardgame.Board;
import com.sansoft.chessproject.chess.ChessPiece;
import com.sansoft.chessproject.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R ";
    }
}
