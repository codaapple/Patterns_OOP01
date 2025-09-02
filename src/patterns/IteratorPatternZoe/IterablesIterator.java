package patterns.IteratorPatternZoe;

import java.util.NoSuchElementException;

public class IterablesIterator<E> implements Iterator<E> {
    private final Iterator<Iterable<E>> iterablesIt;
    private Iterator<E> currentIt;

    public IterablesIterator(Iterable<Iterable<E>> iterables) {
        iterablesIt = iterables.iterator();
    }

    @Override
    public boolean hasNext() {
        if (currentIt != null && currentIt.hasNext()) return true;
        while (iterablesIt.hasNext()) {
            currentIt = iterablesIt.next().iterator();
            if (currentIt.hasNext()) return true;
        }
        return false;
    }

    @Override
    public E next() {
        if (hasNext()) return currentIt.next();
        throw new NoSuchElementException();
    }

    @Override
    public void remove(){}
}
