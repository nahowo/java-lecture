package java_mid2.collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        run(hashSet); // 순서 보장 X
        run(linkedHashSet); // 순서 보장
        run(treeSet); // 데이터 값 기준 정렬
    }

    private static void run(Set<String> set) {
        System.out.println("set: " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
    }
}
