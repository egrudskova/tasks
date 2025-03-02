package array;

/*
3. Write a Java program to print the following grid.

Expected Output :

        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
*/

import java.util.Arrays;

public class Task3 {
    private static final char[][] charArray = new char[10][10];

    public static void main(String[] args) {
        printGrid(charArray);
    }

    private static void printGrid(char[][] array) {
        for (char[] charRow : array) {
            for (char charCol : charRow) {
                System.out.print('-');
            }
            System.out.println();
        }
    }
}
