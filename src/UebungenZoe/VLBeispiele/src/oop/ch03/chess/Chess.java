package oop.ch03.chess;

public class Chess {
  public static void main(String[] args) {
    final Board board = new Board();
    final Piece p1 = new Queen(Color.black, board, 1, 4);
    final Piece p2 = new Queen(Color.white, board, 8, 4);
    final Piece p3 = new Knight(Color.white, board, 3, 3);
    final Piece p4 = new Knight(Color.black, board, 6, 4);
    System.out.println(board);
    System.out.println(board.toString());
    board.printBoard();
    board.check();
  }
}
