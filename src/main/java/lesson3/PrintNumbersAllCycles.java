package lesson3;

import java.util.ArrayList;
import java.util.List;

/*
"1. Print numbers from 10 to 20 using all known cycles.
"
 */
public class PrintNumbersAllCycles {
    public static void main(String[] args) {
        int i = 10;
        int[] arrayForEach = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // while
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }

        // do while
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i <= 20);

        // for
        for (; i <= 20; i++) {
            System.out.print(i + " ");
        }

        //for each
        for (int value : arrayForEach) {
            System.out.print(value + " ");
        }
    }
}

