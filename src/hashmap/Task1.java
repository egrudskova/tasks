package hashmap;

//1. Write a Java program to associate the specified value with the specified key in a HashMap.

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("New York", 1);
        map.put("Moscow", 20);
        map.put("Paris", 25);
        System.out.println(map);
    }
}
