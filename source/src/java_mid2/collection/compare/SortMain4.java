package java_mid2.collection.compare;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser u1 = new MyUser("a", 30);
        MyUser u2 = new MyUser("b", 10);
        MyUser u3 = new MyUser("c", 20);

        List<MyUser> list = new LinkedList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(list);
        list.sort(null); // 기본 비교자
        System.out.println(list);
        list.sort(new IdComparator());
        System.out.println(list);
    }
}
