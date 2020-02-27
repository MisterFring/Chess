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

        if (Useful.isValidPosition(pos)&&Useful.isEmpty(pos, b)){
            kingList.add(pos);
        }
        if (Useful.isValidPosition(pos2)&&Useful.isEmpty(pos2, b)){
            kingList.add(pos2);
        }
        if (Useful.isValidPosition(pos3)&&Useful.isEmpty(pos3, b)){
            kingList.add(pos3);
        }
        if (Useful.isValidPosition(pos4)&&Useful.isEmpty(pos4, b)){
            kingList.add(pos4);
        }
        if (Useful.isValidPosition(pos5)&&Useful.isEmpty(pos5, b)){
            kingList.add(pos5);
        }
        if (Useful.isValidPosition(pos6)&&Useful.isEmpty(pos6, b)){
            kingList.add(pos6);
        }
        if (Useful.isValidPosition(pos7)&&Useful.isEmpty(pos7, b)){
            kingList.add(pos7);
        }
        if (Useful.isValidPosition(pos8)&&Useful.isEmpty(pos8, b)){
            kingList.add(pos8);
        }
        return kingList;
    }
}
