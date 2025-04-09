package java_mid1.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration d = Duration.ofMinutes(30);
        System.out.println(d);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println(lt);

        LocalTime plus = lt.plus(d);
        System.out.println(plus);

        LocalTime st = LocalTime.of(9, 0);
        LocalTime et = LocalTime.of(18, 0);
        Duration between = Duration.between(st, et);
        System.out.println(between.toHours());
    }
}
