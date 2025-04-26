package java_adv3.lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GenericMap {
    public static<R, T> List<R> map(List<T> list, Function<T, R> map) {
        List<R> ret = new ArrayList<>();
        for (T s : list) {
            ret.add(map.apply(s));
        }
        return ret;
    }
}
