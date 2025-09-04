package oop.ch06.calc;

import oop.ch06.observer.ObserverSupport;

public class AdHocCalculator extends ObserverSupport {
  private double value;
  private double opnd1;
  private BinaryOp lastOp;
  private double factor;
  private boolean startedNumTyping;
  private boolean hasSecondOpnd;

  public double getValue() {return value;}

  private void setValue(double n) {
    value = n;
    notifyObservers();
  }

  public void digit(int d) {
    if (!Double.isNaN(value)) {
      if (!startedNumTyping) {
        startedNumTyping = true;
        setValue(d);
        factor = 1.;
      }
      else if (factor < 1.) {
        setValue(value + factor * d);
        factor *= 0.1;
      }
      else
        setValue(10. * value + d);
      if (lastOp != null)
        hasSecondOpnd = true;
    }
  }

  public void dot() {
    if (!Double.isNaN(value)) {
      if (!startedNumTyping) {
        startedNumTyping = true;
        setValue(0);
        factor = 0.1;
      }
      else if (factor > 0.1)
        factor = 0.1;
      if (lastOp != null)
        hasSecondOpnd = true;
    }
  }

  public void unOp(UnaryOp op) {
    try {
      if (!Double.isNaN(value)) {
        startedNumTyping = false;
        setValue(op.eval(value));
        if (lastOp != null)
          hasSecondOpnd = true;
      }
    }
    catch (CalculatorError ex) {
      setValue(Double.NaN);
    }
  }

  public void binOp(BinaryOp op) {
    try {
      if (!Double.isNaN(value)) {
        startedNumTyping = false;
        if (lastOp == null) {
          opnd1 = value;
          hasSecondOpnd = false;
        }
        else if (hasSecondOpnd) {
          setValue(lastOp.eval(opnd1, value));
          opnd1 = value;
        }
        lastOp = op;
      }
    }
    catch (CalculatorError ex) {
      setValue(Double.NaN);
    }
  }

  public void eval() {
    try {
      if (!Double.isNaN(value) && lastOp != null) {
        startedNumTyping = false;
        setValue(lastOp.eval(opnd1, value));
        lastOp = null;
      }
    }
    catch (CalculatorError ex) {
      setValue(Double.NaN);
    }
  }

  public void clear() {
    if (!Double.isNaN(value)) {
      setValue(0);
      startedNumTyping = false;
      hasSecondOpnd = false;
    }
  }

  public void allClear() {
    setValue(0);
    startedNumTyping = false;
    hasSecondOpnd = false;
    lastOp = null;
  }
}
