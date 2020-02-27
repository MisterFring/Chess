package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.*;

import java.util.ArrayList;
import java.util.List;

public class PawnMoves implements Movement {

    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p, Board b) {
        List<ChessPosition> pawnList = new ArrayList<>();

        ChessPosition pos = new ChessPosition(p.x + 0,p.y + 1);
        ChessPosition pos2 = new ChessPosition(p.x + 0,p.y + 2);
        ChessPosition pos3 = new ChessPosition(p.x + 0,p.y - 1);
        ChessPosition pos4 = new ChessPosition(p.x + 0,p.y - 2);

        if (Useful.isValidPosition(pos)){
            pawnList.add(pos);
        }
        if (Useful.isValidPosition(pos2)){
            pawnList.add(pos2);
        }
        if (Useful.isValidPosition(pos3)){
            pawnList.add(pos3);
        }
        if (Useful.isValidPosition(pos4)){
            pawnList.add(pos4);
        }
        return pawnList;
    }
}
