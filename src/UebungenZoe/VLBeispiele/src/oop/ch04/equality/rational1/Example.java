package oop.ch04.equality.rational1;

import java.util.HashSet;
import java.util.Set;

public class Example {
  public static void main(String[] args) {
    Rational r1 = new Rational(1, 2);
    Rational r2 = new Rational(2, 4);
    System.out.println(r1 == r2);
    System.out.println(r1.equals(r2));

    Set<Rational> s1 = new HashSet<>();
    s1.add(new Rational(1, 2));
    s1.add(new Rational(1, 2));
    System.out.println(s1);

    Set<Rational> s2 = new HashSet<>();
    s2.add(new Rational(1, 2));
    s2.add(new Rational(1, 3));
    System.out.println(s2.contains(new Rational(1, 3)));
  }
}
