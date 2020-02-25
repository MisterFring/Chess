package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.*;

import java.util.List;

public class Board {
    private Piece[][] grid;

    public Board (){
    grid =  new Piece[8][8];
    //TOUR BLCK
    grid [0][0] = new Piece(ChessType.TYP_ROOK, ChessColor.CLR_BLACK);
    grid [7][0] = new Piece(ChessType.TYP_ROOK, ChessColor.CLR_BLACK);
    //TOUR WHTE
    grid [0][7] = new Piece(ChessType.TYP_ROOK, ChessColor.CLR_WHITE);
    grid [7][7] = new Piece(ChessType.TYP_ROOK, ChessColor.CLR_WHITE);


    //CHEVALIER BLCK
    grid [1][0] = new Piece(ChessType.TYP_KNIGHT, ChessColor.CLR_BLACK);
    grid [6][0] = new Piece(ChessType.TYP_KNIGHT, ChessColor.CLR_BLACK);

    // CHEVALIER WHTE
    grid [1][7] = new Piece(ChessType.TYP_KNIGHT, ChessColor.CLR_WHITE);
    grid [6][7] = new Piece(ChessType.TYP_KNIGHT, ChessColor.CLR_WHITE);

    //FOU BLCK
    grid [2][0] = new Piece(ChessType.TYP_BISHOP, ChessColor.CLR_BLACK);
    grid [5][0] = new Piece(ChessType.TYP_BISHOP, ChessColor.CLR_BLACK);

    // FOU WHTE
    grid [2][7] = new Piece(ChessType.TYP_BISHOP, ChessColor.CLR_WHITE);
    grid [5][7] = new Piece(ChessType.TYP_BISHOP, ChessColor.CLR_WHITE);

    // ROI ET QUEEN BLCK
    grid [3][0] = new Piece(ChessType.TYP_KING, ChessColor.CLR_BLACK);
    grid [4][0] = new Piece(ChessType.TYP_QUEEN, ChessColor.CLR_BLACK);

    // ROI ET QUEEN WHTE
    grid [3][7] = new Piece(ChessType.TYP_KING, ChessColor.CLR_WHITE);
    grid [4][7] = new Piece(ChessType.TYP_QUEEN, ChessColor.CLR_WHITE);

    for (int i = 0; i < 8; i = i + 1) {
        grid [i][1] = new Piece(ChessType.TYP_PAWN, ChessColor.CLR_BLACK);
        grid [i][6] = new Piece(ChessType.TYP_PAWN, ChessColor.CLR_WHITE);
    }


    }

    // 1 CONSTRUCTEUR (remplir)
    // 2 PUBLIC BOARD
    // 3 chestmodel créer un attribue de type board (new)
    // 4 interoger couleur et type

    public Piece getPiece (ChessPosition position){
       return grid [position.x][position.y];

    }




}
