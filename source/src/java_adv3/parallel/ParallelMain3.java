package java_adv3.parallel;

import java.util.concurrent.*;

import static java_adv1.util.MyLogger.log;

public class ParallelMain3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        long start = System.currentTimeMillis();

        SumTask task1 = new SumTask(1, 4);
        SumTask task2 = new SumTask(5, 8);

        Future<Integer> future1 = es.submit(task1);
        Future<Integer> future2 = es.submit(task2);
        Integer i1 = future1.get();
        Integer i2 = future2.get();
        log("main 스레드 대기 완료");

        int sum = i1 + i2;

        long end = System.currentTimeMillis();
        log("time: " + (end - start) + "ms, sum: " + sum);
    }

    static class SumTask implements Callable<Integer> {
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() throws Exception {
            log("작업 시작");
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                int calculated = HeavyJob.heavyTask(i);
                sum += calculated;
            }
            result = sum;
            log("작업 완료 -> result: " + result);
            return result;
        }
    }

}
