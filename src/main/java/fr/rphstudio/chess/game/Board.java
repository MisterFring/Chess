package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.*;

public class Board {
    private Piece[][] grid;

    public Board (){
    grid =  new Piece[8][8];
    //TOUR BLCK
    grid [0][0] = new Piece(ChessType.TYP_ROOK, ChessColor.CLR_BLACK, new RookMoves() );
    grid [7][0] = new Piece(ChessType.TYP_ROOK, ChessColor.CLR_BLACK, new RookMoves() );
    //TOUR WHTE
    grid [0][7] = new Piece(ChessType.TYP_ROOK, ChessColor.CLR_WHITE, new RookMoves() );
    grid [7][7] = new Piece(ChessType.TYP_ROOK, ChessColor.CLR_WHITE, new RookMoves() );


    //CHEVALIER BLCK
    grid [1][0] = new Piece(ChessType.TYP_KNIGHT, ChessColor.CLR_BLACK, new KnightMoves() );
    grid [6][0] = new Piece(ChessType.TYP_KNIGHT, ChessColor.CLR_BLACK, new KnightMoves() );

    // CHEVALIER WHTE
    grid [1][7] = new Piece(ChessType.TYP_KNIGHT, ChessColor.CLR_WHITE, new KnightMoves() );
    grid [6][7] = new Piece(ChessType.TYP_KNIGHT, ChessColor.CLR_WHITE, new KnightMoves() );

    //FOU BLCK
    grid [2][0] = new Piece(ChessType.TYP_BISHOP, ChessColor.CLR_BLACK, new BishopMoves() );
    grid [5][0] = new Piece(ChessType.TYP_BISHOP, ChessColor.CLR_BLACK, new BishopMoves() );

    // FOU WHTE
    grid [2][7] = new Piece(ChessType.TYP_BISHOP, ChessColor.CLR_WHITE, new BishopMoves() );
    grid [5][7] = new Piece(ChessType.TYP_BISHOP, ChessColor.CLR_WHITE, new BishopMoves() );

    // ROI ET QUEEN BLCK
    grid [3][0] = new Piece(ChessType.TYP_KING, ChessColor.CLR_BLACK, new KingMoves() );
    grid [4][0] = new Piece(ChessType.TYP_QUEEN, ChessColor.CLR_BLACK, new QueenMoves() );

    // ROI ET QUEEN WHTE
    grid [3][7] = new Piece(ChessType.TYP_KING, ChessColor.CLR_WHITE, new KingMoves() );
    grid [4][7] = new Piece(ChessType.TYP_QUEEN, ChessColor.CLR_WHITE, new QueenMoves() );

    for (int i = 0; i < 8; i = i + 1) {
        grid [i][1] = new Piece(ChessType.TYP_PAWN, ChessColor.CLR_BLACK, new PawnMoves() );
        grid [i][6] = new Piece(ChessType.TYP_PAWN, ChessColor.CLR_WHITE, new PawnMoves() );
    }


    }

    // 1 CONSTRUCTEUR (remplir)
    // 2 PUBLIC BOARD
    // 3 chestmodel créer un attribue de type board (new)
    // 4 interoger couleur et type

    public Piece getPiece (ChessPosition position){
       return grid [position.x][position.y];
    }

    public int nbPieces(ChessColor color) {
        int nbPieces = 0;
        Piece p1;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                ChessPosition posTmp = new ChessPosition(x,y);
                p1 = getPiece(posTmp);
                if (p1 != null) {
                    if (p1.getColor() == color) {
                        nbPieces++;
                    }
                }
            }
        }
        // if is valid position
        return nbPieces;
        // else return null 
    }

    public void move(ChessPosition p0, ChessPosition p1) {
        grid [p1.x][p1.y] = grid [p0.x][p0.y];
        grid [p0.x][p0.y] = null;





    }
}
