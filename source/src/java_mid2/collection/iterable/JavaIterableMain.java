package java_mid2.collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        printAll(list.iterator());
        forEach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

//        printAll(set.iterator());
        forEach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void forEach(Iterable<Integer> iterable) {
        System.out.println("iterable: " + iterable.getClass());
        for (Integer integer : iterable) {
            System.out.println(integer);
        }
    }
}
