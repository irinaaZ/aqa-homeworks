package lesson6.task2;

/*
"2. Fix the method with try-catch to get the correct result of division:
 */

public class CorrectDivision {
    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Division on zero!");
        }
        return 0;
    }
}
