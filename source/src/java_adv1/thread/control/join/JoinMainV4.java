package java_adv1.thread.control.join;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class JoinMainV4 {
    public static void main(String[] args) throws InterruptedException {
        log("start");
        SumTask task1 = new SumTask(1, 50);
        Thread thread1 = new Thread(task1, "thread-1");

        thread1.start();

        // 스레드가 종료될 때까지 1초 대기
        log("thread1 완료까지 대기");
        thread1.join(1000);
        log("thread1 완료");

        log("task1.result = " + task1.result);

        log("end");
    }

    static class SumTask implements Runnable {
        private int start;
        private int end;
        private int result = 0;

        public SumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            for (int i = start; i <= end; i++) {
                result += i;
            }
            log("작업 완료; result = " + result);
        }
    }

}
