package java_mid2.collection.set;

import java.util.Arrays;

public class HashStart4 {
    private static int CAPACITY = 10;
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[CAPACITY]; // 데이터 범위가 0 ~ 99

        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);

        System.out.println(Arrays.toString(inputArray));

        int searchValue = 14;
        Integer ret = inputArray[hashIndex(searchValue)];
        System.out.println("ret: " + ret);
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    static void add(Integer[] array, int value) {
        int hashIndex = hashIndex(value);
        array[hashIndex] = value;
    }


}
