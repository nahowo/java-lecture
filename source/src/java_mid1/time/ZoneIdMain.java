package java_mid1.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
//        for (String zoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zoneId + " | " + ZoneId.of(zoneId).getRules());
//        }
        System.out.println(ZoneId.systemDefault());
    }
}
