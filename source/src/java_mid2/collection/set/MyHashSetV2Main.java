package java_mid2.collection.set;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);

        System.out.println("set.contains('AB') = " + set.contains("AB"));
        System.out.println("set.remove('C') = " + set.remove("C"));
        set.remove("SET");
        System.out.println(set);
    }
}
