package lesson3;

/*
4. Given an array of 10 integers. To display the sum of all its elements except the first and last.
 */

public class SumOf10Elem {
    public static void main(String[] args) {
        int[] array = {5, 66, 89, 547, 0, 56, 8, 6, 9, 11, 36};
        int sum = 0;

        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }
            System.out.println("The sum of array elements except of he first and last is: " + sum);
        }
    }

