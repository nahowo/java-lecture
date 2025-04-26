package java_adv3.lambda.lambda5.mystream;

import java_adv3.lambda.lambda5.filter.GenericFilter;
import java_adv3.lambda.lambda5.map.GenericMap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex1_Number {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(direct(numbers));
        System.out.println(lambda(numbers));
    }

    public static List<Integer> direct(List<Integer> list) {
        List<Integer> ret = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                ret.add(i * 2);
            }
        }
        return ret;
    }

    public static List<Integer> lambda(List<Integer> list) {
        Predicate<Integer> even = a -> a % 2 == 0;
        Function<Integer, Integer> multi2 = a -> a * 2;
        List<Integer> evenNumbers = GenericFilter.filter(list, even);
        List<Integer> sumNumbers = GenericMap.map(evenNumbers, multi2);
        return sumNumbers;
    }
}
