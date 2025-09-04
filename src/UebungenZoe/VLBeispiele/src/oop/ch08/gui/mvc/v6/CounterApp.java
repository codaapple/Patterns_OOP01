package oop.ch08.gui.mvc.v6;

import oop.ch08.gui.mvc.model.CounterModel;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Container;

public class CounterApp {
  public static void main(String[] args) {
    showFrame(new CounterGUI(new CounterModel()), "Counter");
  }

  private static void showFrame(Container pane, String title) {
    final JFrame frame = new JFrame(title);
    frame.setContentPane(pane);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
}
