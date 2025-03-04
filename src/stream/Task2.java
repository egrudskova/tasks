package stream;

//2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.

import java.util.Arrays;
import java.util.List;

public class Task2 {

    private static final List<String> testList = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

    public static void main(String[] args) {
        System.out.println("Uppercase: " + testList.stream().map(String::toUpperCase).toList());
        System.out.println("Lowercase: " + testList.stream().map(String::toLowerCase).toList());
    }
}
