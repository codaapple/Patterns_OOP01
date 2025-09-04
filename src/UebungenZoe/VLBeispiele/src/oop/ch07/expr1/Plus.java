package oop.ch07.expr1;

public class Plus extends BinExpr {
  public Plus(Expr op1, Expr op2) {
    super(op1, '+', op2);
  }

  @Override
  public int eval() { return op1.eval() + op2.eval(); }
}
