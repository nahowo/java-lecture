package java_mid1.time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        ChronoField[] value = ChronoField.values();
//        for (ChronoField chronoField : value) {
//            System.out.println(chronoField + " " + chronoField.range());
//        }
        System.out.println("ChronoField.MONTH_OF_YEAR.range() = " + ChronoField.DAY_OF_MONTH.range());
    }
}
