package java_mid2.collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 30_000;

        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size);

        int loop = 10000;
        System.out.println("\n==MyArrayList 조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("\n==MyArrayList 검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);


        System.out.println("\n==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);

        System.out.println("\n==MyLinkedList 조회==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("\n==MyLinkedList 검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i, 0);
        }
        long endT = System.currentTimeMillis();
        System.out.println("앞 추가 소요시간: " + (endT - startT) + " ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i, i / 2);
        }
        long endT = System.currentTimeMillis();
        System.out.println("중간 추가 소요시간: " + (endT - startT) + " ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i, i);
        }
        long endT = System.currentTimeMillis();
        System.out.println("뒤 추가 소요시간: " + (endT - startT) + " ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endT = System.currentTimeMillis();
        System.out.println("조회 소요시간: " + (endT - startT) + " ms");
    }

    private static void search(MyList<Integer> list, int loop, int value) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(value);
        }
        long endT = System.currentTimeMillis();
        System.out.println("검색 소요시간: " + (endT - startT) + " ms");
    }
}
