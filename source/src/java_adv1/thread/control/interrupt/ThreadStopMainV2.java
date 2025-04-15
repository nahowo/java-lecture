package java_adv1.thread.control.interrupt;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class ThreadStopMainV2 {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask, "work");

        thread.start();

        sleep(4000);
        log("작업 중단 지시");
        thread.interrupt();
        log("work 스레드 인터럽트 상태 1: " + thread.isInterrupted());
        log("state1: " + thread.getState());
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            log("state0: " + Thread.currentThread().getState());
            try {
                while (true) {
                    log("작업 중...");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                log("work 스레드 인터럽트 상태 2: " + Thread.currentThread().isInterrupted());
                log("interrupt message: " + e.getMessage());
                log("state2: " + Thread.currentThread().getState());
            }
            log("자원 정리");
            log("작업 종료");
        }
    }

}
