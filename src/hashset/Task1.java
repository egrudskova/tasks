package hashset;

//1. Write a Java program to append the specified element to the end of a hash set.

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> testSet = new HashSet<>();
        testSet.add("New York");
        testSet.add("New York");
        testSet.add("Moscow");
        System.out.println(testSet);
    }
}
