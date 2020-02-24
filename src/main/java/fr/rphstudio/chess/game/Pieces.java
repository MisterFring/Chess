package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.*;

public class Pieces {
    // ---------------------------
    // attributes
    // ---------------------------
    private ChessType type;
    private ChessColor color;


    // ---------------------------
    // methods
    //-----------------
    public ChessType getType(){
        return this.type;
    }
    public ChessColor getColor(){
        return this.color;
    }



    // Constructor
    public Pieces(ChessType typ, ChessColor clr){
        this.type = typ;
        this.color = clr;
    }

    public String toString(){
        String s = "";
        s += "Type = "+this.type;
        s += " / Color = "+this.color;
        return s;
    }

}




