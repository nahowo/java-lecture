package java_adv1.thread.collection.simple.list;

import java.util.Arrays;

import static java_adv1.util.ThreadUtils.sleep;

public class SyncList implements SimpleList {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData; // 공유 자원
    private int size = 0;

    public SyncList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public synchronized int size() {
        return size;
    }

    @Override
    public synchronized void add(Object e) {
        elementData[size] = e; // 원자적 연산이 아님
        sleep(100);
        size++;
    }

    @Override
    public synchronized Object get(int index) {
        return elementData[index];
    }

    @Override
    public synchronized String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + ", size: " + size;
    }
}
