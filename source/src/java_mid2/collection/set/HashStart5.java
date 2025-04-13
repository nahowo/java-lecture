package java_mid2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    private static int CAPACITY = 10;
    public static void main(String[] args) {
        // 초기화
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; // 데이터 범위가 0 ~ 99
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) { // 각 원소에 빈 LinkedList 생성
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = " + Arrays.toString(buckets));

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        System.out.println("contains(buckets, 14) = " + contains(buckets, 14));
        System.out.println("contains(buckets, 30) = " + contains(buckets, 30));
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(value)) { // set 자료구조이므로 중복 허용 X, 최악의 경우 시간복잡도 O(n)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }
}
