package java_mid2.collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("==add data==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("\n==use function==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z') = " + list.set(2, 'z'));
        System.out.println(list);

        System.out.println("==capacity exceed"); // 데이터가 제한 크기 이상으로 들어오면 ArrayListOutOfBoundsException 발생
        list.add("d");
        list.add("e");
        list.add("f");
    }
}
