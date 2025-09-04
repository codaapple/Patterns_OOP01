package oop.ch02.cards0;

public class Card {
  private final String name;
  private static int counter = 0;
  private final int number;

  public Card(String name) {
    if (name == null)
      throw new NullPointerException("name is null");
    this.name = name;
    this.number = ++Card.counter;
  }

  public Card(int num) {
    this("MatrNr. " + num);
  }

  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }

  public static int getCounter() {
    return Card.counter;
  }

  public String toString() {
    return "Card " + name + " (no " + number + ")";
  }
}
