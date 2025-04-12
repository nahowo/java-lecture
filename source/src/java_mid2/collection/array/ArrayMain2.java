package java_mid2.collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[2] = 2;
        arr[3] = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        // 배열의 첫 번째 위치에 추가
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        // 배열의 마지막 위치에 추가
        addLast(arr, newValue);
        System.out.println(Arrays.toString(arr));
        System.out.println("");
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
        return;
    }
}
