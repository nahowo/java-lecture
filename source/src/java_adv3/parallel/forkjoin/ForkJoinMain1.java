package java_adv3.parallel.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static java_adv1.util.MyLogger.log;

public class ForkJoinMain1 {
    public static void main(String[] args) {
        List<Integer> data = IntStream.rangeClosed(1, 8)
                .boxed()
                .toList();

        log("[생성] " + data);

        long start = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool(10);
        SumTask sumTask = new SumTask(data);
        Integer sum = pool.invoke(sumTask);
        pool.close();

        long end = System.currentTimeMillis();
        log("tile: " + (end - start) + "ms, sum: " + sum);
        log("[POOL] " + pool);
    }
}
