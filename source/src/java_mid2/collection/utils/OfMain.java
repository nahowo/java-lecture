package java_mid2.collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4); // 불변 컬렉션 생성
        System.out.println(list);
        Set<Integer> set = Set.of(1, 2, 3);
        System.out.println(set);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");
        System.out.println(map);
    }
}
