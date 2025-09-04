package oop.ch08.gui.mvc.v2;

import oop.ch06.observer.Observer;

public class CounterModel {
  private Observer observer;
  private int counter = 0;

  void setObserver(Observer observer) {
    if (this.observer != null && this.observer != observer)
      throw new RuntimeException("Trying to reset observer");
    this.observer = observer;
  }

  public int getCounter() {
    return counter;
  }

  public void increment() {
    counter++;
    observer.update();
  }
}
