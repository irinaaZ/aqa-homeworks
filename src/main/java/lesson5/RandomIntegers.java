package lesson5;

/*
Create an array of 15 random integers from the segment [0;   9].
Display the array on the screen. Count how many in the array of even elements and display this number on the screen on a separate line.
 */

import java.util.Arrays;

public class RandomIntegers {
    public static void main(String[] args) {
        int [] randomNumbers = new int[15];
        for (int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = (int) (Math.random() * 9);
        }
        System.out.print(Arrays.toString(randomNumbers) + " ");
        System.out.println();

        int counter = 0;
        for (int randomNumber : randomNumbers) {
            if ((randomNumber % 2 == 0) && (randomNumber != 0)) {
                counter++;
                System.out.print(randomNumber + " ");
            }
        }
        System.out.println();

        if (counter == 0) {
            System.out.println("All numbers are odd.");
        } else {
            System.out.println("There are " + counter + " even numbers in random array");
        }
    }
}

