package java_adv3.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors3Group {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "tomato", "avocado", "blueberry", "cherry");

        Map<String, List<String>> g1 = list.stream()
                .collect(Collectors.groupingBy(name -> name.substring(0, 1)));
        System.out.println("g1 = " + g1);

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> collect = list1.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("collect = " + collect);


    }
}
