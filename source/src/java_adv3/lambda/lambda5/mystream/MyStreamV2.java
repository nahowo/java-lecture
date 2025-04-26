package java_adv3.lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV2 {
    private List<Integer> internalList;

    private MyStreamV2(List<Integer> internalList) {
        this.internalList = internalList;
    }

    public static MyStreamV2 of(List<Integer> internalList) {
        return new MyStreamV2(internalList);
    }

    public MyStreamV2 filter(Predicate<Integer> predicate) {
        List<Integer> ret = new ArrayList<>();
        for (Integer i : internalList) {
            if (predicate.test(i)) {
                ret.add(i);
            }
        }
        return new MyStreamV2(ret);
    }

    public MyStreamV2 map(Function<Integer, Integer> mapper) {
        List<Integer> ret = new ArrayList<>();
        for (Integer i : internalList) {
            ret.add(mapper.apply(i));
        }
        return new MyStreamV2(ret);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
