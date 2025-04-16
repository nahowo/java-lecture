package java_adv1.thread.volatile1;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread work = new Thread(task, "work");
        work.start();

        sleep(1000);
        log("runFlag = false로 변경 시도");
        task.runFlag = false;
        log("task.runFlag: " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {
        volatile boolean runFlag = true;
        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {

            }
            log("task 종료");
        }
    }

}
