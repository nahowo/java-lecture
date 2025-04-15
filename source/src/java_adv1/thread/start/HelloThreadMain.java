package java_adv1.thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "main() start"); // Java가 기본으로 생성하는 main 스레드
        HelloThread helloThread = new HelloThread();
        helloThread.start();

        System.out.println(Thread.currentThread().getName() + "main() end");
    }
}
