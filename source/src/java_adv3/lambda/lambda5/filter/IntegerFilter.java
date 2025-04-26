package java_adv3.lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IntegerFilter {
    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> ret = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                ret.add(i);
            }
        }
        return ret;
    }
}
