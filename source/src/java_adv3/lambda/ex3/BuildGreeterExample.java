package java_adv3.lambda.ex3;

import java.util.function.Function;

public class BuildGreeterExample {
    public static void main(String[] args) {
        Function<String, String> helloFunction = buildGreeter("Hello");
        Function<String, String> hiFunction = buildGreeter("Hi");
        System.out.println(helloFunction.apply("java"));
        System.out.println(hiFunction.apply("Lambda"));
    }

    static Function<String, String> buildGreeter(String greeting) {
        return (str) -> greeting + ", " + str;
    }
}