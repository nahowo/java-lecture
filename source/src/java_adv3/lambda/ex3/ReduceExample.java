package java_adv3.lambda.ex3;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + list);

        BinaryOperator<Integer> addReducer = (a, b) -> a + b;
        BinaryOperator<Integer> multiReducer = (a, b) -> a * b;

        int addRet = reduce(list, 0, addReducer);
        int mulitRet = reduce(list, 1, multiReducer);
        System.out.println("합(누적 +): " + addRet);
        System.out.println("곱(누적 *): " + mulitRet);
    }

    static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> reducer) {
        int ret = initial;
        for (Integer i : list) {
            ret = reducer.apply(ret, i);
        }
        return ret;
    }

    @FunctionalInterface
    static interface MyReducer {
        int reduce(int a, int b);
    }

}
