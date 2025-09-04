package oop.ch06.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverSupport {
  private final List<Observer> observers = new ArrayList<>();

  public void notifyObservers() {
    for (Observer o : observers)
      o.update();
  }

  public void addObserver(Observer o) {
    observers.add(o);
  }
}
