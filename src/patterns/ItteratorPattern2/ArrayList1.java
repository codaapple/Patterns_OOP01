package patterns.ItteratorPattern2;

import java.util.ArrayList;

public class ArrayList1 implements Iterable2 {
    private ArrayList list = new ArrayList();
    private Arraylistiterator iterator;

    public ArrayList1() {}

    public ArrayList1(ArrayList list) {
        this.list = list;
    }

    public void add(Object o) {
        this.list.add(o);
        getIterator();
    }

    @Override
    public Iterator2 getIterator() {
        iterator = new Arraylistiterator(this.list);
        return iterator;
    }

    public void foreachprint(){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
