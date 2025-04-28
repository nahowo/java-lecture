package java_adv3.functional;

import java.util.ArrayList;
import java.util.List;

public class SideEffectListMain {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");

        System.out.println("before list: " + list1);

        changeList1(list1);

        System.out.println("after list: " + list1);

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        System.out.println("before list: " + list2);

        List<String> list = changeList2(list2);
        System.out.println("result: " + list);

        System.out.println("after list: " + list2);
    }

    private static List<String> changeList2(List<String> list2) {
        List<String> list = new ArrayList<>();
        for (String s : list2) {
            list.add(s + "_completed");
        }
        return list;
    }

    private static void changeList1(List<String> list1) {
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) + "_completed");
        }
    }
}
