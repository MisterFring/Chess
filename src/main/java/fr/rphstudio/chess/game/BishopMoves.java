package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.ArrayList;
import java.util.List;

public class BishopMoves implements Movement {
    @Override
    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p, Board b) {
        List<IChess.ChessPosition> bishopList = new ArrayList<>();

        for (int i = 1; i < 8; i++) {
            IChess.ChessPosition pos = new IChess.ChessPosition(p.x + i, p.y + i);
            IChess.ChessPosition pos2 = new IChess.ChessPosition(p.x - i, p.y - i);
            IChess.ChessPosition pos3 = new IChess.ChessPosition(p.x + i, p.y - i);
            IChess.ChessPosition pos4 = new IChess.ChessPosition(p.x - i, p.y + i);
            if (Useful.isValidPosition(pos)){
                bishopList.add(pos);
            }
            if (Useful.isValidPosition(pos2)){
                bishopList.add(pos2);
            }
            if (Useful.isValidPosition(pos3)){
                bishopList.add(pos3);
            }
            if (Useful.isValidPosition(pos4)){
                bishopList.add(pos4);
            }
        }
        return bishopList;
    }
}
