import java.util.*;
public class Hash_Map {
public static void main(String[] args) {


//country(key), population(value)
HashMap<String, Integer> map = new HashMap<>();
//Insert
map.put("India",120);
map.put("US",30);
map.put("China",150);

System.out.println(map);
map.put("China",200);
System.out.println(map);

if(map.containsKey("Indonesia")){
    System.out.println("Key is present in the map");
}else{
    System.out.println("Key is not present in the map");
}

System.out.println(map.get("China"));
System.out.println(map.get("Indonesia"));

for(Map.Entry<String, Integer> e: map.entrySet()){
System.out.println(e.getKey());
System.out.println(e.getValue());
}

map.put("Indonesia",map.getOrDefault("Indonesia",0)+1);

Set<String> keys = map.keySet();
for(String key: keys){
    System.out.println(key + ' ' + map.get(key));
}
//delete
map.remove("China");
System.out.println(map);



}
}
