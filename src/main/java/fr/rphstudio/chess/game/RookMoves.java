package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;
import java.util.List;

public class RookMoves implements Movement {
    @Override
    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p, Board b) {
        List<IChess.ChessPosition> rookList = new ArrayList<>();

        IChess.ChessPosition pos = new IChess.ChessPosition(p.x + 7,p.y + 0);
        IChess.ChessPosition pos2 = new IChess.ChessPosition(p.x + 6,p.y + 0);
        IChess.ChessPosition pos3 = new IChess.ChessPosition(p.x + 5,p.y + 0);
        IChess.ChessPosition pos4 = new IChess.ChessPosition(p.x + 4,p.y + 0);
        IChess.ChessPosition pos5 = new IChess.ChessPosition(p.x + 3,p.y + 0);
        IChess.ChessPosition pos6 = new IChess.ChessPosition(p.x + 2,p.y + 0);
        IChess.ChessPosition pos7 = new IChess.ChessPosition(p.x + 1,p.y + 0);

        IChess.ChessPosition pos10 = new IChess.ChessPosition(p.x + 0,p.y + 1);
        IChess.ChessPosition pos12 = new IChess.ChessPosition(p.x + 0,p.y + 2);
        IChess.ChessPosition pos13 = new IChess.ChessPosition(p.x + 0,p.y + 3);
        IChess.ChessPosition pos14 = new IChess.ChessPosition(p.x + 0,p.y + 4);
        IChess.ChessPosition pos15 = new IChess.ChessPosition(p.x + 0,p.y + 5);
        IChess.ChessPosition pos16 = new IChess.ChessPosition(p.x + 0,p.y + 6);
        IChess.ChessPosition pos17 = new IChess.ChessPosition(p.x + 0,p.y + 7);

        rookList.add(pos);
        rookList.add(pos2);
        rookList.add(pos3);rookList.add(pos4);rookList.add(pos5);rookList.add(pos6);rookList.add(pos7);
        rookList.add(pos10);
        rookList.add(pos12);
        rookList.add(pos13);rookList.add(pos14);rookList.add(pos15);rookList.add(pos16);rookList.add(pos17);

        return rookList;
    }
}
