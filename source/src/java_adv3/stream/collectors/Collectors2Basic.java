package java_adv3.stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Collectors2Basic {
    public static void main(String[] args) {
        Stream<String> list = Stream.of("apple", "banana", "tomato");

        Map<String, Integer> map1 = Stream.of("apple", "banana", "tomato")
                .collect(toMap(
                        name -> name,
                        name -> name.length()));

        System.out.println("map1 = " + map1);

        Map<String, Integer> map2 = Stream.of("apple", "banana", "tomato", "apple")
                .collect(toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVal, newVal) -> oldVal + newVal));
        System.out.println("map2 = " + map2);

        Map<String, Integer> map3 = Stream.of("apple", "banana", "tomato", "apple")
                .collect(toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVal, newVal) -> oldVal + newVal,
                        LinkedHashMap::new));
        System.out.println("map3 = " + map3);
    }
}
