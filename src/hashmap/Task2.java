package hashmap;

//2. Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("New York", 1);
        map.put("Moscow", 20);
        map.put("Paris", 25);
        System.out.println(map.size());
    }
}
