package oop.ch07.clock1;

public class Clock {
  private State state = new Normal(this);
  private int t = 0;

  void setState(State s) { state = s; }

  public int getTime() {
    return t;
  }

  void setTime(int t) {
    this.t = t;
  }

  public void tick() {state.tick();}

  public void set() {state.set();}

  public void mode() {state.mode();}
}

