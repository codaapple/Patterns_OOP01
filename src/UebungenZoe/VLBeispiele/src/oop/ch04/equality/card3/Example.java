package oop.ch04.equality.card3;

public class Example {
  public static void main(String[] args) {
    Card k1 = new Card("foo");
    Card c1 = new ColoredCard("foo", Color.green);
    Card c2 = new ColoredCard("foo", Color.red);

    System.out.println(c1.equals(k1));
    System.out.println(k1.equals(c1));
    System.out.println(c2.equals(k1));
    System.out.println(k1.equals(c2));
    System.out.println(c1.equals(c2));
  }
}
