package lesson2;

public class EvensRangePrinter {
    public static void main(String[] args) {
        int first = 1;
        int last = 30;
        if (first <= last) {
            if (first % 2 != 0) {
                first = first + 1;
            }
            while (first <= last) {
                System.out.print (first + " ");
                first = first + 2;
            }
        }
    }
}
