import java.util.*;

class LL{
public static void main(String[] args){
LinkedList<String> list = new LinkedList<String>();
list.addFirst("a");
list.addFirst("is");
System.out.println(list);
list.addFirst("this");
list.addLast("list");
list.add("list1");//by default nodes are added in the last
System.out.println(list);
}
}