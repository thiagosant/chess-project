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

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //UP
        p.setValues(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Down
        p.setValues(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Left
        p.setValues(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Right
        p.setValues(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Northwest
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Northeast
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //South-west
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Southeast
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
