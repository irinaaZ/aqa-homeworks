package lesson1;

/*
"5. Change the operations  to get the result 20:

" 1) Do not change the values.
 2) Change the operation where the variable 'result' is being calculated."

 */

public class ChangeTheOperations {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

        int result = b + d - (a + c);

        System.out.println(result);
    }
}
