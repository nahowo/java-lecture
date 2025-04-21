package java_adv2.io.buffered;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static java_adv2.io.buffered.BufferedConst.FILE_NAME;
import static java_adv2.io.buffered.BufferedConst.FILE_SIZE;

public class ReadFileV1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long start = System.currentTimeMillis();

        int fileSize = 0;
        int data;
        while ((data = fis.read()) != -1) {
            fileSize ++;
        }
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE);
        System.out.println("Time taken: " + (end - start) + "ms");
    }
}
