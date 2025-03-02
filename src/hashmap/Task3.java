package hashmap;

//3. Write a Java program to copy all mappings from the specified map to another map.

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> mapDest = new HashMap<>();
        map.put("New York", 1);
        map.put("Moscow", 20);
        map.put("Paris", 25);
        System.out.println(mapDest);
        mapDest.putAll(map);
        System.out.println(mapDest);
    }
}
