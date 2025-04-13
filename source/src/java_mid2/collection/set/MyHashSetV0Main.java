package java_mid2.collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        System.out.println("set.add(1) = " + set.add(1));
        System.out.println("set.contains(99) = " + set.contains(99));
        System.out.println("set.contains(1) = " + set.contains(1));
    }
}
