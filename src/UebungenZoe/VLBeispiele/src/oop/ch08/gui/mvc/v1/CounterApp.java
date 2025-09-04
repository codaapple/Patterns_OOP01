package oop.ch08.gui.mvc.v1;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Container;

public class CounterApp {
  public static void main(String[] args) {
    final CounterModel model = new CounterModel();
    final CounterView view = new CounterView(model);
    final CounterController controller = new CounterController(model);
    view.addMouseListener(controller);

    showFrame(view, "Counter");
  }

  private static void showFrame(Container pane, String title) {
    final JFrame frame = new JFrame(title);
    frame.setContentPane(pane);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
}
