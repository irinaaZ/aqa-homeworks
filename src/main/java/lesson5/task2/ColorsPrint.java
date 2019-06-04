package lesson5.task2;

/*
2. Create ENUM and print.
 */

import java.util.EnumSet;

public class ColorsPrint {
    public static void main(String[] args) {

        for (Colors color : Colors.values()) {
            System.out.print(color + " ");
        }
    }
}
