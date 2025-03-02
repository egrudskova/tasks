package arraylist;

//5. Write a Java program to update an array element by the given element.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    private static final List<String> stringList = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));

    public static void main(String[] args) {
        stringList.set(1, "Moscow");
        stringList.set(0, "New York");
        System.out.println(stringList);
    }
}
