package java_adv3.lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class IntergerMap {
    public static List<Integer> map(List<String> list, Function<String, Integer> map) {
        List<Integer> ret = new ArrayList<>();
        for (String s : list) {
            ret.add(map.apply(s));
        }
        return ret;
    }
}
