package java_mid2.collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData; // 생성자 사용 시점(런타임)에 타입 이레이저에 의해 제네릭 정보 삭제 -> 생성자 사용 불가능
    private int size = 0;

    public MyArrayListV4() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        if (size == elementData.length) {
            grow(); // capacity 2배로 증가
        }
        elementData[size] = e;
        size ++;
    }

    public void add(E e, int index) {
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

    public E remove(int index) {
        E o = get(index);
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

    public E get(int index) {
        return (E) elementData[index]; // 제네릭이 입력받은 E 타입으로 변환해주기 때문에 다운캐스팅에서 문제가 생기지 않음(들어오는 모든 데이터가 E 타입이라고 보장되었을 때만!)
    }

    public E set(int index, E element) {
        E o = get(index);
        elementData[index] = element;
        return o;
    }

    public int indexOf(E o) {
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
