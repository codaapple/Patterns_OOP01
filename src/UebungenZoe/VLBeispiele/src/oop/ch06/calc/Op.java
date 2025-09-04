package oop.ch06.calc;

abstract class Op {
  private final String name;

  protected Op(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  protected double check(double v) {
    if (Double.isNaN(v))
      throw new CalculatorError("value is not a number");
    if (Double.isInfinite(v))
      throw new CalculatorError("infinite value");
    return v;
  }
}
