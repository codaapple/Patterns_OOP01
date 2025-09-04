package oop.ch06.calc;

public abstract class UnaryOp extends Op {
  protected UnaryOp(String name) {
    super(name);
  }

  public abstract double eval(double opnd);
}
