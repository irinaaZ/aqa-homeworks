package lesson3;

import java.util.Arrays;

/*
"3. Fill the array with numbers from 100 to 0.
"
 */
public class FillArray100to1 {
    public static void main(String[] args) {
        int[] emptyArray = new int[101];

        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = 100 - i;
            }
            System.out.print(Arrays.toString(emptyArray));
        }
    }

