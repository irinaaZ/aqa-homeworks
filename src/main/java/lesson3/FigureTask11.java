package lesson3;

/*
"11*. Write a program which prints the next figure to the console:
          *
         ***
        *****
       *******
      *********
     ***********
 */
public class FigureTask11 {
    public static void main(String[] args) {
        int width = 6;
        printFigure(width);
    }

    private static void printFigure(int width) {
        for (int i = 1; i < width + 1; i++) {
            for (int j = width; j > i; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < (2 * i - 1); m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

