package lesson3;

/*
"7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
If one of the parameters is < 10, method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of two numbers."

The greatest common divisor is the largest positive integer that can fully
divide each of the integers(i.e. without living a remainder).
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int first = 200;
        int second = 400;

        System.out.println(getGreatestCommonDivisor(first, second));
    }

    private static int getGreatestCommonDivisor(int first, int second) {
        // negative values check
        if (first < 0 || second < 0) {
            return -1;
        }
        return first == 0 ? second : getGreatestCommonDivisor(second % first, first);
    }
}
