package java_adv3.parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static java_adv1.util.MyLogger.log;

public class ParallelMain4 {
    public static void main(String[] args) {
        int processorCount = Runtime.getRuntime().availableProcessors();
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        log("processorCount: " + processorCount + ", commonPool: " + commonPool.getParallelism());

        long start = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 8)
                .parallel()
                .map(HeavyJob::heavyTask)
                .reduce(0, Integer::sum);

        long end = System.currentTimeMillis();
        log("tile: " + (end - start) + "ms, sum: " + sum);
    }
}
