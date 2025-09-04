package oop.ch06.calc;

public abstract class BinaryOp extends Op {
  protected BinaryOp(String name) {
    super(name);
  }

  public abstract double eval(double opnd1, double opnd2);
}
