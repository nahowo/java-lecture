package java_basic.memory.ex;

import static java_basic.memory.ex.MathArraryUtils.*;

public class MathArraryUtilsMain {
    public static void main(String[] args) {
        int[] values = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(sum(values));
        System.out.println(average(values));
        System.out.println(min(values));
        System.out.println(max(values));
    }
}
