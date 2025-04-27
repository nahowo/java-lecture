package java_adv3.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Collectors4MinMax {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);

        Integer max = list1.stream()
                .collect(Collectors.maxBy((i1, i2) -> i1.compareTo(i2))).get();
        System.out.println("collect = " + max);

        Integer min = list1.stream()
                .collect(Collectors.maxBy((i1, i2) -> i2.compareTo(i1))).get();
        System.out.println("collect = " + min);
    }
}
