package java_adv3.stream.basic;

import java_adv3.lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class LazyEvalMain1 {
    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6);

        ex1(data);
        ex2(data);
    }

    private static void ex1(List<Integer> data) {
        System.out.println("==MyStream 시작==");
        List<Integer> result = MyStreamV3.of(data)
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("filter(): " + i + "(" + isEven + ")");
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map(): " + i + " -> " + mapped);
                    return mapped;
                })
                .toList();
        System.out.println("result = " + result);
        System.out.println("==MyStream 종료==");
    }

    private static void ex2(List<Integer> data) {
        System.out.println("==Stream API 시작==");
        List<Integer> result = data.stream()
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("filter(): " + i + "(" + isEven + ")");
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map(): " + i + " -> " + mapped);
                    return mapped;
                })
                .toList();
        System.out.println("result = " + result);
        System.out.println("==Stream API 종료==");
    }
}
