package oop.ch07.tree;

import java.util.Iterator;
import java.util.List;

public class Example2 {
  public static void main(String[] args) {
    final Iterator<Integer> it =
        new IterablesIterator<>(List.of(List.of(1, 2, 3),
                                        List.of(4, 5, 6),
                                        List.of(7, 8, 9)));
    while (it.hasNext())
      System.out.println(it.next());
  }
}
