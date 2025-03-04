package hashset;

//2. Write a Java program to iterate through all elements in a hash list.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    private static final Set<String> stringSet = new HashSet<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata", "Buenos Aires"));

    public static void main(String[] args) {
        for (String string : stringSet) {
            System.out.println(string);
        }
    }
}
