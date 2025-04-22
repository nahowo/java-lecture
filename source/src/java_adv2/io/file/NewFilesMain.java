package java_adv2.io.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Date;

public class NewFilesMain {
    public static void main(String[] args) throws IOException{
        Path file = Path.of("source/temp/example.txt");
        Path directory = Path.of("source/temp/exampleDir");

        System.out.println("file exists: " + Files.exists(file));
        try {
            Files.createFile(file);
            System.out.println("File created");
        } catch (FileAlreadyExistsException e) {
            System.out.println(file + "File Already exists");
        }

        try {
            Files.createDirectories(directory);
        } catch (FileAlreadyExistsException e) {
            System.out.println(directory + " Directory already exsist");
        }

//        Files.delete(file);
//        System.out.println("file Deleted");

        System.out.println("is regular file: " + Files.isRegularFile(file));
        System.out.println("is directory: " + Files.isDirectory(directory));
        System.out.println("file name: " + file.getFileName());
        System.out.println("file size: " + Files.size(file) + " bytes");

        Path newFile = Path.of("source/temp/newExample.txt");
        Files.move(file, newFile, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("last modified: " + Files.getLastModifiedTime(newFile));

    }
}
