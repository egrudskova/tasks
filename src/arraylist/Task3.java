package arraylist;

//3. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    private static final List<String> stringList = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));

    public static void main(String[] args) {
        stringList.addFirst("Moscow");
        System.out.println(stringList);
    }
}
