package java_adv3.stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class DuplicateExecutioinMain {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println);
//        stream.forEach(System.out::println); // 런타임 오류: stream has already been operated upon( or closed)


        List<Integer> list = List.of(1, 2, 3);
        Stream<List<Integer>> stream1 = Stream.of(list); // 스트림 새로 생성
        Stream<List<Integer>> stream2 = Stream.of(list);
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }
}
