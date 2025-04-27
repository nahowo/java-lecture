package java_adv3.stream.basic;

import java.util.List;

public class ImmutatbleMain {
    public static void main(String[] args) {
        List<Integer> original = List.of(1, 2, 3, 4);
        System.out.println("Original Before: " + original);

        List<Integer> result1 = original.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Original After: " + original);
        System.out.println("Result: " + result1);
    }
}
