package lesson5;

import java.util.ArrayList;
import java.util.List;

/*
1. Create ArrayList and print it.
 */
public class ArrayListPrint {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        stringList.add("six");
        stringList.add("seven");

        for (String s : stringList) {
            System.out.print(s + " ");
        }
    }
}
