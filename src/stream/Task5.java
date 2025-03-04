package stream;

//5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.

import java.util.Arrays;
import java.util.List;

public class Task5 {

    private static final List<String> testList = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

    public static void main(String[] args) {
        printCountOfLetterStart('B');
        printCountOfLetterStart('G');
    }

    private static void printCountOfLetterStart(char letter) {
        System.out.println(testList
                .stream()
                .filter((str) -> str.startsWith(String.valueOf(letter)))
                .count());
    }
}
