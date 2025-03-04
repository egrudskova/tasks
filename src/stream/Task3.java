package stream;

//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

import java.util.Arrays;
import java.util.List;

enum Parity {
    EVEN,
    ODD
}

public class Task3 {

    private static final List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        printNumbersSum(Parity.EVEN);
        printNumbersSum(Parity.ODD);
    }

    private static void printNumbersSum(Parity parity) {
        int remainder = parity.equals(Parity.EVEN) ? 0 : 1;
        System.out.println("Sum of " + parity.toString().toLowerCase() + " numbers: " + testList
                .stream()
                .mapToInt(Integer::intValue)
                .filter((x) -> x % 2 == remainder)
                .sum());
    }
}
