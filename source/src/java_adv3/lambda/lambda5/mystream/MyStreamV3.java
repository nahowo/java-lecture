package java_adv3.lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV3<T> {
    private List<T> internalList;

    public MyStreamV3(List<T> internalList) {
        this.internalList = internalList;
    }
    public static <T> MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3<>(internalList);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate) {
        List<T> ret = new ArrayList<>();
        for (T i : internalList) {
            if (predicate.test(i)) {
                ret.add(i);
            }
        }
        return MyStreamV3.of(ret);
    }

    public <R> MyStreamV3<R> map(Function<T, R> mapper) {
        List<R> ret = new ArrayList<>();
        for (T i : internalList) {
            ret.add(mapper.apply(i));
        }
        return MyStreamV3.of(ret);
    }

    public List<T> toList() {
        return internalList;
    }

    public void forEach(Consumer<T> consumer) {
        for (T t : internalList) {
            consumer.accept(t);
        }
    }

    public T getFirst() {
        return internalList.get(0);
    }
}
