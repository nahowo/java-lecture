package java_adv1.thread.start;


import static java_adv1.util.MyLogger.log;

public class InnerRunnableMainV1 {
    public static void main(String[] args) {
        log("main() start");
        MyRunnable runnable = new MyRunnable();
        for (int i = 0; i < 30; i++) {
            Thread thread1 = new Thread(runnable);
            thread1.start();
        }

        log("main() end");
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            log("run()");
        }
    }

}
