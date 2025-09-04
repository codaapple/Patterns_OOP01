package oop.ch06.calc;

public class Ops {
  private Ops() { /* do not instantiate */ }

  public static final BinaryOp PLUS = new BinaryOp("+") {
    public double eval(double opnd1, double opnd2) {
      return check(opnd1 + opnd2);
    }
  };

  public static final BinaryOp MULT = new BinaryOp("*") {
    public double eval(double opnd1, double opnd2) {
      return check(opnd1 * opnd2);
    }
  };

  public static final BinaryOp MINUS = new BinaryOp("-") {
    public double eval(double opnd1, double opnd2) {
      return check(opnd1 - opnd2);
    }
  };

  public static final BinaryOp DIV = new BinaryOp("/") {
    public double eval(double opnd1, double opnd2) {
      return check(opnd1 / opnd2);
    }
  };

  public static final UnaryOp CHANGE_SIGN = new UnaryOp("+/-") {
    public double eval(double opnd) {
      return check(-opnd);
    }
  };

  public static final UnaryOp SQRT = new UnaryOp("sqrt") {
    public double eval(double opnd) {
      return check(Math.sqrt(opnd));
    }
  };

  public static final UnaryOp EXP = new UnaryOp("exp") {
    public double eval(double opnd) {
      return check(Math.exp(opnd));
    }
  };
}
