package java_adv3.stream.collectors;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Collectors1Basic {
    public static void main(String[] args) {
        Stream<String> list = Stream.of("java", "spring", "jpa");

        System.out.println(list.collect(toList()));



        System.out.println(Stream.of("java", "spring", "jpa", "java").collect(toSet()));

        TreeSet<Integer> collect = Stream.of(3, 4, 5, 1, 2).collect(toCollection(TreeSet::new));
        System.out.println("collect = " + collect);


    }
}
