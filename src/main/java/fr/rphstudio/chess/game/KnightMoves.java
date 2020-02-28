package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;
import java.util.List;


/**
 * // the KnightMoves class is used for all Knight movements
 */

public class KnightMoves implements Movement {
    @Override
    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p, Board b) {
        List<IChess.ChessPosition> knightList = new ArrayList<>();

        IChess.ChessPosition pos = new IChess.ChessPosition(p.x + 2,p.y + 1);
        IChess.ChessPosition pos8 = new IChess.ChessPosition(p.x + 2,p.y - 1);
        IChess.ChessPosition pos2 = new IChess.ChessPosition(p.x - 2,p.y - 1);
        IChess.ChessPosition pos3 = new IChess.ChessPosition(p.x - 2,p.y + 1);
        IChess.ChessPosition pos4 = new IChess.ChessPosition(p.x + 1,p.y + 2);
        IChess.ChessPosition pos5 = new IChess.ChessPosition(p.x + 1,p.y - 2);
        IChess.ChessPosition pos6 = new IChess.ChessPosition(p.x - 1,p.y + 2);
        IChess.ChessPosition pos7 = new IChess.ChessPosition(p.x - 1,p.y - 2);
        if (Useful.isValidPosition(pos)&&Useful.isEmpty(pos, b)){
            knightList.add(pos);
        }
        if (Useful.isValidPosition(pos8)&&Useful.isEmpty(pos8, b)){
            knightList.add(pos8);
        }
        if (Useful.isValidPosition(pos2)&&Useful.isEmpty(pos2, b)){
            knightList.add(pos2);
        }
        if (Useful.isValidPosition(pos3)&&Useful.isEmpty(pos3, b)){
            knightList.add(pos3);
        }
        if (Useful.isValidPosition(pos4)&&Useful.isEmpty(pos4, b)){
            knightList.add(pos4);
        }
        if (Useful.isValidPosition(pos5)&&Useful.isEmpty(pos5, b)){
            knightList.add(pos5);
        }
        if (Useful.isValidPosition(pos6)&&Useful.isEmpty(pos6, b)){
            knightList.add(pos6);
        }
        if (Useful.isValidPosition(pos7)&&Useful.isEmpty(pos7, b)){
            knightList.add(pos7);
        }
        return knightList;
    }
}
