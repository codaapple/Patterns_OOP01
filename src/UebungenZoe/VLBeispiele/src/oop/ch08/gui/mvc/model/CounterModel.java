package oop.ch08.gui.mvc.model;

import oop.ch06.observer.Observer;
import oop.ch06.observer.ObserverSupport;

public class CounterModel {
  private final ObserverSupport observerSupport = new ObserverSupport();
  private int counter = 0;

  public void addObserver(Observer observer) {
    observerSupport.addObserver(observer);
  }

  public int getCounter() {
    return counter;
  }

  public void increment() {
    counter++;
    observerSupport.notifyObservers();
  }
}
