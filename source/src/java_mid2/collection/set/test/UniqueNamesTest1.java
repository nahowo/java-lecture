package java_mid2.collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArray = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<>();

        for (Integer i : inputArray) {
            set.add(i);
        }
        System.out.println(set);
    }

}
