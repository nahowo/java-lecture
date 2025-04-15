package java_adv1.thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "main() start"); // Java가 기본으로 생성하는 main 스레드
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // daemon 생성 이후 10초 이전에 모든 사용자 스레드가 종료되었으므로 daemon도 종료
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + "main() end");
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}
