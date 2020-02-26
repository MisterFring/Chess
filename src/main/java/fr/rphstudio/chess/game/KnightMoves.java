package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;
import java.util.List;

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
        knightList.add(pos);
        knightList.add(pos2);
        knightList.add(pos3);
        knightList.add(pos4);
        knightList.add(pos5);
        knightList.add(pos6);
        knightList.add(pos7);
        knightList.add(pos8);

        return knightList;
    }
}
