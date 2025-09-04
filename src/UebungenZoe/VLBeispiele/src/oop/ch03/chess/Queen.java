package oop.ch03.chess;

import static java.lang.Integer.signum;
import static java.lang.Math.abs;

public class Queen extends Piece {
  public Queen(Color color, Board board, int row, int col) {
    super(color, board, row, col);
  }

  @Override
  public char charRep() {
    return getColor() == Color.white ? 'q' : 'Q';
  }

  @Override
  public String toString() {
    return "" + getColor() + " queen at (" + getRow() + ", " + getCol() + ")";
  }

  @Override
  public boolean canCapture(Piece other) {
    if (getBoard() != other.getBoard() || getColor() == other.getColor())
      return false;
    if (other.getRow() != getRow() &&
        other.getCol() != getCol() &&
        abs(other.getRow() - getRow()) != abs(other.getCol() - getCol()))
      return false;
    final int dr = signum(other.getRow() - getRow());
    final int dc = signum(other.getCol() - getCol());
    int r = getRow() + dr;
    int c = getCol() + dc;
    while (r != other.getRow() || c != other.getCol()) {
      if (getBoard().pieceAt(r, c) != null) return false;
      r += dr;
      c += dc;
    }
    return true;
  }
}
