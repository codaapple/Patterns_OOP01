package oop.ch07.trace;

import java.io.IOException;

public abstract class Trace {
  private int debugLevel = 0;

  public void setDebugLevel(int debugLevel) {
    this.debugLevel = debugLevel;
  }

  public int getDebugLevel() {return debugLevel;}

  public abstract void debug(int level, String message);

  public abstract void error(String message);

  public abstract void close();

  public static Trace intoFile(String path) {
    try { return new FileTrace(path); }
    catch (IOException ex) {
      final Trace trace = new ConsoleTrace();
      trace.error(ex.getMessage() + " - falling back to system trace.");
      return trace;
    }
  }
}
