package java_adv1.thread.start;


import static java_adv1.util.MyLogger.log;

public class InnerRunnableMainV3 {
    public static void main(String[] args) {
        log("main() start");
        for (int i = 0; i < 30; i++) {
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    log("run");
                }
            });
            thread1.start();
        }

        log("main() end");
    }

}
