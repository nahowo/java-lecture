package java_adv3.parallel;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

import static java_adv1.util.MyLogger.log;

public class ParallelMain7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "3");

        ExecutorService logicPool = Executors.newFixedThreadPool(400);

        ExecutorService es = Executors.newFixedThreadPool(100);
        int nThread = 3;
        for (int i = 1; i <= nThread; i++) {
            String requestName = "request " + i;
            es.submit(() -> {
                try {
                    logic(requestName, logicPool);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread.sleep(100);
        }
        es.close();
        logicPool.close();
    }

    private static void logic(String requestName, ExecutorService es) throws ExecutionException, InterruptedException {
        log("[" + requestName + "] start");
        long start = System.currentTimeMillis();

        List<Future<Integer>> futures = IntStream.rangeClosed(1, 4)
                .mapToObj(i -> es.submit(() -> HeavyJob.heavyTask(i, requestName)))
                .toList();

        int sum = futures.stream()
                .mapToInt(f -> {
                    try {
                        return f.get();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }).sum();

        long end = System.currentTimeMillis();
        log("time: " + (end - start) + "ms, sum: " + sum);
    }
}
