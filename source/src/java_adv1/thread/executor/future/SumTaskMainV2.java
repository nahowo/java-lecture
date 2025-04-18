package java_adv1.thread.executor.future;

import java.util.concurrent.*;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class SumTaskMainV2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        log("start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        ExecutorService es = Executors.newFixedThreadPool(2);

        long start = System.currentTimeMillis();
        Future<Integer> future1 = es.submit(task1); // 여기는 블로킹 아님
        Future<Integer> future2 = es.submit(task2);

        log("Future.get() - main 스레드가 thread1, thread2 종료까지 대기");
        Integer int1 = future1.get(); // 여기에서 블로킹
        long end1 = System.currentTimeMillis();
        Integer int2 = future2.get();
        long end2 = System.currentTimeMillis();
        log("main 스레드 대기 완료");

        log("== 대기시간 ==");
        log("Thread1: " + (end1 - start) + "ms"); // thread1: 2초
        log("Thread2: " + (end2 - start) + "ms"); // thread2: 2초
        System.out.println();
        
        log("task1.result = " + int1);
        log("task2.result = " + int2);
        int sum = int1 + int2;
        log("sum = " + sum);

        es.shutdown();
        log("end");
    }

    static class SumTask implements Callable<Integer> {
        private int start;
        private int end;

        public SumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Integer call() {
            log("작업 시작");
            sleep(2000);
            int result = 0;
            for (int i = start; i <= end; i++) {
                result += i;
            }
            log("작업 완료; result = " + result);
            return result;
        }
    }
}
