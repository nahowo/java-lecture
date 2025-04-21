package java_adv2.io.text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;
import static java_adv2.io.text.TextConst.FILE_NAME;

public class ReaderWriterMainV1 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        byte[] bytes = writeString.getBytes(UTF_8);
        System.out.println("write String:" + writeString);
        System.out.println("write Bytes: " + Arrays.toString(bytes));

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        fos.write(bytes);
        fos.close();

        FileInputStream fis = new FileInputStream(FILE_NAME);
        byte[] readBytes = fis.readAllBytes();
        fos.close();

        String string = new String(readBytes, UTF_8);
        System.out.println("read Bytes: " + Arrays.toString(readBytes));
        System.out.println("read String: " + string);
    }
}
