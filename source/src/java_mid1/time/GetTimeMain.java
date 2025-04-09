package java_mid1.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 49);
        System.out.println(dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(dt.get(ChronoField.DAY_OF_WEEK));
        System.out.println(dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println(dt.get(ChronoField.SECOND_OF_DAY));
    }
}
