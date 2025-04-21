package java_adv2.charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.SortedMap;

public class AvailableCharsetsMain {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
//        for (String string : charsets.keySet()) {
//            System.out.println(string);
//        }

        Charset charset1 = Charset.forName("MS949");
        System.out.println("charset1 = " + charset1);

        Charset charset2 = Charset.forName("UTF-8");
        System.out.println("charset2 = " + charset2);

        Charset utf8 = StandardCharsets.UTF_8;
        System.out.println("utf8 = " + utf8);

        Charset charset3 = Charset.defaultCharset();
        System.out.println("charset3 = " + charset3);


    }
}
