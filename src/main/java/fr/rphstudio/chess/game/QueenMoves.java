package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;
import java.util.List;

public class QueenMoves implements Movement {
    @Override
    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p, Board b) {
        List<IChess.ChessPosition> queenList = new ArrayList<>();

        IChess.ChessPosition pos = new IChess.ChessPosition(7,7);
        queenList.add(pos);

        return queenList;
    }
}
