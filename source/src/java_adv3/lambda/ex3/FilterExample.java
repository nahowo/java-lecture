package java_adv3.lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + list);

        Predicate<Integer> negative = (i) -> i < 0;
        Predicate<Integer> even = (i) -> i % 2 == 0;

        System.out.println("음수만: " + filter(list, negative));
        System.out.println("짝수만: " + filter(list, even));
    }

    static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> ret = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                ret.add(i);
            }
        }
        return ret;
    }
}
