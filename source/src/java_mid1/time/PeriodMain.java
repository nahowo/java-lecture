package java_mid1.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println(period);

        LocalDate cD = LocalDate.of(2030, 1, 1);
        LocalDate plus = cD.plus(period);
        System.out.println(plus);

        LocalDate sd = LocalDate.of(2025, 4, 4);
        LocalDate ed = LocalDate.of(2025, 4, 9);
        Period between = Period.between(sd, ed);
        System.out.println(between.getDays());
    }
}
