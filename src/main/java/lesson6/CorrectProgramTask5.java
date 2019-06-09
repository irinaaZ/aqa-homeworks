package lesson6;

/*
"5. Throw a NullPointerException from the method iCanThrowException();
Handle it in the main method.

 */

public class CorrectProgramTask5 {
    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException occurs");
        }
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }
}

