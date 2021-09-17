package model.pieces;// TODO check if king doesn't put himself in danger

import model.Board;

/**
 * King piece
 */
public class KingPiece extends ChessPiece {

    public KingPiece(boolean white, Board board, int index_x, int index_y) {
        super(white, index_x, index_y);
    }

    public char getPieceChar() {
        if (this.isWhite)
            return 'K';
        else
            return 'k';
    }

    public boolean[][] validMoves() {

        boolean[][] valid_moves = new boolean[8][8];

        valid_moves[2][0] = true;
        /*
        for(int i = -1; i<= 1; i++) {
            for(int j = -1; j<=1; j++) {

                if(!(i==0 && j==0)) {
                    if((0 <= (this.index_h+i)) && ((this.index_h+i) < Board.BOARDSIZE)) {
                        if((0 <= (this.index_v+i)) && ((this.index_v+i) < Board.BOARDSIZE)) {
                            valid_moves[this.index_h + i][this.index_v + j] = true;
                        }
                    }
                }
            }
        }

         */
        return valid_moves;
    }
}