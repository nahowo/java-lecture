package java_adv2.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class OldFileMain {
    public static void main(String[] args) throws IOException {
        File file = new File("source/temp/example.txt");
        File directory = new File("source/temp/exampleDir");

        System.out.println("file exists: " + file.exists());
        boolean created = file.createNewFile();
        System.out.println("file created: " + created);

        boolean dirCreated = directory.mkdirs();
        System.out.println("dirCreated = " + dirCreated);

//        boolean deleted = file.delete();
//        System.out.println("deleted = " + deleted);
        System.out.println("is file: " + file.isFile());
        System.out.println("is dir: " + directory.isDirectory());
        System.out.println("file name: " + file.getName());
        System.out.println("directory name: " + directory.getName());
        System.out.println("file size: " + file.length() + " bytes");

        File newFile = new File("source/temp/newExample.txt");
        boolean renamed = file.renameTo(newFile);
        System.out.println("file renamedr: " + renamed);

        long lastModified = file.lastModified();
        System.out.println("last modified: " + new Date(lastModified));
    }
}
