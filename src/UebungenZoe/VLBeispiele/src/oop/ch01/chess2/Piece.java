package oop.ch01.chess2;

import static java.lang.Integer.signum;
import static java.lang.Math.abs;

class Piece {
  Kind kind;
  Color color;
  Board board;
  int row;
  int col;

  Piece(Kind kind, Color color, Board board, int row, int col) {
    if (row < 1 || row > 8 || col < 1 || col > 8)
      throw new IllegalArgumentException("Invalid pos " + row + "/" + col);
    this.kind = kind;
    this.color = color;
    this.board = board;
    this.row = row;
    this.col = col;
    board.add(this);
  }

  char charRep() {
    return switch (kind) {
      case queen -> queenCharRep();
      case knight -> knightCharRep();
    };
  }

  public String toString() {
    return switch (kind) {
      case queen -> queenToString();
      case knight -> knightToString();
    };
  }

  boolean canCapture(Piece other) {
    return switch (kind) {
      case queen -> queenCanCapture(other);
      case knight -> knightCanCapture(other);
    };
  }

  char queenCharRep() {
    return color == Color.white ? 'q' : 'Q';
  }

  char knightCharRep() {
    return color == Color.white ? 'n' : 'N';
  }

  String queenToString() {
    return "" + color + " queen at (" + row + ", " + col + ")";
  }

  String knightToString() {
    return "" + color + " knight at (" + row + ", " + col + ")";
  }

  boolean queenCanCapture(Piece other) {
    if (board != other.board || color == other.color)
      return false;
    if (other.row != row &&
        other.col != col &&
        abs(other.row - row) != abs(other.col - col))
      return false;
    final int dr = signum(other.row - row);
    final int dc = signum(other.col - col);
    int r = row + dr;
    int c = col + dc;
    while (r != other.row || c != other.col) {
      if (board.pieceAt(r, c) != null) return false;
      r += dr;
      c += dc;
    }
    return true;
  }

  boolean knightCanCapture(Piece other) {
    if (board != other.board || color == other.color)
      return false;
    final int dr = abs(row - other.row);
    final int dc = abs(col - other.col);
    return dr == 2 && dc == 1 || dr == 1 && dc == 2;
  }
}
