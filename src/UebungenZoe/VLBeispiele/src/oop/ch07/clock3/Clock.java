package oop.ch07.clock3;

public class Clock {
  private abstract class State {
    abstract void tick();

    abstract void set();

    abstract void mode();
  }

  private final State normal = new State() {
    @Override
    void tick() { setTime(getTime() + 1); }

    @Override
    void set() {}

    @Override
    void mode() { state = setting; }
  };

  private final State setting = new State() {
    @Override
    void tick() {}

    @Override
    void set() { setTime(getTime() + 60); }

    @Override
    void mode() { state = normal; }
  };

  private State state = normal;
  private int t = 0;

  public int getTime() {
    return t;
  }

  private void setTime(int t) {
    this.t = t;
  }

  public void tick() { state.tick(); }

  public void set() { state.set(); }

  public void mode() { state.mode(); }
}

