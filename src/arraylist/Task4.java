package arraylist;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    private static final List<String> stringList = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));

    public static void main(String[] args) {
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(2));
    }
}
