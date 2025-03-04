package lambda;

//3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

import java.util.Arrays;
import java.util.List;

public class Task3 {
    private static final List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

    public static void main(String[] args) {
        stringList.replaceAll(s -> s.toUpperCase());
        System.out.println(stringList);
        stringList.replaceAll(s -> s.toLowerCase());
        System.out.println(stringList);
    }
}
