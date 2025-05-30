package java_adv1.thread.collection.simple.list;

import java.util.Arrays;

import static java_adv1.util.ThreadUtils.sleep;

public class BasicList implements SimpleList {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData; // 공유 자원
    private int size = 0;

    public BasicList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object e) {
        elementData[size] = e; // 원자적 연산이 아님
        sleep(100);
        size++;
    }

    @Override
    public Object get(int index) {
        return elementData[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + ", size: " + size;
    }
}
