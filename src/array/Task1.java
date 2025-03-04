package array;

//1. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Task1 {
    private static final int[] intArray = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
    private static final String[] stringArray = {"apple", "orange", "banana", "water", "melon"};

    public static void main(String[] args) {
        printSortedArray(intArray);
        printSortedArray(stringArray);
    }

    private static void printSortedArray(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void printSortedArray(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
