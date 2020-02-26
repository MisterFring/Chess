package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;
import java.util.List;

public class RookMoves implements Movement {
    @Override
    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p, Board b) {
        List<IChess.ChessPosition> rookList = new ArrayList<>();

        for (int i = 1; i < 8; i++) {
            IChess.ChessPosition pos = new IChess.ChessPosition(p.x + i, p.y + 0);
            IChess.ChessPosition pos2 = new IChess.ChessPosition(p.x - i, p.y - 0);
            IChess.ChessPosition pos3 = new IChess.ChessPosition(p.x + 0, p.y - i);
            IChess.ChessPosition pos4 = new IChess.ChessPosition(p.x - 0, p.y + i);
            rookList.add(pos);
            rookList.add(pos2);
            rookList.add(pos3);
            rookList.add(pos4);

        }


        return rookList;
    }
}