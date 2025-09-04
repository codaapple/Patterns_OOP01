package oop.ch07.clock2;

abstract class State {
  final Clock clock;

  State(Clock clock) {
    this.clock = clock;
  }

  abstract void tick();

  abstract void set();

  abstract void mode();
}
