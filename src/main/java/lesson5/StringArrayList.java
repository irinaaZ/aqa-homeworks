package lesson5;

/*
"5. Create ArrayList of Strings. Add 5 different Strings to it.
Using any cycle print all the values of the ArrayList to the console."

"1) Create ArrayList of String and initialize it.
2) The size of the ArrayList should be printed to the console.
3) All values should be printed to the console (each from a new line)"
 */

import java.util.ArrayList;
import java.util.List;

public class StringArrayList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("value1");
        stringList.add("value2");
        stringList.add("value3");
        stringList.add("value4");
        stringList.add("value5");

        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println("The size of stringList is: " + stringList.size());
    }
}
