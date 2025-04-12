package java_mid2.collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if (size == elementData.length) {
            grow(); // capacity 2배로 증가
        }
        elementData[size] = e;
        size ++;
    }

    public void add(Object e, int index) {
        if (size == elementData.length) {
            grow(); // capacity 2배로 증가
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size ++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i >= index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    public Object remove(int index) {
        Object o = get(index);
        shiftLeftFrom(index);
        elementData[size] = null;
        size --;
        return o;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object o = get(index);
        elementData[index] = element;
        return o;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + ", size = " + size + ", capacity = " + elementData.length;
    }
}
