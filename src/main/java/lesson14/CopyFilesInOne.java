package lesson14;

/*
2. Написать программу, которая скопирует несколько файлов в один.
 */

import java.io.*;

public class CopyFilesInOne {
    public static void main(String[] args) {
        String fileForCopy1Path = "C:\\My data\\study\\task2\\fileForTask2 - 1.txt";
        String fileForCopy2Path = "C:\\My data\\study\\task2\\fileForTask2 - 2.txt";

        String fileFinalPath = "C:\\My data\\study\\task2\\fileForTask2.txt";

        File[] files = new File[2];
        files[0] = new File(fileForCopy1Path);
        files[1] = new File(fileForCopy2Path);

        File fileFinal = new File(fileFinalPath);

        copyFilesIntoOne(files, fileFinal);
    }

    private static void copyFilesIntoOne(File[] files, File fileFinal) {
        try (FileWriter fileWriter = new FileWriter(fileFinal, true)) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                for (File file : files) {
                    System.out.println("copying: " + file.getName());
                    try (FileInputStream fileInputStream = new FileInputStream(file)) {
                        try (BufferedReader in = new BufferedReader(new InputStreamReader(fileInputStream))) {

                            String line;
                            while ((line = in.readLine()) != null) {
                                bufferedWriter.write(line);
                                bufferedWriter.newLine();
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

