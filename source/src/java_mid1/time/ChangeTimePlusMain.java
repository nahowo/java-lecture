package java_mid1.time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        LocalDateTime plus = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plus = " + plus);

        Period period = Period.ofYears(10);
        LocalDateTime plus1 = dt.plus(period);
        System.out.println("plus1 = " + plus1);
    }
}
