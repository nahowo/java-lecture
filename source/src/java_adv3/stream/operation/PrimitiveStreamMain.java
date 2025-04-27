package java_adv3.stream.operation;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println();
        IntStream range = IntStream.range(1, 6);
        range.forEach(i -> System.out.print(i + " "));
        System.out.println();


        System.out.println(IntStream.of(1, 2, 3, 4, 5).sum());
        System.out.println(IntStream.of(1, 2, 3, 4, 5).average().getAsDouble());
        System.out.println(IntStream.of(1, 2, 3, 4, 5).summaryStatistics());
        System.out.println(IntStream.of(1, 2, 3, 4, 5).asLongStream());
        System.out.println(IntStream.of(1, 2, 3, 4, 5).asDoubleStream());
        System.out.println(IntStream.of(1, 2, 3, 4, 5).boxed());

        LongStream longStream = IntStream.range(1, 6)
                .mapToLong(i -> i * 10L);

        DoubleStream doubleStream = IntStream.range(1, 6)
                .mapToDouble(i -> i * 1.5);

        Stream<String> stringStream = IntStream.range(1, 6)
                .mapToObj(i -> "number " + i);

        IntStream intStream1 = Stream.of(1, 2, 3, 4, 5).mapToInt(i -> i);
        System.out.println(intStream1.sum());


    }
}
