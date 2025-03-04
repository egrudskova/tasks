package hashmap;

//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("New York", 1);
        map.put("Moscow", 20);
        map.put("Paris", 25);
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());
    }
}
