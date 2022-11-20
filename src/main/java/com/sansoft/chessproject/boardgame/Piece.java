package com.sansoft.chessproject.boardgame;


import lombok.AccessLevel;
import lombok.Getter;

public abstract class Piece {

    protected Position position;
    @Getter(AccessLevel.PROTECTED)
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}