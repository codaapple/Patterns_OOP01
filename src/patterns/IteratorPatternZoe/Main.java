package patterns.IteratorPatternZoe;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Tree<Integer> t = 
            new Tree<>(42, new Tree<>(17, new Tree<>(5), null), new Tree<>(81, new Tree<>(51), new Tree<>(97)));
        for (int e : t) System.out.println(e);
        
        final Iterator<Integer> it = 
            new IterablesIterator<>(List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9)));
        while (it.hasNext()) System.out.println(it.hasNext());
    }
}
