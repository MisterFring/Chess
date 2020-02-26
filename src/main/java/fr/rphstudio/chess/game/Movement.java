package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.List;

public interface Movement {

    public List<IChess.ChessPosition> getPieceMoves(IChess.ChessPosition p, Board b);

}
