package arraylist;

//2. Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    private static final List<String> stringList = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));

    public static void main(String[] args) {
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
