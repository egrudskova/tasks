package lambda;

//5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

import java.util.Arrays;
import java.util.List;

public class Task4 {
    private static final List<String> testList = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

    public static void main(String[] args) {
        testList.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        System.out.println(testList);
    }
}
