package java_adv1.thread.collection.java;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> copySet = new CopyOnWriteArraySet<>();
        copySet.add(1);
        copySet.add(2);
        copySet.add(3);
        System.out.println(copySet);

        ConcurrentSkipListSet<Object> objects = new ConcurrentSkipListSet<>();
        objects.add(3);
        objects.add(2);
        objects.add(1);
        System.out.println(objects);
    }
}
