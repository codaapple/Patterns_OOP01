package oop.ch08.gui.mvc.v6;

import oop.ch06.observer.Observer;
import oop.ch08.gui.mvc.model.CounterModel;

import javax.swing.JButton;
import javax.swing.JPanel;

class CounterGUI extends JPanel implements Observer {
  private final CounterModel model;
  private final JButton button = new JButton("Push me!");

  CounterGUI(CounterModel model) {
    this.model = model;
    model.addObserver(this);
    button.addActionListener(e -> model.increment());
    add(button);
    update();
  }

  @Override
  public void update() {
    button.setText("Push me! (" + model.getCounter() + ")");
  }
}
