package oop.ch07.trace;

public class ConsoleTrace extends Trace {
  @Override
  public void debug(int level, String message) {
    if (level >= getDebugLevel())
      System.out.println("DEBUG: " + message);
  }

  @Override
  public void error(String message) {
    System.out.println("ERROR: " + message);
  }

  @Override
  public void close() {
    // nothing to do here
  }
}
