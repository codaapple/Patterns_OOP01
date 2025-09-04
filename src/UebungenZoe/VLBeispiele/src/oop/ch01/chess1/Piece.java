package oop.ch01.chess1;

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
    return switch (this.kind) {
      case queen -> this.queenCharRep();
      case knight -> this.knightCharRep();
    };
  }

  public String toString() {
    return switch (this.kind) {
      case queen -> this.queenToString();
      case knight -> this.knightToString();
    };
  }

  boolean canCapture(Piece other) {
    return switch (this.kind) {
      case queen -> this.queenCanCapture(other);
      case knight -> this.knightCanCapture(other);
    };
  }

  char queenCharRep() {
    return this.color == Color.white ? 'q' : 'Q';
  }

  char knightCharRep() {
    return this.color == Color.white ? 'n' : 'N';
  }

  String queenToString() {
    return "" + this.color + " queen at (" + this.row + ", " + this.col + ")";
  }

  String knightToString() {
    return "" + this.color + " knight at (" + this.row + ", " + this.col + ")";
  }

  boolean queenCanCapture(Piece other) {
    if (this.board != other.board || this.color == other.color)
      return false;
    if (other.row != this.row &&
        other.col != this.col &&
        abs(other.row - this.row) != abs(other.col - this.col))
      return false;
    final int dr = signum(other.row - this.row);
    final int dc = signum(other.col - this.col);
    int r = this.row + dr;
    int c = this.col + dc;
    while (r != other.row || c != other.col) {
      if (this.board.pieceAt(r, c) != null) return false;
      r += dr;
      c += dc;
    }
    return true;
  }

  boolean knightCanCapture(Piece other) {
    if (this.board != other.board || this.color == other.color)
      return false;
    final int dr = abs(this.row - other.row);
    final int dc = abs(this.col - other.col);
    return dr == 2 && dc == 1 || dr == 1 && dc == 2;
  }
}
