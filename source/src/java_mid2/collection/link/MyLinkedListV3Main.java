package java_mid2.collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> list = new MyLinkedListV3<>();
        System.out.println("==add data==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
//        list.add(100); // 불가능

        list.add("d", 1);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.remove(2);
        integerList.add(100, 1);
        System.out.println(integerList);
    }
}
