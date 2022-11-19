package com.sansoft.chessproject.boardgame;

import java.io.Serial;

public class BoardException extends RuntimeException{

    @Serial
    private static final long serialLVersionUID = 1L;

    public BoardException(String msg){
        super(msg);
    }
}
