package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.*;

import java.util.ArrayList;
import java.util.List;

public class PawnMoves implements Movement {

    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p, Board b) {
        System.out.println("This is pawn test");
        List<ChessPosition> testlist = new ArrayList<>();

        ChessPosition pos = new ChessPosition(3,4);
        testlist.add(pos);

        return testlist;
    }
}
