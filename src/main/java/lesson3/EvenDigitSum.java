package lesson3;

/*
6. Write a method named getEvenDigitSum with one parameter of the type "int".
The method should return the sum of even digits within the number.
If the number is negative, method should return -1;
 */

public class EvenDigitSum {
    public static void main(String[] args) {
        int num = 548229;
        System.out.println(getEvenDigitSum(num));
    }

    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            char[] charValues = String.valueOf(number).toCharArray();
            int sum = 0;

            for (int i = 0; i < charValues.length; i++) {
                if (charValues[i] % 2 == 0) {
                    sum += Character.getNumericValue(charValues[i]);
                }
            }
            return sum;
        }
    }
}


