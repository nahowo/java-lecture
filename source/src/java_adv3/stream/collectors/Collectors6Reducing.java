package java_adv3.stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors6Reducing {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d");

        String s = list.stream()
                .collect(Collectors.reducing(
                        (s1, s2) -> s1 + ", " + s2
                )).get();
        System.out.println(s);

        String s3 = list.stream()
                .reduce((s1, s2) -> s1 + ", " + s2).get();
        System.out.println("s3 = " + s3);

        String collect = list.stream()
                .collect(Collectors.joining());
        System.out.println("collect = " + collect);
    }
}
