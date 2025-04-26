package java_adv3.lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "3", "4");
        Function<String, Integer> toInteger = a -> Integer.valueOf(a);
        Function<String, Integer> toLength = a -> a.length();

        System.out.println("list: " + list);
        System.out.println("toInteger: " + IntergerMap.map(list, toInteger));
        System.out.println("toLength: " + IntergerMap.map(list, toLength));

    }
}
