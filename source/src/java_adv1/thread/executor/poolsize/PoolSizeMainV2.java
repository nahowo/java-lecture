package java_adv1.thread.executor.poolsize;

import java_adv1.thread.executor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java_adv1.thread.executor.ExecutorUtils.printState;
import static java_adv1.util.MyLogger.log;

public class PoolSizeMainV2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        log("pool 생성");
        printState(es);
        for (int i = 1; i <= 6; i++) {
            String taskName = "task " + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        es.close();
        log("종료");
    }
}
