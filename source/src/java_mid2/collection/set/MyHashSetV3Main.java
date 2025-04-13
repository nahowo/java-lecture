package java_mid2.collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
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

        MySet<Integer> set1 = new MyHashSetV3<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(100);

        System.out.println(set1);
    }
}
