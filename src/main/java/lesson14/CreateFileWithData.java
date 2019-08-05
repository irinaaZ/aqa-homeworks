package lesson14;

/*
"4. Написать программу, которая создаст текстовый файл и запишет в него
список файлов (путь, имя, дата создания) из заданного каталога."
 */

import java.io.*;
import java.util.Date;

public class CreateFileWithData {
    public static void main(String[] args) {
        String fileName = "C:\\My data\\study\\task4\\fileTask4.txt";
        String folderName = "C:\\My data\\study\\task4";

        createFileWithData(fileName, folderName);
    }

    private static void createFileWithData(String fileName, String folderName) {
        File file = new File(folderName);
        File[] files = file.listFiles();
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw")) {
            randomAccessFile.setLength(0);
            for (File aFile : files) {
                if (aFile.isFile()) {
                    randomAccessFile.writeBytes("There are " + files.length + " files in " + folderName + " folder:" + "\r\n");
                    randomAccessFile.writeBytes("Path: " + aFile.getCanonicalPath() + "\r\n" + "Name: " + aFile.getName() + "\r\n"
                            + "Date: " + new Date(aFile.lastModified()).toString() + "\r\n");
                }
            }
            System.out.println("Operation was done successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

