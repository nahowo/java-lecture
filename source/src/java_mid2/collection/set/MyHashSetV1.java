package java_mid2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 10;
    private LinkedList<Integer>[] buckets;
    private int size = 0;
    private int CAPACITY = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        this.buckets = new LinkedList[DEFAULT_INITIAL_CAPACITY];
        initBuckets(DEFAULT_INITIAL_CAPACITY);
    }
    public MyHashSetV1(int capacity) {
        this.buckets = new LinkedList[capacity];
        CAPACITY = capacity;
        initBuckets(capacity);
    }

    private void initBuckets(int capacity) {
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashIndex(int value) {
        return value % CAPACITY;
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size ++;
        return true;
    }

    public boolean contains(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean ret = bucket.remove(Integer.valueOf(value)); // LinkedList의 remove는 remove(int i), remove(Object o)로 두 가지가 있다. 이때 int값을 전달하면 해당 인덱스 값을 삭제하기 때문에 래퍼 타입으로 변환해 제거해야 값이 정상적으로 제거된다.
        if (!ret) {
            return false;
        }
        size --;
        return true;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "elementData=" + Arrays.toString(buckets) +
                ", size=" + size +
                '}';
    }
}
