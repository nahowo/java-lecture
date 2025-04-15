package java_adv1.thread.start;


import static java_adv1.util.MyLogger.log;

public class InnerRunnableMainV2 {
    public static void main(String[] args) {
        log("main() start");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log("run");
            }
        };
        for (int i = 0; i < 30; i++) {
            Thread thread1 = new Thread(runnable);
            thread1.start();
        }

        log("main() end");
    }

}
