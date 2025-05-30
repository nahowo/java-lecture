package java_mid1.time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println(now);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println(offsetDateTime);
    }
}
