package stream;

//1. Write a Java program to calculate the average of a list of integers using streams.

import java.util.Arrays;
import java.util.List;

public class Task1 {

    private static final List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        System.out.println(testList
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0));
    }
}
