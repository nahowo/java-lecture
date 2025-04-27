package java_adv3.methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV3 {
    public static void main(String[] args) {
        BinaryOperator<Integer> add1 = MethodRefStartV3::add; // (x, y) -> x + y와 동일
        BinaryOperator<Integer> add2 = MethodRefStartV3::add;

        System.out.println(add1.apply(1, 2));
        System.out.println(add2.apply(1, 2));
    }

    static int add(int x, int y) {
        return x + y;
    }
}
