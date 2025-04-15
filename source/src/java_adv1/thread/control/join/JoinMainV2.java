package java_adv1.thread.control.join;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class JoinMainV2 {
    public static void main(String[] args) {
        log("start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();
        sleep(3000); // main에 sleep을 주어 대기 -> 정확한 타이밍을 맞추기 어려움

        log("task1.result = " + task1.result);
        log("task2.result = " + task2.result);
        int sum = task1.result + task2.result;
        log("sum = " + sum);

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
