package java_adv2.io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("source/temp/hello.dat");
        byte[] input = {65, 66, 67, 68, 66,66,66};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("source/temp/hello.dat");
        byte[] bytes = fis.readAllBytes();
        System.out.println(Arrays.toString(bytes));
        fis.close();
    }
}
