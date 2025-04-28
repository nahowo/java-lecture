package java_adv3.parallel;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

import static java_adv1.util.MyLogger.log;

public class ParallelMain6 {
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

        Future<Integer> f1 = es.submit(() -> HeavyJob.heavyTask(1, requestName));
        Future<Integer> f2 = es.submit(() -> HeavyJob.heavyTask(2, requestName));
        Future<Integer> f3 = es.submit(() -> HeavyJob.heavyTask(3, requestName));
        Future<Integer> f4 = es.submit(() -> HeavyJob.heavyTask(4, requestName));
        int sum = f1.get() + f2.get() + f3.get() + f4.get();

        long end = System.currentTimeMillis();
        log("time: " + (end - start) + "ms, sum: " + sum);
    }
}
