package java_adv1.thread.executor.poolsize;

import java_adv1.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static java_adv1.thread.executor.ExecutorUtils.printState;
import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class PoolSizeMainV4 {
//    static final int TASK_SIZE = 1100; // 일반
//    static final int TASK_SIZE = 1200; // 긴급
    static final int TASK_SIZE = 1201; // 거절
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(100, 200, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));

        log("pool 생성");
        long s = System.currentTimeMillis();
        printState(es);
        for (int i = 1; i <= TASK_SIZE; i++) {
            String taskName = "task " + i;
            try {
                es.execute(new RunnableTask(taskName));
                printState(es, taskName);
            } catch (RejectedExecutionException e) {
                log(taskName + " -> " + e);
            }
        }

        es.close();

        long e = System.currentTimeMillis();
        log("종료");
        log("duration: " + (e - s) + "ms");
    }
}
