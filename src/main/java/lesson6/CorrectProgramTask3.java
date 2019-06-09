package lesson6;

/*
"3. Finish the program to handle all the possible exceptions:
Print the cause of the exception to the console."
 */

public class CorrectProgramTask3 {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        } catch (ArithmeticException ex) {
            System.out.println("The message is " + ex.getMessage() + "; The cause is " + ex.getCause());
        }
    }
}
