package java_adv3.parallel;

import java.util.stream.IntStream;

import static java_adv1.util.MyLogger.log;

public class ParallelMain1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 8)
                .map(HeavyJob::heavyTask)
                .reduce(0, Integer::sum);

        long end = System.currentTimeMillis();
        log("tile: " + (end - start) + "ms, sum: " + sum);
    }
}
