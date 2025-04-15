package java_adv1.thread.control.yield;

import static java_adv1.util.ThreadUtils.sleep;

public class YieldMain {
    public static final int THREAD_COUNT = 100;
    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-" + i);
//                sleep(1);
                Thread.yield();
            }
        }
    }

}
