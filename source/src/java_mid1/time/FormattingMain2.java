package java_mid1.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(1024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));

        String dts = "1902-12-30 11:20:14";
        System.out.println(LocalDateTime.parse(dts, formatter));
    }
}
