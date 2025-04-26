package java_adv3.lambda.lambda3;

public class GenericMain4 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        System.out.println(upperCase.apply("hello"));
        GenericFunction<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(3));
        GenericFunction<Integer, Boolean> isEven = num -> num % 2 == 0;
        System.out.println(isEven.apply(3));
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T t);
    }

}
