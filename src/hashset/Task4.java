package hashset;

//4. Write a Java program to empty an hash set.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    private static final Set<String> stringSet = new HashSet<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata", "Buenos Aires"));

    public static void main(String[] args) {
        System.out.println(stringSet);
        stringSet.removeAll(stringSet);
        System.out.println(stringSet);
    }
}
