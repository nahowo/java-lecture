package java_adv1.thread.start.test;

public class StartTest1Main {
    public static void main(String[] args) {
        CounterThread thread = new CounterThread();
        thread.start();
    }
}
