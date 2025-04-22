package java_adv2.io.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopyMainV3 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        Path source = Path.of("source/temp/copy.dat");
        Path target = Path.of("source/temp/copy_new.dat");

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        long end = System.currentTimeMillis();

        System.out.println("time take: " + (end - start) + "ms");
    }
}
