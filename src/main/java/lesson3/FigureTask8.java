package lesson3;

/*
"8. Write a program which prints the next figure to the console:
**********
**********
**********
**********
 */

public class FigureTask8 {
    public static void main(String[] args) {
        int length = 10;
        int width = 4;

        printFigure(length, width);
    }

    private static void printFigure(int length, int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
