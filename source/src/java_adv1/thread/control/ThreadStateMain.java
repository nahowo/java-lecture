package java_adv1.thread.control;

import static java_adv1.util.MyLogger.log;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myRunnable");
        log("myThread.state1 = " + thread.getState());
        log("myThread.start()");
        thread.start();
        Thread.sleep(1000);
        log("myThread.getState3 = " + thread.getState());
        Thread.sleep(4000);
        log("myThread.getState5 = " + thread.getState());
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                log("start");
                Thread thread = Thread.currentThread();
                log("myThread.state2 = " + thread.getState());
                Thread.sleep(3000);
                log("myThread.state4 = " + thread.getState());
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
