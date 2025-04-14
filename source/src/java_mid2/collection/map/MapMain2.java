package java_mid2.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("s1", 90);
        studentMap.put("s1", 100); // 같은 키로 put()시 기존 값 교체

        System.out.println(studentMap);

        System.out.println(studentMap.containsKey("s1"));

        studentMap.put("s2", 90);
        studentMap.remove("s2");
        System.out.println(studentMap);

        studentMap.putIfAbsent("s1", 50); // key가 없을 때만 put
        studentMap.putIfAbsent("s2", 90);
        System.out.println(studentMap);

    }
}
