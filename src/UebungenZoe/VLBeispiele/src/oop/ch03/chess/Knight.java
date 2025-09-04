package oop.ch03.chess;

import static java.lang.Math.abs;

public class Knight extends Piece {
  public Knight(Color color, Board board, int row, int col) {
    super(color, board, row, col);
  }

  @Override
  public char charRep() {
    return getColor() == Color.white ? 'n' : 'N';
  }

  @Override
  public String toString() {
    return "" + getColor() + " knight at (" + getRow() + ", " + getCol() + ")";
  }

  @Override
  public boolean canCapture(Piece other) {
    if (getBoard() != other.getBoard() || getColor() == other.getColor())
      return false;
    final int dr = abs(getRow() - other.getRow());
    final int dc = abs(getCol() - other.getCol());
    return dr == 2 && dc == 1 || dr == 1 && dc == 2;
  }
}
