package lesson14;

/*
"3. Написать программу для копирования всех файлов из одного каталога в
другой."
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFilesIntoFolder {
    public static void main(String[] args) {
        Path initFolder = Paths.get("C:\\My data\\study\\task3");
        Path destFolder = Paths.get("C:\\My data\\study\\task3_final");

        copyFilesToAnotherDirectory(initFolder, destFolder);
    }

    private static void copyFilesToAnotherDirectory(Path initFolder, Path destFolder) {
        try {
            for (Path path : Files.newDirectoryStream(initFolder))
                Files.copy(path, destFolder.resolve(path.getFileName()));
            System.out.println("Files were copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
