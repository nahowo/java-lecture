package java_adv3.functional;

import java.util.function.Function;

public class CompositionMain2 {
    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, String> toString = x -> "결과: " + x;

        Function<String, String> finalF = parseInt.andThen(square).andThen(toString);
        System.out.println("finalF.apply(\"5\") = " + finalF.apply("5"));

        Function<String, Integer> finalF2 = parseInt.andThen(square);
        System.out.println("finalF2.apply(\"1\") = " + finalF2.apply("1"));

    }
}
