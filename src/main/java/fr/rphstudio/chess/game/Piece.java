package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.*;

import java.util.List;

public class Piece {
    // ---------------------------
    // attributes
    // ---------------------------
    private ChessType type;
    private ChessColor color;
    private Movement imove;


    // ---------------------------
    // methods
    //-----------------
    public ChessType getType(){
        return this.type;
    }
    public ChessColor getColor(){
        return this.color;
    }
    public List<ChessPosition> getPieceMoves(ChessPosition p, Board brd) {
        return this.imove.getPieceMoves(p, brd);
    }



    // Constructor
    public Piece(ChessType typ, ChessColor clr, Movement myMovementType){
        this.type = typ;
        this.color = clr;
        this.imove = myMovementType;
    }

    public String toString(){
        String s = "";
        s += "Type = "+this.type;
        s += " / Color = "+this.color;
        return s;
    }



}





