package java_mid2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Collections.max(list) = " + Collections.max(list));
        System.out.println("Collections.min(list) = " + Collections.min(list));

        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
