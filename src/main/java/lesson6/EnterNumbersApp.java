package lesson6;

/*
"6. Write a program that will enter numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
The code inside the readData is wrapped in a try..catch.
If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
Numbers output from a new line preserving the order of input."
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EnterNumbersApp {
    public static void main(String[] args) {
        readData();
    }

    private static void readData() {
        List<Integer> listWithValues = new LinkedList<>();

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the integer value: ");

            while (sc.hasNext()) {
                listWithValues.add(sc.nextInt());
            }
        } catch (Exception ex) {
            System.out.println("Incorrect value was entered. Previous entered values: " + listWithValues);

        }
    }
}
