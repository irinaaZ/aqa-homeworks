package lesson1;

import java.util.ArrayList;

/*
Write a program which prints "Hello world" to the console using methods transformIntToChar and printList only.
"1) Do not create new methods.
2) Do not use System.out.print() and System.out.println() methods."

"1) Read about ASCII;
2) Read about methods with variable arguments."
 */
public class HelloWorldAdvanced {
    public static void main(String[] args) {
        int [] values = {72,101,108,108,111,32,119,111,114,108,100};
        printList(transformIntToChar(values));

    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }
}
