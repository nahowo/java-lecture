package java_mid1.time;

import java.time.LocalDateTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime ofDt = LocalDateTime.of(2004, 2, 18, 4, 34, 10);
        System.out.println(ofDt);

        System.out.println(ofDt.toLocalDate());
        System.out.println(ofDt.toLocalTime());

        System.out.println(ofDt.plusDays(20));

        System.out.println(now.isBefore(ofDt));
        System.out.println(now.isAfter(ofDt));
        System.out.println(now.isEqual(ofDt));
    }
}
