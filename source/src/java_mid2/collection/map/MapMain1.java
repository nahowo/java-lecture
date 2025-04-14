package java_mid2.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("s1", 90);
        studentMap.put("s2", 90);
        studentMap.put("s3", 80);
        studentMap.put("s4", 100);

        System.out.println(studentMap);
        System.out.println(studentMap.get("s3"));

        Set<String> keys = studentMap.keySet(); // 중복이 없음을 보장하므로 Set
        System.out.println(keys);

        Collection<Integer> values = studentMap.values(); // 중복이 있을 수 있으므로 Collection
        System.out.println(values);

        System.out.println(studentMap.entrySet());
    }
}
