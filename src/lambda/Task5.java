package lambda;

//14. Write a Java program to implement a lambda expression to check if a given string is a palindrome.

import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        Predicate<String> palindromePredicate = (s) -> new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
        System.out.println(palindromePredicate.test("Totot"));
        System.out.println(palindromePredicate.test("Red"));
    }
}
