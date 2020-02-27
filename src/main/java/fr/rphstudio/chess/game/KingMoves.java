package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;
import java.util.List;

public class KingMoves implements Movement {
    @Override
    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p, Board b) {
        List<IChess.ChessPosition> kingList = new ArrayList<>();

        IChess.ChessPosition pos = new IChess.ChessPosition(p.x + 1,p.y + 1);
        IChess.ChessPosition pos2 = new IChess.ChessPosition(p.x  -1,p.y + -1);
        IChess.ChessPosition pos3 = new IChess.ChessPosition(p.x + 1,p.y - 1);
        IChess.ChessPosition pos4 = new IChess.ChessPosition(p.x - 1,p.y + 1);

        IChess.ChessPosition pos5 = new IChess.ChessPosition(p.x + 1,p.y + 0);
        IChess.ChessPosition pos6 = new IChess.ChessPosition(p.x + 0,p.y + 1);
        IChess.ChessPosition pos7 = new IChess.ChessPosition(p.x + 0,p.y - 1);
        IChess.ChessPosition pos8 = new IChess.ChessPosition(p.x - 1,p.y + 0);

        if (Useful.isValidPosition(pos)){
            kingList.add(pos);
        }
        if (Useful.isValidPosition(pos2)){
            kingList.add(pos2);
        }
        if (Useful.isValidPosition(pos3)){
            kingList.add(pos3);
        }
        if (Useful.isValidPosition(pos4)){
            kingList.add(pos4);
        }
        if (Useful.isValidPosition(pos5)){
            kingList.add(pos5);
        }
        if (Useful.isValidPosition(pos6)){
            kingList.add(pos6);
        }
        if (Useful.isValidPosition(pos7)){
            kingList.add(pos7);
        }
        if (Useful.isValidPosition(pos8)){
            kingList.add(pos8);
        }
        return kingList;
    }
}
