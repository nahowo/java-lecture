package java_adv1.thread.cas.spinlock;

import static java_adv1.util.MyLogger.log;

public class SpinLockMain {
    public static void main(String[] args) {
        SpinLock spinLock = new SpinLock();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                spinLock.lock();
                try {
                    log("비즈니스 로직 실행");
                } finally {
                    spinLock.unlock();
                }
            }
        };

        Thread t1 = new Thread(runnable, "thread-1");
        Thread t2 = new Thread(runnable, "thread-2");
        t1.start(); // 두 스레드가 동시에 락 획득
        t2.start();
    }
}
