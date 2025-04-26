package java_adv3.lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV1Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        returnValue(numbers);
        methodChain(numbers);
    }

    private static void methodChain(List<Integer> numbers) {
        MyStreamV1 list = new MyStreamV1(numbers);
        System.out.println(list.filter(n -> n % 2 == 0).map(n -> n * 2).toList());
    }

    private static void returnValue(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        MyStreamV1 filtered = stream.filter(n -> n % 2 == 0);
        System.out.println(filtered.toList());

        MyStreamV1 mapped = filtered.map(n -> n * 2);
        System.out.println(mapped.toList());
    }
}
