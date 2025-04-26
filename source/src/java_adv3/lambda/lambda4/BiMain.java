package java_adv3.lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiMain {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(2, 4));

        BiConsumer<String, Integer> repeat = (c, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print(c);
            }
            System.out.println();
        };
        repeat.accept("*", 5);

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println(isGreater.test(30, 19));
    }
}
