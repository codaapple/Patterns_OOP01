package oop.ch08.gui.mvc.v5;

import oop.ch06.observer.Observer;
import oop.ch08.gui.mvc.model.CounterModel;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CounterGUI extends JPanel implements Observer {
  private final CounterModel model;
  private final JButton button = new JButton("Push me!");

  CounterGUI(CounterModel model) {
    this.model = model;
    model.addObserver(this);
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        model.increment();
      }
    });
    add(button);
    update();
  }

  @Override
  public void update() {
    button.setText("Push me! (" + model.getCounter() + ")");
  }
}
