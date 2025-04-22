package java_adv2.io.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMainV1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("source/temp/copy.dat");
        FileOutputStream fos = new FileOutputStream("source/temp/copy_new.dat");
        byte[] buffer = fis.readAllBytes();
        fos.write(buffer);
        fis.close();
        fos.close();

        long end = System.currentTimeMillis();

//        System.out.println("file created: " + fileName);
//        System.out.println("file size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("time take: " + (end - start) + "ms");
    }
}
