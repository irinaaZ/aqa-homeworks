package lesson3;

/*
"5. Write a function which calculates and returns the minimum of 4 arguments.

"1) Function min(int a, int b, int c, int d) should use the function
min(int a, int b)."

 */
public class MinOf4Elements {
    public static void main(String[] args) {
        int a = 698;
        int b = 5;
        int c = -965;
        int d = 0;

        System.out.println("The minimum value is: " + min(a,b,c,d));
    }

    public static int min(int a, int b, int c, int d) {
        return min(a, min(b, min(c, d)));
    }

    public static int min(int a, int b) {
        if (a < b){
            return a;
        } else {
            return b;
        }
    }
}
