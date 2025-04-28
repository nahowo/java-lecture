package java_adv3.functional;

import java.util.function.Function;

public class SideEffectMain2 {
    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> {
            int result = x * 2;
            System.out.println("x: " + x + ", result: " + result);
            return x * 2;
        };
        func.apply(10);
        func.apply(10);
    }
}
