package java_mid2.collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> list = new MyArrayListV4<>();
        System.out.println("==add data==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
//        list.add(100); // 불가능

        MyArrayListV4<Integer> list2 = new MyArrayListV4<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println(list2);
    }
}
