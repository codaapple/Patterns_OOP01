package patterns.ItteratorPattern;

public class LL implements Iterable {
    private Object elements;
    private LL next;

    public LL() {
        elements = null;
        next = null;
    }

    public LL(Object elements) {
        this.elements = elements;
        next = null;
    }

    public void add(Object o) {
        if (elements == null) {
            elements = o;
        }
        else {
            if(next == null) {
                next = new LL();
            }
            next.add(o);
        }
    }

    public Object getElements() {
        return elements;
    }

    public LL getNext() {
        return next;
    }


    @Override
    public Iterator getIterator() {
        return new LLIterator();
    }
}
