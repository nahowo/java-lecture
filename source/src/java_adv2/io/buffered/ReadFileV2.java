package java_adv2.io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static java_adv2.io.buffered.BufferedConst.*;

public class ReadFileV2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long start = System.currentTimeMillis();

        byte[] buffer = new byte[BUFFER_SIZE];

        int fileSize = 0;
        int size;
        while ((size = fis.read(buffer)) != -1) {
            fileSize += size;
        }
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE);
        System.out.println("Time taken: " + (end - start) + "ms");
    }
}
