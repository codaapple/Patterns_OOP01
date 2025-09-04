package oop.ch04.equality;

import oop.ch04.equality.card1.Card;

public class Example {
  public static void main(String[] args) {
    Card c1 = new Card("foo");
    Card c2 = new Card("foo");
    System.out.println(c1 == c2);

    int i1 = 42;
    int i2 = 2 * 21;
    System.out.println(i1 == i2);

    double f1 = 0.5;
    double f2 = 1.0 / 2.0;
    System.out.println(f1 == f2);

    String s1 = "OOP";
    String s2 = "O" + "OP";
    System.out.println(s1 == s2);

    String s3 = "OOP".substring(1);
    String s4 = "OP";
    System.out.println(s3 == s4);
  }
}
