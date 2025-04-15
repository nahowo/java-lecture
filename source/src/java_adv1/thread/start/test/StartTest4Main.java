package java_adv1.thread.start.test;

import static java_adv1.util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new ThreadRunnable("A", 1000), "Thread-A");
        Thread threadB = new Thread(new ThreadRunnable("B", 500), "Thread-B");

        threadA.start();
        threadB.start();
    }

    static class ThreadRunnable implements Runnable {
        private String message;
        private int time;

        public ThreadRunnable(String message, int time) {
            this.message = message;
            this.time = time;
        }

        @Override
        public void run() {
            while (true) {
                log(message);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
