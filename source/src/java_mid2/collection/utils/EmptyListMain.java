package java_mid2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<Object> list3 = Collections.emptyList(); // 빈 가변 리스트
        List<Integer> list4 = List.of(); // 빈 불변 리스트

        System.out.println(list3.getClass());
        System.out.println(list4.getClass());
    }
}
