package java_mid1.time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("now.plusYears(1).plusMonths(2).plusDays(3).plusHours(4) = " + now.plusYears(1).plusMonths(2).plusDays(3).plusHours(4));
    }
}
