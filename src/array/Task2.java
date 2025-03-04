package array;

//2. Write a Java program to sum values of an array.

import java.util.Arrays;

public class Task2 {
    private static final int[] intArray = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};

    public static void main(String[] args) {
        printSumValuesOfArray(intArray);
    }

    private static void printSumValuesOfArray(int[] array) {
        System.out.println(Arrays.stream(array).sum());
    }
}
