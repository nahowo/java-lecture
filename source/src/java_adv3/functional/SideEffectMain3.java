package java_adv3.functional;

import java.util.function.Function;

public class SideEffectMain3 {
    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> x * 2;
        System.out.println("func.apply(10) = " + func.apply(10));
        System.out.println("func.apply(10) = " + func.apply(10));
    }
}
