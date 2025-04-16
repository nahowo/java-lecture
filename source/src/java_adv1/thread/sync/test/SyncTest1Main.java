package java_adv1.thread.sync.test;

public class SyncTest1Main {
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

        System.out.println("결과: " + counter.getCount()); // 하나의 스레드에서 +1 연산을 진행하는 동안 락을 가지고 있으므로 다른 스레드가 해당 연산(메서드)에 접근할 수 없음 -> 정상적으로 20000 출력
    }
    static class Counter {
        private int count = 0;
        public synchronized void increment() {
            count = count + 1; // synchronized로 막음으로서 한 스레드에서(락을 가짐) count값을 증가시킬 때 다른 스레드가(락을 가지지 못함) 접근 불가능 -> 임계 영역으로 설정
        }

        public int getCount() {
            return count;
        }
    }
}
