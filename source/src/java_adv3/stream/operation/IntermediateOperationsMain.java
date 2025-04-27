package java_adv3.stream.operation;

import java.util.Comparator;
import java.util.List;

public class IntermediateOperationsMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        numbers.stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        numbers.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        numbers.stream()
                .peek(n -> System.out.print("before: " + n + ", "))
                .map(n -> n * n)
                .peek(n -> System.out.print("after: " + n + ", "))
                .limit(5)
                .forEach(n -> System.out.println(n + " "));
        System.out.println();

        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        numbers.stream()
                .skip(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        list.stream()
                .takeWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        list.stream()
                .dropWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();


    }
}
