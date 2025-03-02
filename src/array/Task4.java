package array;

//4. Write a Java program to calculate the average value of array elements.

import java.util.Arrays;

public class Task4 {
    private static final int[] intArray = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};

    public static void main(String[] args) {
        printAvValuesOfArray(intArray);
    }

    public static void printAvValuesOfArray(int[] array) {
        System.out.println(Arrays.stream(array).average().orElse(0.0));
    }
}
