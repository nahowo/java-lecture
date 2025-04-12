package java_mid2.collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("인덱스 입력: O(1)");
        arr[0] = 1;
        arr[2] = 2;
        arr[3] = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        System.out.println("인덱스 변경: O(1)");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        System.out.println("인덱스 조회: O(1)");
        System.out.println("arr[2] = " + arr[2]);
        System.out.println("");

        System.out.println("인덱스 검색: O(n)");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if (arr[i] == value) {
                idx = i;
                System.out.println("value 탐색 완료: " + idx);
                break;
            }
        }
        System.out.println("");
    }
}
