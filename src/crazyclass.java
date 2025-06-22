import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class crazyclass {
    ArrayList<String> list;

    public void print(){
        System.out.println("Print crazyclass");

    }

    public void newList(String... string1){
        list = (ArrayList<String>) Arrays.stream(string1).toList();
        throw new NoSuchElementException();
    }
}