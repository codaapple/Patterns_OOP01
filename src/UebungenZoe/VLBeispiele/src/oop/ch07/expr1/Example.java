package oop.ch07.expr1;

public class Example {
  public static void main(String[] args) {
    Expr e = new Plus(new Neg(new Minus(new Const(1), new Const(2))), new Const(12));
    System.out.println(e + " = " + e.eval());
  }
}
