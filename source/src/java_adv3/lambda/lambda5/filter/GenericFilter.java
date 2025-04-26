package java_adv3.lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> ret = new ArrayList<>();
        for (T i : list) {
            if (predicate.test(i)) {
                ret.add(i);
            }
        }
        return ret;
    }
}
