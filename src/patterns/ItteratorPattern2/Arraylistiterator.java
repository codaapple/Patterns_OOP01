package patterns.ItteratorPattern2;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Arraylistiterator<T> implements Iterator2<T>{
    private int local;
    private ArrayList<T> list;

    Arraylistiterator(ArrayList list1) {
        this.local = 0;
        this.list = list1;
    }

//    public ArrayList getList() {
//        return list;
//    }

    @Override
    public boolean hasNext() {
        if(list.size()>local){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if(list.size()>local){
            local++;
            return (T) list.get(local-1);
        }
        throw new IndexOutOfBoundsException("Liste ist zu kurz");
    }
}
