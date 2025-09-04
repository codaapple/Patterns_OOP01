package oop.ch02.chess1;

import java.util.ArrayList;

public class Board {
  private ArrayList<Piece> pieces;

  public Board() {
    this.pieces = new ArrayList<Piece>();
  }

  void add(Piece piece) {
    if (piece.getBoard() != this)
      throw new IllegalArgumentException("wrong board");
    final Piece existing = pieceAt(piece.getRow(), piece.getCol());
    if (existing != null)
      throw new IllegalArgumentException("already occupied by " +
                                         existing.toString());
    pieces.add(piece);
  }

  public void printBoard() {
    System.out.println("    1   2   3   4   5   6   7   8");
    System.out.println("  +---+---+---+---+---+---+---+---+");
    for (int row = 1; row <= 8; row++) {
      System.out.print("" + row + " ");
      for (int col = 1; col <= 8; col++) {
        final Piece p = pieceAt(row, col);
        final char c = p == null ? ' ' : p.charRep();
        System.out.print("| " + c + " ");
      }
      System.out.println("|");
      System.out.println("  +---+---+---+---+---+---+---+---+");
    }
  }

  public Piece pieceAt(int row, int col) {
    for (Piece p : pieces)
      if (p.getRow() == row && p.getCol() == col)
        return p;
    return null;
  }

  public void check() {
    for (Piece p1 : pieces) {
      System.out.println(p1.toString());
      for (Piece p2 : pieces)
        if (p1 != p2)
          if (p1.canCapture(p2))
            System.out.println("   can capture " + p2.toString());
          else
            System.out.println("   cannot capture " + p2.toString());
    }
  }

  public String toString() {
    return pieces.toString();
  }
}
