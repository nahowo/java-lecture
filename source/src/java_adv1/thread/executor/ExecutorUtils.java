package java_adv1.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static java_adv1.util.MyLogger.log;

public abstract class ExecutorUtils {
    public static void printState(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) { // ThreadPollExcutor 구현체로 캐스팅
            int pool = poolExecutor.getPoolSize();
            int active = poolExecutor.getActiveCount();
            int queuedTask = poolExecutor.getQueue().size();
            long completedTask = poolExecutor.getCompletedTaskCount();

            log("[pool = " + pool + ", active = " + active + ", queuedTask = " + queuedTask + ", completedTask = " + completedTask);
        } else {
            log(executorService);
        }
    }

    public static void printState(ExecutorService executorService, String taskName) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) { // ThreadPollExcutor 구현체로 캐스팅
            int pool = poolExecutor.getPoolSize();
            int active = poolExecutor.getActiveCount();
            int queuedTask = poolExecutor.getQueue().size();
            long completedTask = poolExecutor.getCompletedTaskCount();

            log(taskName + " -> [pool = " + pool + ", active = " + active + ", queuedTask = " + queuedTask + ", completedTask = " + completedTask);
        } else {
            log(executorService);
        }
    }
}
