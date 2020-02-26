package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;
import java.util.List;

public class QueenMoves implements Movement {
    @Override
    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p, Board b) {
        List<IChess.ChessPosition> queenList = new ArrayList<>();

        for (int i = 1; i < 8; i++) {
            IChess.ChessPosition pos = new IChess.ChessPosition(p.x + i, p.y + 0);
            IChess.ChessPosition pos2 = new IChess.ChessPosition(p.x - i, p.y - 0);
            IChess.ChessPosition pos3 = new IChess.ChessPosition(p.x + 0, p.y - i);
            IChess.ChessPosition pos4 = new IChess.ChessPosition(p.x - 0, p.y + i);
            IChess.ChessPosition pos5 = new IChess.ChessPosition(p.x + i, p.y + i);
            IChess.ChessPosition pos6 = new IChess.ChessPosition(p.x - i, p.y - i);
            IChess.ChessPosition pos7 = new IChess.ChessPosition(p.x + i, p.y - i);
            IChess.ChessPosition pos8 = new IChess.ChessPosition(p.x - i, p.y + i);
            queenList.add(pos);
            queenList.add(pos2);
            queenList.add(pos3);
            queenList.add(pos4);
            queenList.add(pos5);
            queenList.add(pos6);
            queenList.add(pos7);
            queenList.add(pos8);

        }

        return queenList;
    }
}
