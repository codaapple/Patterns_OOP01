package oop.ch07.trace;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTrace extends Trace {
  private final PrintWriter pw;

  public FileTrace(String path) throws IOException {
    pw = new PrintWriter(new FileWriter(path), true);
  }

  @Override
  public void debug(int level, String message) {
    if (level >= getDebugLevel()) pw.println("DEBUG: " + message);
  }

  @Override
  public void error(String message) {
    pw.println("ERROR: " + message);
  }

  @Override
  public void close() {
    pw.close();
  }
}
