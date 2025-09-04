package oop.ch06.calc;

public class CalculatorError extends RuntimeException {
  public CalculatorError(String message) {
    super(message);
  }
}
