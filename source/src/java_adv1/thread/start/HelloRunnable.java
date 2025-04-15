package java_adv1.thread.start;

import java_adv1.util.MyLogger;

import static java_adv1.util.MyLogger.log;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName() + ": run()");
        log("run()");
    }
}
