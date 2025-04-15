package java_adv1.thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "main() start"); // Java가 기본으로 생성하는 main 스레드
        HelloThread helloThread = new HelloThread();
        helloThread.run(); // helloThread가 아니라 main 스레드가 run()을 실행

        System.out.println(Thread.currentThread().getName() + "main() end");
    }
}
