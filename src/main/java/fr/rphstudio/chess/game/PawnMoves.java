package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.*;

import java.util.ArrayList;
import java.util.List;

public class PawnMoves implements Movement {

    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p, Board b) {
        System.out.println("This is pawn test");
        List<ChessPosition> testlist = new ArrayList<>();

        ChessPosition pos = new ChessPosition(p.x + 0,p.y + 1);
        ChessPosition pos2 = new ChessPosition(p.x + 0,p.y + 2);
        ChessPosition pos3 = new ChessPosition(p.x + 0,p.y - 1);
        ChessPosition pos4 = new ChessPosition(p.x + 0,p.y - 2);

        testlist.add(pos);
        testlist.add(pos2);
        testlist.add(pos3);
        testlist.add(pos4);

        return testlist;
    }
}
