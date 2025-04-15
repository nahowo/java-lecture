package java_adv1.thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "main() start"); // Java가 기본으로 생성하는 main 스레드
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);
        thread.start();


        System.out.println(Thread.currentThread().getName() + "main() end");
    }
}
