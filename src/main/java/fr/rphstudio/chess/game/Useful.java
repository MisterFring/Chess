package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.*;

/**
 * the useful class is used to contain methods used throughout the game
 *
 */

public class Useful {
    public static boolean isValidPosition(ChessPosition p) {
        if (p.x < 0 || p.x > 7 || p.y < 0 || p.y > 7){
            return false;
        }

        return true;
    }

    public static boolean isEmpty(ChessPosition p, Board b){
        Piece p1;
        ChessPosition pos = new ChessPosition(p.x,p.y);
        p1 = Board.getPiece(pos);
        if (p1  == null){
            return true;
        }
        return false;
    }

/*    public static boolean isEnemy(ChessPosition p, Board b){
        Piece p1;
        ChessPosition pos = new ChessPosition(p.x,p.y);
        p1 = Board.getPiece(pos);
        if (p1 != null){
            ChessColor clr = p1.getColor();
            if (clr == ChessColor.CLR_WHITE){
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isEmptyOrEnemy(ChessPosition p, Board b){
        if (isEnemy(p,b)||isEmpty(p,b)==true){
            return true;
        }
        return false;
    }
*/
}
