package java_adv1.thread.executor.future;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class SumTaskMainV1 {
    public static void main(String[] args) throws InterruptedException {
        log("start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();

        log("join() - main 스레드가 thread1, thread2 종료까지 대기");
        thread1.join();
        thread2.join();
        log("main 스레드 대기 완료");

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
