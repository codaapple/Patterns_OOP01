package oop.ch08.gui.mvc.v4;

import oop.ch08.gui.mvc.model.CounterModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CounterController implements ActionListener {
  private final CounterModel model;

  CounterController(CounterModel model) {
    this.model = model;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    model.increment();
  }
}
