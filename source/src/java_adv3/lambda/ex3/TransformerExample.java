package java_adv3.lambda.ex3;

import java.util.function.Function;

public class TransformerExample {
    public static void main(String[] args) {
        Function<String, String> toUpper = (str) -> str.toUpperCase();
        Function<String, String> addDeco = (str) -> "**" + str + "**";
        Function<String, String> result = compose(addDeco, toUpper);
        System.out.println(result.apply("hello"));
    }

    static Function<String, String> compose(Function<String, String> f1, Function<String, String> f2) {
        return (str) -> f1.apply(f2.apply(str));
    }
}
