package hashset;

//5. Write a Java program to test if a hash set is empty or not.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task5 {
    private static final Set<String> stringSet = new HashSet<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata", "Buenos Aires"));

    public static void main(String[] args) {
        printIsSetEmpty(stringSet);
        stringSet.removeAll(stringSet);
        printIsSetEmpty(stringSet);
    }

    private static void printIsSetEmpty(Set<?> set) {
        System.out.println(set.isEmpty());
    }
}
