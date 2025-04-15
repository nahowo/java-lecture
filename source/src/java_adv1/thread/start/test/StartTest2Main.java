package java_adv1.thread.start.test;

import java_adv1.util.MyLogger;

public class StartTest2Main {
    public static void main(String[] args) {
        CounterRunnable runnable = new CounterRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    static class CounterRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                MyLogger.log("value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
