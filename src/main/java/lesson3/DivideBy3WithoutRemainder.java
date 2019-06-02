package lesson3;

/*
"2. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.
"
 */
public class DivideBy3WithoutRemainder {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

