package java_adv1.thread.executor.poolsize;

import java_adv1.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static java_adv1.thread.executor.ExecutorUtils.printState;
import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class PoolSizeMainV1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        ExecutorService es = new ThreadPoolExecutor(2, 2, 3000, TimeUnit.MILLISECONDS, workQueue);

        printState(es);
        es.execute(new RunnableTask("task1"));
        printState(es, "task1");

        es.execute(new RunnableTask("task2"));
        printState(es, "task2");

        es.execute(new RunnableTask("task3"));
        printState(es, "task3");

        es.execute(new RunnableTask("task4"));
        printState(es, "task4");

        try {
            es.execute(new RunnableTask("task5"));
            printState(es, "task5");
        } catch (RejectedExecutionException e) {
            log("task 실행 거절 예외 발생: " + e);
        }
        sleep(3000);
        log("== 작업 수행 완료 ==");

        sleep(3000);
        log("== maximumPoolSize 대기시간 초과 ==");
        printState(es);
        es.close();
        log("== shutdown 완료 ==");
        printState(es);
    }
}
