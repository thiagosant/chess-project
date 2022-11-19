package com.sansoft.chessproject.chess.pieces;

import com.sansoft.chessproject.boardgame.Board;
import com.sansoft.chessproject.boardgame.Position;
import com.sansoft.chessproject.chess.ChessPiece;
import com.sansoft.chessproject.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K ";
    }
}
