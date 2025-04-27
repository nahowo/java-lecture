package java_adv3.stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList()));

        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .toList());

        System.out.println(Arrays.toString(list.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new)));

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(obj -> System.out.print(obj + " "));
        System.out.println();

        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .count());

        Optional<Integer> reduce1 = list.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a + b);
        System.out.println(reduce1.get());

        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .min(Integer::compareTo).get());

        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo).get());

        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .findFirst().get());

        System.out.println(list.stream()
                .anyMatch(n -> n % 2 == 0));

        System.out.println(list.stream()
                .allMatch(n -> n > 0));

        System.out.println(list.stream()
                .noneMatch(n -> n < 0));
    }
}
