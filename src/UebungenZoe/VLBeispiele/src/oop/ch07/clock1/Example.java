package oop.ch07.clock1;

public class Example {
  public static void main(String[] args) {
    final Clock clock = new Clock();
    clock.tick();
    clock.set();
    System.out.println(clock.getTime());
    clock.tick();
    clock.set();
    clock.tick();
    clock.set();
    clock.tick();
    clock.set();
    System.out.println(clock.getTime());
    clock.mode();
    clock.tick();
    clock.set();
    clock.tick();
    clock.set();
    clock.tick();
    clock.set();
    System.out.println(clock.getTime());
    clock.mode();
    clock.tick();
    clock.set();
    clock.tick();
    clock.set();
    clock.tick();
    clock.set();
    System.out.println(clock.getTime());
  }
}
