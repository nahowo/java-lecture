package java_adv1.thread.volatile1;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread work = new Thread(task, "work");
        work.start();

        sleep(1000);
//        log("runFlag = false로 변경 시도");
        task.runFlag = false;
        log("task.runFlag = " + task.runFlag + ", count = " + task.count);
//        log("main 종료");
    }

    static class MyTask implements Runnable {
        volatile boolean runFlag = true;
        long count;
        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {
                count ++;
                if (count % 100_000_000 == 0) {
                    log("flag = " + runFlag + ", count = " + count);
                }
            }
            log("task 종료, count = " + count);
        }
    }

}
