package java_adv3.functional;

import java.util.function.Function;

public class CompositionMain1 {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = x -> x * x;
        Function<Integer, Integer> func2 = x -> x + 1;

        Function<Integer, Integer> compose = func1.compose(func2);
        System.out.println("compose.apply(2) = " + compose.apply(2));

        Function<Integer, Integer> andThen = func2.andThen(func1);
        System.out.println("andThen.apply(4) = " + andThen.apply(4));
    }
}
