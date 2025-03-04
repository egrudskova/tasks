package lambda;

//1. Write a Java program to implement a lambda expression to find the sum of two integers.

interface Calculator {
    int calculate(int a, int b);
}

public class Task1 {
    public static void main(String[] args) {
        printResult(5, 2, (a, b) -> a + b);
    }

    private static void printResult(int a, int b, Calculator calculator) {
        System.out.println("Sum is " + calculator.calculate(a, b));
    }
}
