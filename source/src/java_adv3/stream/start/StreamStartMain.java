package java_adv3.stream.start;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "berry", "tomato");

        Stream<String> stream = list.stream();
        List<String> result1 = stream
                .filter(name -> name.startsWith("b"))
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println(result1);

        for (String s : result1) {
            System.out.print(s + " ");
        }

        list.stream() // 한 번 사용한 스트림은 재사용 불가
                .filter(name -> name.startsWith("b"))
                .map(name -> name.toUpperCase())
                .forEach(s -> System.out.println());

        list.stream()
                .filter(name -> name.startsWith("b"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
