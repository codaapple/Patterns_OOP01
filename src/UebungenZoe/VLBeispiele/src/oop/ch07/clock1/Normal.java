package oop.ch07.clock1;

class Normal extends State {
  Normal(Clock clock) {
    super(clock);
  }

  public void tick() {clock.setTime(clock.getTime() + 1);}

  public void set() {}

  public void mode() {clock.setState(new Setting(clock));}
}
