package lambda;

//2. Write a Java program to implement a lambda expression to check if a given string is empty.

interface StringChecker {
    boolean check(String s);
}

public class Task2 {
    public static void main(String[] args) {
        printResult("", (str) -> str.isEmpty());
        printResult("Not empty", (str) -> str.isEmpty());
    }

    private static void printResult(String string, StringChecker checker) {
        System.out.println("String is empty: " + checker.check(string));
    }
}
