
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        // get elements
        int element = list.get(2);
        // add element at a index
        list.add(1, 1);
        System.out.println(list);
        // set element / update element
        list.set(0, 5);
        System.out.println(list);
        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
