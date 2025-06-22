package patterns.ItteratorPattern;

public class LLIterator implements Iterator {

    @Override
    public boolean hasNext(LL list) {
        if(list.getNext() == null){
            return false;
        }
        return true;
    }

    @Override
    public LL next(LL list) {
        return list.getNext();
    }
}
