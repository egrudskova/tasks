package array;

//5. Write a Java program to test if an array contains a specific value.

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task5 {
    private static final int[] intArray = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
    private static final String[] stringArray = {"apple", "orange", "banana", "water", "melon"};

    public static void main(String[] args) {
        printIsValueInArray(intArray, 5);
        printIsValueInArray(intArray, 25);
        printIsValueInArray(stringArray, "apple");
        printIsValueInArray(stringArray, "not here");
    }

    private static void printIsValueInArray(int[] array, int value) {
        System.out.println(IntStream.of(array).anyMatch(x -> x == value));
    }

    private static void printIsValueInArray(String[] array, String value) {
        System.out.println(Arrays.asList(array).contains(value));
    }
}
