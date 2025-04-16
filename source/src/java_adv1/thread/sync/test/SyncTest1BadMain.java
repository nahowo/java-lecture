package java_adv1.thread.sync.test;

public class SyncTest1BadMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("결과: " + counter.getCount()); // 공유 변수의 경우 +1 연산이 중복되어 씹히면 기대값인 20000보다 적을 수 있음
    }
    static class Counter {
        private int count = 0;
        public void increment() {
            count = count + 1; // 공유 변수인 경우 두 스레드에서 동시에 실행되는 연산이 있을 수 있음 -> count값이 개별로 10 + 1 -> 11 + 1이 되는 것이 아니라 동시에 접근한 10에 대해 10 + 1, 10 + 1이 되어 결과가 12가 아닌 11이 될 수 있음!
        }

        public int getCount() {
            return count;
        }
    }
}
