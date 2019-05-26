package lesson1;

/*
2. Write a program which creates and initializes all primitive data types.

1) All primitives data type should be created and initialized.

There are 8 primitive data types.
 */
public class PrintPrimitiveDataTypes {
    public static void main(String[] args) {
        int number = 52600;
        byte b = 102;
        char letter = 'm';
        short sh = 15000;
        boolean bl = false;
        double db = 26.58;
        float fl = 69.65f;
        long ln = 987L;

        System.out.println("int: " + number + "\n" +
                "byte: " + b + "\n" +
                "char: " + letter + "\n" +
                "short: " + sh + "\n" +
                "boolean: " + bl + "\n" +
                "double: " + db + "\n" +
                "float: " + fl + "\n" +
                "long: " + ln);
    }
}
