package java_mid1.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println(nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println(zdt);

        ZonedDateTime utc = zdt.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println(utc);
    }
}
