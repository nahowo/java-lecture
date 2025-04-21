package java_adv2.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static java_adv2.io.buffered.BufferedConst.FILE_NAME;
import static java_adv2.io.buffered.BufferedConst.FILE_SIZE;

public class ReadFileV3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis);
        long start = System.currentTimeMillis();

        int fileSize = 0;
        int data;
        while ((data = bis.read()) != -1) {
            fileSize ++;
        }
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE);
        System.out.println("Time taken: " + (end - start) + "ms");
    }
}
