package oop.ch04.equality.card1;

public class Example {
  public static void main(String[] args) {
    Card k1 = new Card("foo");
    Card c1 = new ColoredCard("foo", Color.green);

    System.out.println(c1.equals(k1));
    System.out.println(k1.equals(c1));
  }
}
