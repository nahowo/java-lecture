package java_adv3.stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamMain {
    public static void main(String[] args) {
        System.out.println("1. Collection");
        List<Integer> list1 = List.of(1, 2, 3);
        Stream<Integer> stream1 = list1.stream();

        System.out.println("2. 배열");
        Integer[] integers = {1, 2, 3};
        Stream<Integer> stream2 = Arrays.stream(integers);

        System.out.println("3. Stream.of()");
        Stream<Integer> stream3 = Stream.of(1, 2, 3);

        System.out.println("무한 스트림 - iterate()");
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
        infiniteStream.limit(3).forEach(System.out::println);

        System.out.println("무한 스트림 생성 - generate()");
        Stream<Double> generateRandom = Stream.generate(Math::random);
        generateRandom.limit(3).forEach(System.out::println);
    }
}
