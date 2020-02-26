package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;
import java.util.List;

public class BishopMoves implements Movement {
    @Override
    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p, Board b) {
        List<IChess.ChessPosition> bishopList = new ArrayList<>();

        IChess.ChessPosition pos = new IChess.ChessPosition(7,7);
        bishopList.add(pos);

        return bishopList;
    }
}
