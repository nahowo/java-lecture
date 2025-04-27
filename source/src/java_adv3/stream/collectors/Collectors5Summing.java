package java_adv3.stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors5Summing {
    public static void main(String[] args) {
        Long count1 = Stream.of(1, 2, 3)
                .collect(Collectors.counting());

        System.out.println("count1 = " + count1);

        Long count2 = Stream.of(1, 2, 3)
                .count();
        System.out.println("count2 = " + count2);


        Double collect = Stream.of(1, 2, 3)
                .collect(Collectors.averagingInt(i -> i));
        System.out.println("collect = " + collect);

        IntSummaryStatistics collect1 = Stream.of("apple", "banana", "tomato")
                .collect(Collectors.summarizingInt(String::length));
        System.out.println("collect1 = " + collect1);
    }
}
