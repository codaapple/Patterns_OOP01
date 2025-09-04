package oop.ch08.gui.mvc.v2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class CounterController extends MouseAdapter {
  private final CounterModel model;

  CounterController(CounterModel model) {
    this.model = model;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    if (10 <= e.getX() && e.getX() <= 110 && 10 <= e.getY() && e.getY() <= 40)
      model.increment();
  }
}
