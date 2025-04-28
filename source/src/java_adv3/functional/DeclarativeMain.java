package java_adv3.functional;

import java.util.List;

public class DeclarativeMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .toList();

        System.out.println("result = " + result);
    }
}
