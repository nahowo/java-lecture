package java_adv3.lambda.ex2;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + list);

        MyReducer addReducer = (a, b) -> a + b;
        MyReducer multiReducer = (a, b) -> a * b;

        int addRet = reduce(list, 0, addReducer);
        int mulitRet = reduce(list, 1, multiReducer);
        System.out.println("합(누적 +): " + addRet);
        System.out.println("곱(누적 *): " + mulitRet);
    }

    static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        int ret = initial;
        for (Integer i : list) {
            ret = reducer.reduce(ret, i);
        }
        return ret;
    }

    @FunctionalInterface
    static interface MyReducer {
        int reduce(int a, int b);
    }

}
