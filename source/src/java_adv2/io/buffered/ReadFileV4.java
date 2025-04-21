package java_adv2.io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static java_adv2.io.buffered.BufferedConst.FILE_NAME;
import static java_adv2.io.buffered.BufferedConst.FILE_SIZE;

public class ReadFileV4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long start = System.currentTimeMillis();

        byte[] bytes = fis.readAllBytes();

        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (end - start) + "ms");
    }
}
