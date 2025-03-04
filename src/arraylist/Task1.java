package arraylist;

//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("White");
        stringList.add("Red");
        stringList.add("Black");
        stringList.add("Gray");
        stringList.add("Blue");
        System.out.println(stringList);
    }
}
