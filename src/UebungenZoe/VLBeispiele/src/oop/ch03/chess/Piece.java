package oop.ch03.chess;

public abstract class Piece {
  private Color color;
  private Board board;
  private int row;
  private int col;

  protected Piece(Color color, Board board, int row, int col) {
    if (row < 1 || row > 8 || col < 1 || col > 8)
      throw new IllegalArgumentException("Invalid pos " + row + "/" + col);
    this.color = color;
    this.board = board;
    this.row = row;
    this.col = col;
    board.add(this);
  }

  public Color getColor() {
    return color;
  }

  public Board getBoard() {
    return board;
  }

  public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }

  public abstract char charRep();

  public abstract boolean canCapture(Piece other);
}
