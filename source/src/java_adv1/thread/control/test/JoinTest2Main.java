package java_adv1.thread.control.test;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class JoinTest2Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyTask(), "thread1");
        Thread t2 = new Thread(new MyTask(), "thread2");
        Thread t3 = new Thread(new MyTask(), "thread3");

        t1.start();

        t2.start();

        t3.start();
        // 총 3초
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                log(i);
                sleep(1000);
            }
        }
    }
}
