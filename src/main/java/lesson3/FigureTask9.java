package lesson3;

/*
"9. Write a program which prints the next figure to the console:
*
**
***
****
*****
******
*******
 */

public class FigureTask9 {
    public static void main(String[] args) {
        int width = 7;
        printFigure(width);
    }

    private static void printFigure(int width) {
        for (int i = 0; i < width; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

