package oop.ch08.gui.calc;

import oop.ch07.calc.Calculator;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Container;

public class CalcApp {
  public static void main(String[] args) {
    showFrame(new CalcGUI(new Calculator()), "Calculator");
  }

  private static void showFrame(Container pane, String title) {
    final JFrame frame = new JFrame(title);
    frame.setContentPane(pane);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
}
