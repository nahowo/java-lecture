package java_mid2.collection.compare;


import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser u1 = new MyUser("a", 30);
        MyUser u2 = new MyUser("b", 10);
        MyUser u3 = new MyUser("c", 20);

        TreeSet<MyUser> treeSet = new TreeSet<>();
        treeSet.add(u1);
        treeSet.add(u2);
        treeSet.add(u3);

        System.out.println(treeSet); // 기본적으로 정렬됨

        TreeSet<MyUser> treeSet1 = new TreeSet<>(new IdComparator()); // treeSet은 비교자를 생성 시에 전달해야 함
        treeSet1.add(u1);
        treeSet1.add(u2);
        treeSet1.add(u3);
        System.out.println(treeSet1);
    }
}
