package java_mid2.collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);

        System.out.println("set.add(1) = " + set.add(1));
        System.out.println("set.contains(99) = " + set.contains(99));
        System.out.println("set.contains(1) = " + set.contains(1));
        System.out.println(set);

        set.remove(14);
        set.remove(99);
        System.out.println(set);
    }
}
