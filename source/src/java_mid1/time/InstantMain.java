package java_mid1.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println(from);

        Instant epochStart = Instant.ofEpochSecond(8);
        System.out.println(epochStart);

        Instant later = epochStart.plusSeconds(3600);
        System.out.println(later);
    }
}
