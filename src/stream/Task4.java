package stream;

//4. Write a Java program to remove all duplicate elements from a list using streams.

import java.util.Arrays;
import java.util.List;

public class Task4 {

    private static final List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

    public static void main(String[] args) {
        System.out.println(testList.stream().distinct().toList());
    }
}
