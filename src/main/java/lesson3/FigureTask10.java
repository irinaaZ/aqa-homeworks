package lesson3;

/*
"10*. Write a program which prints the next figure to the console:
**********
*           *
*           *
*           *
**********
 */

public class FigureTask10 {
    public static void main(String[] args) {
        int length = 10;
        int width = 5;

        printFigure (length,width);
    }

    private static void printFigure(int length, int width) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < width - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < length - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
