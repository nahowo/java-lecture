package java_mid1.time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("zonedDateTime1 = " + zonedDateTime1);
        System.out.println("zonedDateTime2 = " + zonedDateTime2);
    }
}
