package java_adv3.lambda.lambda3;

import java.util.function.Function;

public class TargetType3 {
    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        Function<Integer, Integer> square = n -> n * n;

        System.out.println(upperCase.apply("hello world!"));
        System.out.println(square.apply(4));
    }
}
