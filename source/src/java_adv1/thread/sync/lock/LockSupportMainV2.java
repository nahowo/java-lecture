package java_adv1.thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class LockSupportMainV2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ParkTest(), "thread-1");
        thread.start();

        sleep(100);
        log("thread-1 state: " + thread.getState());

        log("main -> unpark(thread-1)");
//        LockSupport.unpark(thread);
    }

    static class ParkTest implements Runnable {
        @Override
        public void run() {
            log("park 시작");
            LockSupport.parkNanos(1000_000000); // 1초
            log("park 종료, state = " + Thread.currentThread().getState());
            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }

}
