package java_mid1.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalenderPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        LocalDate fd = LocalDate.of(year, month, 1);
        LocalDate fdn = fd.plusMonths(1);

        int offset = fd.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i = 0; i < offset; i++) {
            System.out.print("   ");
        }
        LocalDate dayIter = fd;
        while (dayIter.isBefore(fdn)) {
            System.out.printf("%2d ", dayIter.getDayOfMonth());
            if (dayIter.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.print("\n");
            }
            dayIter = dayIter.plusDays(1);
        }
    }
}
