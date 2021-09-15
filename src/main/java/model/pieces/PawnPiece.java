package model.pieces;

/**
 * Pawn piece
 */
public class PawnPiece extends ChessPiece {


    @Override
    public boolean[][] validMoves(ChessPiece[][] chessPieces) {
        return new boolean[0][];
    }

    @Override
    public char getPieceChar() {
        return 0;
    }
}
