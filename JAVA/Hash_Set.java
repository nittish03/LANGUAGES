import java.util.HashSet;
import java.util.Iterator;


public class Hash_Set {
public static void main(String[] args) {
//Creating
HashSet<Integer> set = new HashSet<>(); 
//Insert
set.add(1);
set.add(2);
set.add(3);
set.add(1);
//Search
set.contains(1);
//Delete
set.remove(1);
//Size of set
System.out.println("size of set is " + set.size());
System.out.println(set);
//Iterator
Iterator it = set.iterator();
//hasNext
while(it.hasNext()){
    System.out.println(it.next());
}
}
}
