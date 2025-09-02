package patterns.IteratorPatternZoe;

public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove();
}
