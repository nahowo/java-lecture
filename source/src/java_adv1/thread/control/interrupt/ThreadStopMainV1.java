package java_adv1.thread.control.interrupt;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class ThreadStopMainV1 {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask, "work");

        thread.start();

        sleep(4000);
        log("작업 중단 지시");
        myTask.runFlag = false;
    }

    static class MyTask implements Runnable {
        volatile boolean runFlag = true;
        @Override
        public void run() {
            while (runFlag) {
                log("작업 중...");
                sleep(3000);
            }
            log("자원 정리");
            log("작업 종료");
        }
    }

}
