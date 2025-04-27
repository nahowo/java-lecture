package java_adv3.methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> add1 = (x, y) -> x + y;
        BinaryOperator<Integer> add2 = (x, y) -> x + y;

        System.out.println(add1.apply(1, 2));
        System.out.println(add2.apply(1, 2));
    }
}
