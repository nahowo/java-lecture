package java_mid1.time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        LocalDate ofDate = LocalDate.of(2014, 9, 30);
        System.out.println(ofDate);

        ofDate = ofDate.plusDays(10);
        System.out.println(ofDate);
    }
}
