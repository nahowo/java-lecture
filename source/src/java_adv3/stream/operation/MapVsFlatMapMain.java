package java_adv3.stream.operation;

import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMapMain {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        System.out.println(list);

        List<Stream<Integer>> list1 = list.stream()
                .map(l -> l.stream())
                .toList();
        System.out.println(list1);

        List<Integer> list2 = list.stream()
                .flatMap(l -> l.stream())
                .toList();
        System.out.println(list2);
    }
}
