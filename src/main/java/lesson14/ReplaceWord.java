package lesson14;

/*
1. Написать программу, которая считает текстовый файл, заменит в нем все слова
“Hello” на “1234” и запишет изменения в тот-же файл.
 */

import java.io.*;

public class ReplaceWord {
    public static void main(String[] args) {
        replaceWordInFile("C:\\My data\\study\\fileForTask1.txt", "Hello", "1234");
    }

    private static void replaceWordInFile(String path, String wordOldReplace, String wordNewReplace) {
        File file = new File(path);
        try (StringWriter stringWriter = new StringWriter()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                while (bufferedReader.ready()) {
                    stringWriter.write(bufferedReader.readLine().replaceAll(wordOldReplace, wordNewReplace) + "\r\n");
                }
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                bufferedWriter.write(stringWriter.toString());
            }
            System.out.println("Word " + wordOldReplace + " was replaced to " + wordNewReplace);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
