package oop.ch07.tree;

public class Example {
  public static void main(String[] args) {
    final Tree<Integer> t =
        new Tree<>(42,
                   new Tree<>(17,
                              new Tree<>(5),
                              null),
                   new Tree<>(81,
                              new Tree<>(51),
                              new Tree<>(97)));
    System.out.println("t = " + t);
    for (int e : t) System.out.println(e);

    final Tree<String> t1 =
        new Tree<>("foo",
                   new Tree<>("baz",
                              new Tree<>("abc"),
                              null),
                   new Tree<>("google",
                              new Tree<>("gnat"),
                              new Tree<>("hex")));

    System.out.println("t1 = " + t1);
    for (String e : t1) System.out.println(e);

    final Tree<String> t2 = new Tree<>("1", new Tree<>("2", new Tree<>("3"), null), null);
    System.out.println("t2 = " + t2);
    for (String e : t2) System.out.println(e);

    final Tree<String> t3 = new Tree<>("4", null, new Tree<>("5", null, new Tree<>("6")));
    System.out.println("t3 = " + t3);
    for (String e : t3) System.out.println(e);

    final Tree<String> t4 = new Tree<>("7", t2, t3);
    System.out.println("t4 = " + t4);
    for (String e : t4) System.out.println(e);
  }
}
