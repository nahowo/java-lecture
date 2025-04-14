package java_mid2.collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArray = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>(List.of(inputArray));
        System.out.println(set);
    }

}
