package java_adv1.thread.control.test;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class JoinTest1Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyTask(), "thread1");
        Thread t2 = new Thread(new MyTask(), "thread2");
        Thread t3 = new Thread(new MyTask(), "thread3");

        t1.start();
        t1.join(); // 3초

        t2.start();
        t2.join(); // 3초

        t3.start();
        t3.join(); // 3초
        // 총 9초
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
