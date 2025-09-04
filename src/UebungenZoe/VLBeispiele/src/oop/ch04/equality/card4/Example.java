package oop.ch04.equality.card4;

import java.util.List;

import static oop.ch04.equality.card4.Color.green;
import static oop.ch04.equality.card4.Color.red;

public class Example {
  public static void main(String[] args) {
    final Card k1 = new Card("foo");
    final Card k2 = new Card("foo");
    final Card k3 = new Card("gnat");
    final Card c1 = new ColoredCard("foo", green);
    final Card c2 = new ColoredCard("foo", red);
    final Card c3 = new ColoredCard("foo", red);
    final Card c4 = new ColoredCard("gnat", red);

    List<Card> cards = List.of(k1, k2, k3, c1, c2, c3, c4);

    for (Card x1 : cards) {
      System.out.println(x1);
      for (Card x2 : cards)
        if (x1.equals(x2))
          System.out.println("   equal to " + x2);
        else
          System.out.println("   NOT equal to " + x2);
    }
  }
}
