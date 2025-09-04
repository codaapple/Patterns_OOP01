package oop.ch08.gui.mvc.v1;

public class CounterModel {
  private CounterView view;
  private int counter = 0;

  void setView(CounterView view) {
    if (this.view != null && this.view != view)
      throw new RuntimeException("Trying to reset view");
    this.view = view;
  }

  public int getCounter() {
    return counter;
  }

  public void increment() {
    counter++;
    view.update();
  }
}
