package java_mid2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        ArrayList<Integer> mutableList = new ArrayList<>(list); // 가변으로 변경
        System.out.println(mutableList);


        List<Integer> immutableList = Collections.unmodifiableList(mutableList);
//        System.out.println(immutableList.add(1)); // runtime exception
    }
}
