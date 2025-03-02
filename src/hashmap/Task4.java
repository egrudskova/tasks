package hashmap;

//4. Write a Java program to remove all mappings from a map.

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("New York", 1);
        map.put("Moscow", 20);
        map.put("Paris", 25);
        map.clear();
        System.out.println(map);
    }
}
