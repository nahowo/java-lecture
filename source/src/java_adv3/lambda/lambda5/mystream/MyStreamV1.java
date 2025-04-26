package java_adv3.lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV1 {
    private List<Integer> internalList;

    public MyStreamV1(List<Integer> internalList) {
        this.internalList = internalList;
    }

    public MyStreamV1 filter(Predicate<Integer> predicate) {
        List<Integer> ret = new ArrayList<>();
        for (Integer i : internalList) {
            if (predicate.test(i)) {
                ret.add(i);
            }
        }
        return new MyStreamV1(ret);
    }

    public MyStreamV1 map(Function<Integer, Integer> mapper) {
        List<Integer> ret = new ArrayList<>();
        for (Integer i : internalList) {
            ret.add(mapper.apply(i));
        }
        return new MyStreamV1(ret);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
