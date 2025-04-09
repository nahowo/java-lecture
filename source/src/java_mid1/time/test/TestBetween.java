package java_mid1.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate sd = LocalDate.of(2024, 1, 1);
        LocalDate ed = LocalDate.of(2024, 11, 11);
        Period between = Period.between(sd, ed);
        System.out.println("between = " + between);
        long between1 = ChronoUnit.DAYS.between(sd, ed);
        System.out.println("D - " + between1);
    }
}
