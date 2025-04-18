package java_adv1.thread.collection.java;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(3, "d3");
        map.put(2, "d2");
        map.put(1, "d1");
        System.out.println(map);

        Map<Integer, String> map1 = new ConcurrentSkipListMap<>();
        map1.put(3, "d3");
        map1.put(2, "d2");
        map1.put(1, "d1");
        System.out.println(map1);
    }
}
