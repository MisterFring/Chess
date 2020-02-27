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
            if (Useful.isValidPosition(pos)&&Useful.isEmpty(pos, b)){
                rookList.add(pos);
            }
            if (Useful.isValidPosition(pos2)&&Useful.isEmpty(pos2, b)){
                rookList.add(pos2);
            }
            if (Useful.isValidPosition(pos3)&&Useful.isEmpty(pos3, b)){
                rookList.add(pos3);
            }
            if (Useful.isValidPosition(pos4)&&Useful.isEmpty(pos4, b)){
                rookList.add(pos4);
            }
        }


        return rookList;
    }
}
