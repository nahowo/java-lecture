package java_mid1.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class ISSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println("now.isSupported(ChronoField.SECOND_OF_MINUTE) = " + now.isSupported(ChronoField.SECOND_OF_MINUTE));
//        int minute = now.get(ChronoField.SECOND_OF_MINUTE); // error
//        System.out.println("minute = " + minute);
    }
}
