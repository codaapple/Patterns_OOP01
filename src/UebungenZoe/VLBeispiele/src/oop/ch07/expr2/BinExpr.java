package oop.ch07.expr2;

public abstract class BinExpr implements Expr {
  public final Expr op1;
  public final Expr op2;
  private final char op;

  protected BinExpr(Expr op1, char op, Expr op2) {
    this.op1 = op1;
    this.op2 = op2;
    this.op = op;
  }

  @Override
  public String toString() {return "(" + op1 + op + op2 + ")";}
}
