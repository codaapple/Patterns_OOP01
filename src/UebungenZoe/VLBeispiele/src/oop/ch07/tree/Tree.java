package oop.ch07.tree;

import java.util.Iterator;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class Tree<E> implements Iterable<E> {
  public final E elem;
  public final Tree<E> left;
  public final Tree<E> right;

  public Tree(E elem) {this(elem, null, null);}

  public Tree(E elem, Tree<E> left, Tree<E> right) {
    this.elem = elem;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return String.format("%s(%s, %s)", elem, left, right);
  }

  @Override
  public Iterator<E> iterator() {
    return new IterablesIterator<>(List.of(left == null ? emptyList() : left,
                                           singletonList(elem),
                                           right == null ? emptyList() : right));
  }
}
