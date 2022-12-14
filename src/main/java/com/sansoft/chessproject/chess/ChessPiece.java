package com.sansoft.chessproject.chess;

import com.sansoft.chessproject.boardgame.Board;
import com.sansoft.chessproject.boardgame.Piece;
import com.sansoft.chessproject.boardgame.Position;
import lombok.Getter;

public abstract class ChessPiece extends Piece {

    @Getter private Color color;
    @Getter private int moveCount;


    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public void increaseMoveCount(){
        moveCount++;
    }
    public void decreaseMoveCount(){
        moveCount++;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }


}
