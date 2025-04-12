package java_mid2.collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println("==add data==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        list.add("1", 1);
        System.out.println(list);
        System.out.println("list.remove(2) = " + list.remove(2));
        System.out.println(list);
    }
}
