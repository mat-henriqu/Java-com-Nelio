package sistemaJogoXadrez.chess;

import sistemaJogoXadrez.boardGame.Board;
import sistemaJogoXadrez.boardGame.Piece;
import sistemaJogoXadrez.boardGame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && getColor() != color;
    }

}
