package oop.ch02.cards;

import java.util.Arrays;

public class CardExample {
  public static void main(String[] args) {
    Card c1 = new Card(12345);
    System.out.println(c1 + " erstellt.");

    String[] names = {"Franz Mueller", "Hans Mustermann", "Peter Meier"};
    Card[] cards = new Card[names.length];
    for (int i = 0; i < names.length; i++) {
      cards[i] = new Card(names[i]);
      System.out.println(cards[i] + " erstellt.");
    }
    System.out.println("cards = " + cards);
    System.out.println("cards = " + Arrays.deepToString(cards));
    System.out.println("#Card = " + Card.getCounter());
  }
}
