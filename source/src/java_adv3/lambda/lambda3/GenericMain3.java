package java_adv3.lambda.lambda3;

public class GenericMain3 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        System.out.println(upperCase.apply("hello"));
        GenericFunction<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(3));
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        T apply(R s);
    }

}
