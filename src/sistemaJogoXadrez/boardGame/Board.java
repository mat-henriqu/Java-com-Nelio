package sistemaJogoXadrez.boardGame;

import org.jetbrains.annotations.NotNull;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if ((rows < 1) || (columns < 1)) throw new BoardException("Error creating board: " +
                "there must be at least 1 row and 1 column");
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column) {
        if (!positionalExists(row, column)) throw new BoardException("Position not on the board");
        return pieces[row][column];
    }

    public Piece piece(@NotNull Position position) {
        if (!positionalExists(position)) throw new BoardException("Position not on the board");
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(@NotNull Piece piece, @NotNull Position position) {
        if (thereIsAPiece(position)) throw new BoardException
                ("There is already a piece on position" + position);
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position){
        if (!positionalExists(position)) throw new BoardException("Position not on the board");
        if (piece(position)== null) return null;
        Piece aux = piece(position);
        aux.position = null;
        pieces [position.getRow()][position.getColumn()] = null;
        return aux;
    }

    public boolean positionalExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionalExists(@NotNull Position position) {
        return positionalExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if (!positionalExists(position))
            throw new BoardException("Position not on the board");
        return piece(position) != null;
    }
}
