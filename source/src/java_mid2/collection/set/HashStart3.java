package java_mid2.collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100]; // 데이터 범위가 0 ~ 99

        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[60] = 60;

        System.out.println(Arrays.toString(inputArray));

        int searchValue = 60;
        Integer ret = inputArray[searchValue];
        System.out.println("ret: " + ret);
    }
}
