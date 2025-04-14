package java_mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Set<String> intersection = map1.keySet();
        intersection.retainAll(map2.keySet());

        System.out.println(intersection);
        int total = 0;
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (intersection.contains(entry.getKey())) {
                total += entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (intersection.contains(entry.getKey())) {
                total += entry.getValue();
            }
        }

        System.out.println("total = " + total);
    }
}
