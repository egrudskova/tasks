package hashset;

//3. Write a Java program to get the number of elements in a hash set.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task3 {
    private static final Set<String> stringSet = new HashSet<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata", "Buenos Aires"));

    public static void main(String[] args) {
        System.out.println(stringSet.size());
    }
}
