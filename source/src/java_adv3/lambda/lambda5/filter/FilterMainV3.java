package java_adv3.lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("list: " + numbers);
        System.out.println("even: " + filter(numbers, i -> i % 2 == 0));
        System.out.println("odd: " + filter(numbers, i -> i % 2 == 1));
    }

    static List<Integer> filter(List<Integer> list, Predicate<Integer> filtering) {
        List<Integer> ret = new ArrayList<>();
        for (Integer i : list) {
            if (filtering.test(i)) {
                ret.add(i);
            }
        }
        return ret;
    }
}
