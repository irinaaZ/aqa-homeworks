package lesson6.task1;

/*
1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception
 */

public class ExceptionTask1 {
    public static void main(String[] args) throws MyException {
        int number = 0;

        ExceptionTask1 exceptionTask1 = new ExceptionTask1();
        exceptionTask1.checkNumber(number);
    }

    public void checkNumber(int n) throws MyException {
        try {
            if (n < 0) {
                System.out.println("Number < 0");
            } else if (n > 0) {
                System.out.println("Number > 0");
            } else if (n == 0) {
                throw new MyException();
            }
        } catch (MyException myExc) {
            System.out.println("My Exception was catched");
        }
    }
}
