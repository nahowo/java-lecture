package java_mid2.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 30_000;

        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);
        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size);

        System.out.println("\n==LinkedList 추가==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size);

        int loop = 10000;
        System.out.println("\n==ArrayList 조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("\n==LinkedList 조회==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("\n==ArrayList 검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.println("\n==LinkedList 검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endT = System.currentTimeMillis();
        System.out.println("앞 추가 소요시간: " + (endT - startT) + " ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endT = System.currentTimeMillis();
        System.out.println("중간 추가 소요시간: " + (endT - startT) + " ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i, i);
        }
        long endT = System.currentTimeMillis();
        System.out.println("뒤 추가 소요시간: " + (endT - startT) + " ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endT = System.currentTimeMillis();
        System.out.println("조회 소요시간: " + (endT - startT) + " ms");
    }

    private static void search(List<Integer> list, int loop, int value) {
        long startT = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(value);
        }
        long endT = System.currentTimeMillis();
        System.out.println("검색 소요시간: " + (endT - startT) + " ms");
    }
}
