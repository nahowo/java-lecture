package java_adv3.functional;

import java.util.function.Function;

public class FirstClassCitizenMain {
    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> x * 2;
        System.out.println("applyFunction(10, func) = " + applyFunction(10, func));

        System.out.println("getFunc().apply(10) = " + getFunc().apply(10));
    }

    private static Function<Integer, Integer> getFunc() {
        return p -> p * 2;
    }

    private static Integer applyFunction(int i, Function<Integer, Integer> func) {
        return func.apply(i);
    }
}
