package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.EmptyCellException;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.OutOfBoardException;

import java.util.ArrayList;
import java.util.List;




public class ChessModel implements IChess {

    private static ChessModel Instance = new ChessModel();
    private Board myBoard = new Board();

    private ChessModel(){

        Piece p = new Piece (ChessType.TYP_PAWN, ChessColor.CLR_WHITE);
        //System.out.println( p.getType() );
        //System.out.println( p.getColor() );
    }

    public static ChessModel getInstance(){
        return ChessModel.Instance;

    }


    @Override
    public void reinit() {

    }

    @Override
    public ChessType getPieceType(ChessPosition p) throws EmptyCellException, OutOfBoardException {
    Piece piece1 = myBoard.getPiece(p);

    if (piece1 != null ){
        return piece1.getType();
    }else{
       throw new EmptyCellException();
    }
    }

    @Override
    public ChessColor getPieceColor(ChessPosition p) throws EmptyCellException, OutOfBoardException {
        Piece piece1 = myBoard.getPiece(p);
        if (piece1 != null) {
            return piece1.getColor();
        }
        else {
            throw new EmptyCellException();
        }
    }

    @Override
    public int getNbRemainingPieces(ChessColor color) {
        //ajout des couleurs disponibles pedant les frames.

        System.out.println(ChessColor.CLR_WHITE);
        System.out.println(ChessColor.CLR_BLACK);
        return 0;
    }

    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p) {
        return new ArrayList<ChessPosition>();

    }

    @Override
    public void movePiece(ChessPosition p0, ChessPosition p1) {

    }

    @Override
    public ChessKingState getKingState(ChessColor color) {
        return ChessKingState.KING_SAFE;
    }

    @Override
    public List<ChessType> getRemovedPieces(ChessColor color) {
        return new ArrayList<ChessType>();
    }

    @Override
    public boolean undoLastMove() {
        return false;
    }

    @Override
    public long getPlayerDuration(ChessColor color, boolean isPlaying) {
        return 0;
    }
}
