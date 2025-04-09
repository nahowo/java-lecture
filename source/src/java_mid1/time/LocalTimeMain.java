package java_mid1.time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        LocalTime ofTime = LocalTime.of(7, 18, 31);
        System.out.println(ofTime);
        System.out.println(ofTime.plusMinutes(12));
    }
}
