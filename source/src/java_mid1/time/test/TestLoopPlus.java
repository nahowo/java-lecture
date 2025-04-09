package java_mid1.time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            LocalDate nd = now.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println(nd);
        }
    }
}
