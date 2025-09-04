package oop.ch02.clock;

public class Example {
  public static void main(String[] args) {
    Clock3 clock = new Clock3(22, 55);
    for (int i = 0; i < 7; i++)
      clock.tick();
    System.out.printf("%02d:%02d%n", clock.getHour(), clock.getMinute());
    for (int i = 0; i < 60; i++)
      clock.tick();
    System.out.printf("%02d:%02d%n", clock.getHour(), clock.getMinute());
  }
}
